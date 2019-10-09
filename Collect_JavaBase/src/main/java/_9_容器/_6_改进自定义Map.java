package _9_容器;
import java.util.LinkedList;
/**
 * 自定义Map的升级版： 
 * 		提高查询的效率(引用hashCode)
 */
public class _6_改进自定义Map {
	LinkedList[] arr = new LinkedList[9]; // Map的底层结构就是：数组+链表!
	int size;
	public void put(Object key, Object value) {
		SxtEntry e = new SxtEntry(key, value);
		int hash = key.hashCode();
		hash = hash < 0 ? -hash : hash;
		int a = hash % arr.length;
		if (arr[a] == null) {
			LinkedList list = new LinkedList();
			arr[a] = list;
			list.add(e);
		} else {
			LinkedList list = arr[a];
			for (int i = 0; i < list.size(); i++) {
				SxtEntry e2 = (SxtEntry) list.get(i);
				if (e2.key.equals(key)) {
					e2.value = value; // 键值重复直接覆盖！
					return;
				}
			}
			arr[a].add(e);
		}
	}
	public Object get(Object key) {
		int a = key.hashCode() % arr.length;
		if (arr[a] != null) {
			LinkedList list = arr[a];
			for (int i = 0; i < list.size(); i++) {
				SxtEntry e = (SxtEntry) list.get(i);
				if (e.key.equals(key)) {
					return e.value;
				}
			}
		}
		return null;
	}
	public static void main(String[] args) {
		_6_改进自定义Map m = new _6_改进自定义Map();
		m.put("高琪", new Wife("杨幂"));
		m.put("高琪", new Wife("李四"));
		Wife w = (Wife) m.get("高琪");
		System.out.println(w.name);
	}
}