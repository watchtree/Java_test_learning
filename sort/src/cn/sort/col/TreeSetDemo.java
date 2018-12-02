package cn.sort.col;
/**
 * �ṩ�˽��ʽҵ��������
 */
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		Person p1 = new Person("p1", 100);
		Person p2 = new Person("p2", 1000);
		Person p3 = new Person("p3", 2000);
		Person p4 = new Person("p4", 50);
		
		//���δ�ŵ�TreeSet������,ʹ�������ҵ���࣬�����ڽ�������ڲ��ࣩ
		TreeSet<Person> persons = new TreeSet<Person>(
					new java.util.Comparator<Person>(){

						@Override
						public int compare(Person o1, Person o2) {
							// TODO Auto-generated method stub
							return o1.getHandsome()-o2.getHandsome();
						}
						
					}
				);
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);//��������ʱ����
		System.out.println(persons);
//		p3.setHandsome(-100);//���ݸ��Ĳ���Ӱ��ԭ��������
		System.out.println(persons);
//		p2.setName("p1");
//		p2.setHandsome(100);
		System.out.println(persons);//�����޸Ŀ��ܻᵼ���ظ�����˲�Ҫ�޸�������final����
		
	}
}