package _9_容器;

import java.util.Iterator;

public class _a11_自定义Iter迭代器 {
	private String[] elem={"a","b","c"};
	private int size = elem.length;
	public int size(){
		return this.size;
	}
	/*初始化创建迭代器*/
	public Iterator iterator(){
		return new MyIter();
	}
	/*内部类封装对象*/
	private class MyIter implements Iterator{
		private int coursor = -1;
		/* 判断下一个是否存在 */
		public boolean hasNext() {
			return coursor + 1 < size;
		}
		/* 移动下一个 */
		public String next() {
			coursor++;
			return elem[coursor];
		}
		/* 删除下一个 */
		public void remove() {
			System.arraycopy(elem, coursor + 1, elem, size - (coursor + 1), size - (coursor + 1));// 移动数组元素
			size--;// 实际大小-1
			this.coursor--;// 回退
		}
	}
}
