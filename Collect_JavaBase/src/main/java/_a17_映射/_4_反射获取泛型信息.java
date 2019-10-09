package _a17_映射;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
/**
 * 通过反射获取泛型信息
 * 
 * 1.获得指定方法参数泛型信息
 * 2.获得指定方法返回值泛型信息
 * 
 * @author zheng
 */
public class _4_反射获取泛型信息 {
	public void test01(Map<String,_1_测试用户Bean类> map,List<_1_测试用户Bean类> list){
		System.out.println("Demo04.test01()");
	}
	public Map<Integer,_1_测试用户Bean类> test02(){
		System.out.println("Demo04.test02()");
		return null;
	}
	public static void main(String[] args) {
		try {
			/*1.获得指定方法参数泛型信息*/
			Method m = _4_反射获取泛型信息.class.getMethod("test01", Map.class,List.class);//先获取方法
			Type[] t = m.getGenericParameterTypes();//获得所有带泛型的参数类型(Map<java.lang.String, test._7_reflection._1_UserBean>)
			for (Type paramType : t) {
				System.out.println("#"+paramType);
				if(paramType instanceof ParameterizedType){//是否为参数类型
					Type[] genericTypes = ((ParameterizedType) paramType).getActualTypeArguments();//强制转型为带泛型的参数类型
					for (Type genericType : genericTypes) {
						System.out.println("泛型类型："+genericType);
					}
				}
			}
			separate("2.获得指定方法返回值泛型信息");
			/*2.获得指定方法返回值泛型信息*/
			Method m2 = _4_反射获取泛型信息.class.getMethod("test02", null);
			Type returnType = m2.getGenericReturnType();// 获得返回值类型
			if (returnType instanceof ParameterizedType) {
				Type[] genericTypes = ((ParameterizedType) returnType).getActualTypeArguments();
				for (Type genericType : genericTypes) {
					System.out.println("返回值，泛型类型：" + genericType);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void separate(String text) {
		System.out.println("**********************" + text + "**********************");
	}
}
