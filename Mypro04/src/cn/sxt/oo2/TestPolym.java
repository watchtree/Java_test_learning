package cn.sxt.oo2;
/**
 * 
 * @author tree
 *
 */


/*final �������಻�ɼ̳�*/
class Aniaml{
	public void shout(){
		System.out.println("����һ��");
	}
}

class Dog extends Aniaml{
	public /*final����������д*/void shout(){
		System.out.println("������");
	}
	public void seeDoor(){
		System.out.println("������");
	}
}

class Cat extends Aniaml{
	@Override
	public void shout() {
		// TODO Auto-generated method stub
		System.out.println("������");
	}
}
public class TestPolym {
	public static void main(String[] args) {
		
		animalCry(new Aniaml());
		animalCry(new Dog());
		animalCry(new Cat());
		System.out.println();
		
		
		Cat a1 = new Cat(); 
		//���϶��¿���ת��,����catת����animal
		//���ľ�������һ��͵�����һ��ķ������������˳���Ŀ���չ��
		//����ʱ��Ϊa1��animalʵ����cat������һ������cat���
		animalCry(a1);
		
		System.out.println();
		
		Aniaml a2 = new Dog();
		animalCry(a2);
		//ǿ��ת��
		Dog dog = (Dog)a2;
		dog.seeDoor();
		
		System.out.println();
		
		Aniaml c = new Cat();
		animalCry(c);
		//ǿ��ת�ͳɹ�ͨ�����룬�������г���java.lang.ClassCastException:cn.sxt.oo2.Cat cannot be cast to cn.sxt.oo2.Dog
		//at cn.sxt.oo2.TestPolym.main(TestPolym.java:57)
//		Dog d3 = (Dog)c;
//		d3.seeDoor();
		
	}
	//��̬
	static void animalCry(Aniaml a){
		a.shout();
	}
}
