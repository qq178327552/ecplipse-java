package _a18_设计模式._8_组合结构型设计模式;
/**
 * 叶子构件
 * 	文件杀毒,文件为叶子构件,文件下没有子节点
 * @author zheng
 *
 */
public class Leaf_File implements Component_IAbstractFile{
	@Override
	public void killVirus() {
		System.out.println("文件杀毒");
	}
}
