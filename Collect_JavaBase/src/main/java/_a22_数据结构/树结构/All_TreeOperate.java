package _a22_数据结构.树结构;

import java.util.HashMap;
import java.util.Map;

public class All_TreeOperate {
	public static void putTree(Map<String, Map<String, String>> chilContainerMap, String rootNode, String chilNode) {
		Map<String, String> containerMap = chilContainerMap.get(rootNode);
		if (containerMap == null) {
			containerMap = new HashMap<String, String>();
			chilContainerMap.put(rootNode, containerMap);
		}
		containerMap.put(chilNode, "叶子结点内容");
	}
}
