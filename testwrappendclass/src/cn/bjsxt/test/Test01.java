package cn.bjsxt.test;
/**
 * ���԰�װ������÷�
 * @author tree
 *
 */
public class Test01 {
	public static void main(String[] args) {
		Integer i = new Integer(1000);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.toHexString(i));//��i����ת��Ϊ16�����ַ���
		Integer i2 = Integer.parseInt("234");//����ʮ����ת��Ϊ����
		Integer i3 = new Integer("333");
		System.out.println(i2+10);
		System.out.println(i2.intValue());
		
		String str =234+"";
	}
}
