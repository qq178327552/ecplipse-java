package _4_数组;

/**
 * 数组
 * 
 * 数组的基本概念--定义和使用数组
 *  	1)数组是相同数据类型(数据类型可以为任意类型)的有序集合 
 *  	2)数组也是对象。数组元素相当于对象的成员变量
 * 		3)数组长度的确定的，不可变的。
 * 数组的基本语法： 
 * 		1)声明 
 * 		2)创建数组对象 
 * 		3)初始化(对数组元素的初始化)
 * 		4)默认初始化：数组元素相当于对象的成员变量，默认值跟成员变量的规则一样。数字0，布尔false,char\u0000,引用：null 
 *		5)动态初始化
 * 		6)静态初始化
 * 
 * 1.创建数组基本类 
 * 	(1)声明创建数组方法 
 * 		1).声明一维数组
 * 		2).声明二维数组 
 * 		3).创建数组对象 
 * 	(2)初始化数组方法 
 * 		1).动态初始化
 * 		2).静态初始化 
 * 	(3)创建的类数组的比较
 * 
 * 2.矩阵常用的算法 类 
 * 	(1)打印指定的矩阵 
 * 	(2)矩阵加法
 * 
 * @author zheng
 *
 */
public class _3_Array类型 {
	public static void main(String[] args) {
		ArrayUse a = new ArrayUse();
	}
}

/* 创建数组基本类 */
class ArrayUse {
	/* 声明创建数组方法 */
	public void statementArray() {
		/* 声明一维数组 */
		int[] i1;// 中括号在类型后的声明
		int i2[];// 中括号在变量后的声明
		StudentArray[] s;// 声明自定义类的数组

		/* 声明二维数组 */
		int[][] i4 = { { 1, 2 }, { 3, 4, 0, 9 }, { 5, 6, 7 } };// 定义整型二维数组，用大括号赋值
		int[][] i5 = new int[3][];// 定义列宽为3的整型二维数组

		/* 创建数组对象 */
		i1 = new int[3];// 创建长度为3的整型数组
		s = new StudentArray[3];// 创建长度为3的学生类数组
	}

	/* 初始化数组方法 */
	public void initArray() {
		int[] i1 = new int[3];
		/* 动态初始化 */
		i1[0] = 3;// 数组+下标初始化
		for (int i = 0; i < i1.length; i++) // for循环初始化
			i1[i] = i;

		/* 静态初始化 */
		int i2[] = { 23, 43, 56, 78 };
		StudentArray[] s = { new StudentArray(), new StudentArray() };
	}

	/* 创建的类数组的比较 */
	public void compareArray() {
		StudentArray[] s1 = { new StudentArray() };
		StudentArray s2 = new StudentArray();
		System.out.println("两次初始化的数组比较：" + (s2 == s1[0]));
	}
}

/* 矩阵常用的算法类 */
class Matrix {
	/* 打印指定的矩阵 */
	public static void print(int[][] c) {
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++)
				System.out.print(c[i][j] + "\t");
			System.out.println();
		}
	}

	/* 矩阵加法 */
	public static int[][] add(int[][] a, int[][] b) {
		int[][] c = new int[a.length][a.length];
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++)
				c[i][j] = a[i][j] + b[i][j];
		}
		return c;
	}
}

/* 创建学生类 */
class StudentArray {
	public StudentArray() {
		System.out.println("学生类");
	}
}