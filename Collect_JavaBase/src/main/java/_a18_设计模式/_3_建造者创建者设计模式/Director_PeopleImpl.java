package _a18_设计模式._3_建造者创建者设计模式;
/**
 * 装配者,根据构建者先构建车对象和房对象,再装配一个人对象(拥有车对象和房子对象)
 */
public class Director_PeopleImpl implements Director_IPeople{
	private Builder_ICarhHome builderPeople;
	
	public Director_PeopleImpl(Builder_ICarhHome builderPeople) {
		this.builderPeople = builderPeople;
		}

	@Override
	public Bean_People directPeople() {
		Bean_Car car = builderPeople.builderCar();
		Bean_Home home = builderPeople.builderHome();
		/*构建完车和房子后,开始装配人对象*/
		Bean_People people = new Bean_People();
		people.setCar(car);
		people.setHome(home);
		return people;
	}
}
