package cn.bjsxt.oop.abstractClass;
 
public abstract/*�������󷽷������ǳ�����*/ class Animal {
	//���Զ��������ƣ�������Ҫ����ȥ��ɣ�
	//�����ڽ������������ʵ�ַ����� �����ڷֹ���ҵ
	//������˵ÿһ�����඼��Ҫ��д���ɴ�Ͳ���run��������
	public abstract void run();//���󷽷���û��ʵ�֣�ֻ�ж���
	
	//Ҳ���Զ�����ͨ����������
	public void breath(){
		System.out.println("������");
	}
	
	public Animal(){
		System.out.println("����һ������");
	}//��Ϊ���� �������Ե��ã����ǲ���ʵ����
	
	String str;
}

//abstract class Cat extends Animal{
//	
//}
//�ĳɳ�����


//�൱���ṩһ�ֹ淶��������д�������Ӧ����
class Cat extends Animal{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("è��");
	}//��������ʱ�����趨���󷽷�
	
}
class Dog extends Animal{
	
	public void run(){
		System.out.println("����");
	}
}
