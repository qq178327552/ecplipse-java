package _1_引入;

/**
 * 测试标识符的写法
 * 
 * 1.以特殊字符开头命名 
 * 2.错误的命名规范 
 * 3.中文命名
 * 
 * @author zheng
 *
 */
public class _1_标识符的写法 {
	public static void main(String[] args) {
		separate("1.以特殊字符开头命名");
		int $abc = 3;
		int $ = 5;
		int _123 = 5;

		separate("2.错误的命名规范");
		// int 123abc = 6; //标识符不能以数字开头
		// int abc# = 3; //标识符不能包含除了字母、数字、下划线、$之外的其他字符
		// int class = 3;//标识符不能包含关键字

		separate("3.中文命名");
		int 尚学堂 = 10; // java内部采用了Unicode字符集，universal。
	}

	public static void separate(String text) {
		System.out.println("**********************" + text + "**********************");
	}
}
