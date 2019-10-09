package _4_数组;

/**
 * 模拟实现JDK中提供的ArrayList类
 * 
 * 1.创建存放数组集合的容器 
 * 2.创建数组集合的大小 
 * 3.创建传入参数构造方法，表示数组集合创建大小 
 * 4.创建无参构造方法，默认数组集合创建大小为10
 * 5.向集合中添加对象，当集合超出定义的大小时扩容(通过重新创建2倍大的容器然后赋值新容器方式扩容) 
 * 6.判断集合是否为空 
 * 7.获取集合的大小
 * 8.根据输入的索引判断索引是否在集合内 
 * 9.根据索引获取集合的值(先判断索引是否在集合内) 
 * 10.根据输入的对象判断索引(从开始遍历)
 * 11.根据输入的对象判断索引(从末尾遍历) 
 * 12.根据索引和对象在相应位置插入集合中
 * 
 * @author zheng
 *
 */
public class _4_ArrayList类型 {
	public static void main(String[] args) {
		CreateArrayList a = new CreateArrayList();
	}
}

class CreateArrayList {
	/* 创建存放数组集合的容器 */
	private Object[] value;
	/* 创建数组集合的大小 */
	private int size;

	/* 创建传入参数构造方法，表示数组集合创建大小 */
	public CreateArrayList(int size) {
		if (size < 0) {
			try {
				throw new Exception(); // 手动抛出一个异常。 讲到异常章节再说，先混个眼熟
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		value = new Object[size];
	}

	/* 创建无参构造方法，默认数组集合创建大小为10 */
	public CreateArrayList() {
		this(10);
	}

	/* 向集合中添加对象，当集合超出定义的大小时扩容(通过重新创建2倍大的容器然后赋值新容器方式扩容) */
	public void add(Object obj) {
		value[size] = obj;
		size++;
		if (size >= value.length) {
			// 装不下了。扩容吧！
			int newCapacity = value.length * 2;
			Object[] newList = new Object[newCapacity];
			// System.arraycopy(src, srcPos, dest, destPos, length);

			for (int i = 0; i < value.length; i++)
				newList[i] = value[i];

			value = newList;
		}
	}

	/* 判断集合是否为空 */
	public boolean isEmpty() {
		return size == 0;
	}

	/* 获取集合的大小 */
	public int size() {
		return size;
	}

	/* 根据输入的索引判断索引是否在集合内 */
	public void rangeCheck(int index) {
		if (index < 0 || index > size - 1) { // [0,size-1]
			try {
				throw new Exception(); // 手动抛出一个异常。 讲到异常章节再说，先混个眼熟
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/* 根据索引获取集合的值(先判断索引是否在集合内) */
	public Object get(int index) {
		rangeCheck(index);
		return value[index];
	}

	/* 根据输入的对象判断索引(从开始遍历) */
	public int indexOf(Object obj) {
		if (obj == null)
			return -1;
		else {
			for (int i = 0; i < value.length; i++) {
				if (obj == value[i])
					return i;
			}
			return -1;
		}
	}

	/* 根据输入的对象判断索引(从末尾遍历) */
	public int lastIndexOf(Object obj) {
		if (obj == null)
			return -1;
		else {
			for (int i = value.length - 1; i >= 0; i--) {
				if (obj == value[i])
					return i;
			}
			return -1;
		}
	}

	/* 根据索引和对象在相应位置插入集合中 */
	public Object set(int index, Object object) {
		rangeCheck(index);
		Object old = value[index];
		value[index] = object;
		return old;
	}
}
