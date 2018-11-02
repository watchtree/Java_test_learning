package cn.bjsxt.test;

import java.util.Date; //util工具包

public class TestDate {
	public static void main(String[] args) {
		Date d = new Date();
		long t = System.currentTimeMillis();
		System.out.println(t);
		Date d2 = new Date(1000);

		
		System.out.println(d2);
		System.out.println(d2.toGMTString()); //转化为本地时间，否则默认到北京时间
		d2.setTime(2000);
		System.out.println(d2);
		System.out.println(d2.getTime());//获得时间值
		System.out.println(d.getTime()<d2.getTime());
	}
}
