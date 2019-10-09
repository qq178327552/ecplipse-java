package _a18_设计模式._3_建造者创建者设计模式;
/**
 * 建造者设计模式
 * 	主要分为一个构建(builder)和装配(director)来构建多个对象组合的对象
 * 	适用于某对象构建过程复杂的情况
 * 	先由构建者构建出各个零件,再根据构建者对象,装配出综合的新复杂对象
 * @author zheng
 *
 */
public class Main {
	public static void main(String[] args) {
		/*先实例化构建者,先构建出车和房对象*/
		Builder_ICarhHome builder_CarHome = new Builder_CarHomeImpl();
		/*根据构建者构建的实例化对象,实例化装配者*/
		Director_PeopleImpl director = new Director_PeopleImpl(builder_CarHome);
		/*最后根据装配者,开始装配人对象*/
		Bean_People people = director.directPeople();
	}
}
/*
应用场景:
*/