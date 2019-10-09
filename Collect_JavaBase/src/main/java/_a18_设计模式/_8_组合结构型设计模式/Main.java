package _a18_设计模式._8_组合结构型设计模式;
/**
 * 组合模式
 * 	用树形结构来表示部分和整体关系
 * 
 * 	抽象构件角色(Component):定义了叶子和容器的共同点
 * 	容器构件角色(composite):有容器特征,可以包含子节点
 * 	叶子构件角色(leaf):无子节点
 * @author zheng
 *
 */
public class Main {
	public static void main(String[] args) {
		/*因为树的根节点是容器角色,所以先创建容器角色*/
		Composite_FolderImpl f1 = new Composite_FolderImpl();
		/*创建抽象角色,用于存放跟节点下*/
		Component_IAbstractFile f2,f3;
		f2 = new Composite_FolderImpl();
		f3 = new Leaf_File();
		/*加载树形结构*/
		f1.add(f2);
		f1.add(f3);
	}
}
/*
应用场景:
*/