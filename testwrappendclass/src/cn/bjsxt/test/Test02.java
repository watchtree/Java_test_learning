package cn.bjsxt.test;
/**
 * �����Զ�ת��Ͳ���
 * @author tree
 *
 */
public class Test02 {
	public static void main(String[] args) {
//		Integer a = new Integer(1000);
		Integer a = 1000;//jdk5.0֮���ڱ���ʱ�����ж��Զ�װ��Integer a = new Integer(1000)
		Integer b = 2000;
		
		int c = new Integer(1500);//�������Ľ���new Integer(1500).intValue()
		int d = b;//�������Ľ�b.intValue();
		System.out.println(d);
		
		Integer f = 1234;
		Integer f2 = 1234;
		System.out.println(f==f2);
		System.out.println(f.equals(f2));
		
		System.out.println("#############");
		Integer f3 = -129; //[-129,127]֮���������Ȼ���������������ʹ���
		Integer f4 = -129;
		System.out.println(f3==f4);
		System.out.println(f3.equals(f4));
		
	}
}