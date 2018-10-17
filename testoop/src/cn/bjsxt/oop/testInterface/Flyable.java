package cn.bjsxt.oop.testInterface;

public interface Flyable {
	int MAX_SPEED = 11000;
	int MIN_HEIGHT = 1;
	void fly();
	
}

interface Attack{
	void attack();
}

class Plane implements Flyable{
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("飞机依靠发动机飞");
	}
}

class Man implements Flyable{
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("人跳起来");
	}
}

class Stone implements Flyable, Attack{
	//实现多个接口，遵守多个规范
	
	int weight;
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("石头扔出去");
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("石头攻击 ");
	}
	
}