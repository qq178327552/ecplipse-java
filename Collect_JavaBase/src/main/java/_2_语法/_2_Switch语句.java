package _2_语法;

/**
 * 测试swtich语句
 * 
 * 1.测试if多选择结构 
 * 2.测试switch多选择结构 
 * 3.反过来利用了case穿透现象 
 * 4.case可以是表达式,但不能含变量
 * 5.case和default可交换位置,不影响结果
 * 6.测试JDK7中的switch新特性--判断条件可以为字符串
 * 
 * @author zheng
 *
 */
public class _2_Switch语句 {
	public static void main(String[] args) {
		double d = Math.random();
		int e = 1 + (int) (d * 6);

		separate("1.测试if多选择结构");
		if (e == 6)
			System.out.println("运气非常好！");
		else if (e == 5)
			System.out.println("运气很不错！");
		else if (e == 4)
			System.out.println("运气还行吧");
		else // 1,2,3
			System.out.println("运气不好！");

		separate("2.测试switch多选择结构");
		switch (e) { // int,或者自动可以转为int的类型(byte,char,short)。枚举。//JDK7中可以放置字符串。
		case 6:
			System.out.println("运气非常好！");
			break; // 一般在每个case后面都要加break，防止出现case穿透现象。
		case 5:
			System.out.println("运气很不错！");
			break;
		case 4:
			System.out.println("运气还行吧");
			break;
		default:
			System.out.println("运气不好！");
			break;
		}

		separate("3.反过来利用了case穿透现象");
		char c = 'a';
		int rand = (int) (26 * Math.random());
		char c2 = (char) (c + rand);
		System.out.print(c2 + ": ");
		switch (c2) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("元音");
			break;
		case 'y':
		case 'w':
			System.out.println("半元音");
			break;
		default:
			System.out.println("辅音");
		}
		
		separate("4.case可以是表达式,但不能含变量");
		switch (1) {
		case 2-1:
			System.out.println("2-1");
			break;
		}
		
		separate("5.case和default可交换位置,不影响结果");
		switch (2) {
		default:
			System.out.println("其他");
			break;
		case 2-1:
			System.out.println("2-1");
			break;
		}
		
		separate("6.测试JDK7中的switch新特性--判断条件可以为字符串");
		String a = "高琪";
		switch (a) { // JDK7的新特性，表达式结果可以是字符串！！！
		case "马士兵":
			System.out.println("输入的马士兵");
			break;
		case "高琪":
			System.out.println("输入的高琪");
			break;
		default:
			System.out.println("大家好！");
			break;
		}
	}

	public static void separate(String text) {
		System.out.println("**********************" + text + "**********************");
	}
}
