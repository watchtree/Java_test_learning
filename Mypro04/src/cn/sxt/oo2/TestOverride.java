package cn.sxt.oo2;
/**
 * ������д
 * @author tree
 *
 */
public class TestOverride {
	public static void main(String[] args) {
		Horse h = new Horse();
		h.run();
	}
}

class Vehicle{
	public void run(){
		System.out.println("�ܡ�����");
		
	}
	
	public void stop(){
		System.out.println("��ֹ������");
	}
	
	public Person whoIsPsg(){
		//void �޷���ֵ�� person�з���ֵ����return��Ӧ
		return new Person();
	}
}

class Horse extends Vehicle{
	public void run(){
		System.out.println("�õõ�");
	}
	//������д
//	public Person whoIsPsg(){
//		return new Person();
//	}//����ʹ��
	public Student whoIsPsg(){//����ֵ����С�ڵ��ڸ��������
		return new Student();
	}////����ʹ��
//	public Object whoIsPsg(){
//		return new Object();
//	}//��д�������ԭ��
}