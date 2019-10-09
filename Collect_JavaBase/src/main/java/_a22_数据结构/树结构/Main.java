package _a22_数据结构.树结构;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		Map<String, Map<String, String>> treeContainer=new HashMap<String, Map<String, String>>();
		CreateTreeUtil.putTree(treeContainer, "父节点key", "子节点key1");
		CreateTreeUtil.putTree(treeContainer, "父节点key", "子节点key2");
		System.out.println("第一个叶子节点value值:"+treeContainer.get("父节点key").get("子节点key1"));
		System.out.println("第二个叶子节点value值:"+treeContainer.get("父节点key").get("子节点key2"));
	}
}
