package cn.bjsxt.oop.testInterface;

public interface MyInterface {
	//�ӿ���ֻ�г����ͳ��󷽷�(�����׷����ı�)
	//�ӿ�֧�ֶ�̳�
	public static final String MAX_GREAD = "BOSS";//���峣��ͨ��Ĭ��Ϊ��д�벻д��public static final
	int MAX_SPEED = 120;
	
	public abstract void test01(); //����������private ,���Ȼ��public abstract��д�벻д��
	public int test02(int a, int b);
}
