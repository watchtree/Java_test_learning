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
		System.out.println("�ɻ�������������");
	}
}

class Man implements Flyable{
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("��������");
	}
}

class Stone implements Flyable, Attack{
	//ʵ�ֶ���ӿڣ����ض���淶
	
	int weight;
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("ʯͷ�ӳ�ȥ");
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("ʯͷ���� ");
	}
	
}