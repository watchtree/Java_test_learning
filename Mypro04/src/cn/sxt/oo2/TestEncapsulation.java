package cn.sxt.oo2;

/**
 * ���Է�װ
 * @author tree
 *
 */
public class TestEncapsulation {
	public static void main(String[] args) {
		Human h = new Human();
//		h.age = 13;//��ʱ���ܸĶ�age
		h.name = "wtt";
		h.height = 239;
		
		Person4Encapsulation p4 = new Person4Encapsulation();
//		p4.age = 14;//����ʽ���޷�����˽������
		p4.setAge(-14);//��ȷ�����������������д���
		p4.setAge(13);//��ȷ�����������������д���
		System.out.println(p4.getAge());

	}
}

class Human2{ //
	private int age;//˽�����ԣ������ɼ���������ã����಻���� private
	
	String name; //ͬһ�������ã�����Ͳ����ã�Ĭ��default
	void sayAge(){
		System.out.println(age);
	}
}

class Boy extends Human2{
	void sayHello(){
//		System.out.println(age);//�����������Ե��ǲ�����˽������
	}
}