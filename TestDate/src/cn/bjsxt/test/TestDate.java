package cn.bjsxt.test;

import java.util.Date; //util���߰�

public class TestDate {
	public static void main(String[] args) {
		Date d = new Date();
		long t = System.currentTimeMillis();
		System.out.println(t);
		Date d2 = new Date(1000);

		
		System.out.println(d2);
		System.out.println(d2.toGMTString()); //ת��Ϊ����ʱ�䣬����Ĭ�ϵ�����ʱ��
		d2.setTime(2000);
		System.out.println(d2);
		System.out.println(d2.getTime());//���ʱ��ֵ
		System.out.println(d.getTime()<d2.getTime());
	}
}