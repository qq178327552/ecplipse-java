package com;
/**
 * 当对象的Finalizer方法被执行，对象可以重写finalize()进行自我拯救
 * @author zheng
 *
 */
public class _6_FinalizeAlive {
	public static _6_FinalizeAlive SAVE_HOOK=null;
	public void isAlive(){
		System.out.println("yes,i am still alive");
	}
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("finalize mehtod executed");
		_6_FinalizeAlive.SAVE_HOOK =this;
	}

	public static void main(String[] args) throws Exception {
		SAVE_HOOK = new _6_FinalizeAlive();
		//对象第一次自我拯救成功(因为重写了finalize()方法,自救了一下)
		SAVE_HOOK = null;
		System.gc();
		//因为Finalizer方法优先级很低,暂停0.5秒，等待
		Thread.sleep(500);
		if(SAVE_HOOK != null){
			SAVE_HOOK.isAlive();
		}else{
			System.out.println("no, i am dead");
		}
		
		
		/*下面的代码与上面完全相同,但自救失败(finalize()方法只会被系统自动执行一次,第二次就不会执行了)*/
		SAVE_HOOK=null;
		System.gc();
		//因为Finalizer方法优先级很低,暂停0.5秒，等待
		Thread.sleep(500);
		if(SAVE_HOOK != null){
			SAVE_HOOK.isAlive();
		}else{
			System.out.println("no, i am dead");
		}
		
		
		
		
	}
}
