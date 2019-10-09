package _a18_设计模式._3_建造者创建者设计模式;
/**
 * 构建者,为了装配人对象,而提供构建车对象和房对象
 */
public class Builder_CarHomeImpl implements Builder_ICarhHome{
	@Override
	public Bean_Car builderCar() {
		return new Bean_Car("构建车");
	}

	@Override
	public Bean_Home builderHome() {
		return new Bean_Home("构建房");
	}
}
