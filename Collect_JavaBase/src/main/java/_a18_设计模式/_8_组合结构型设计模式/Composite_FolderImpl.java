package _a18_设计模式._8_组合结构型设计模式;

import java.util.ArrayList;
import java.util.List;
/**
 * 容器构件
 * 	用于指定文件夹,文件夹中可以存放文件(叶子)或者别的文件夹(容器)
 * @author zheng
 *
 */
public class Composite_FolderImpl implements Component_IAbstractFile{
	/*存放子节点(子节点可以是文件或者文件夹,所以统一存放其接口)*/
	private List<Component_IAbstractFile> list = new ArrayList<Component_IAbstractFile>();
	public void add(Component_IAbstractFile file){
		list.add(file);
	}
	
	@Override
	public void killVirus() {
		System.out.println("文件夹杀毒");
	}
}
