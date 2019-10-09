package com;
/**
 * 测试java栈内存溢出情况
 * 启动时使用:-Xss128k
 * @author zheng
 *
 */
public class _2_StackOverflowError {
	private int stackLength = 1;
	public void stackLeak(){
		stackLength++;
		stackLeak();
	}
	public static void main(String[] args) throws Throwable {
		_2_StackOverflowError oom = new _2_StackOverflowError();
		try{
			oom.stackLeak();
		}catch(Throwable e){
			System.out.println("stack length:"+oom.stackLength);
			throw e;
		}
	}
}
