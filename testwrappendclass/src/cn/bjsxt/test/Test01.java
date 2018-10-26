package cn.bjsxt.test;
/**
 * 测试包装类基本用法
 * @author tree
 *
 */
public class Test01 {
	public static void main(String[] args) {
		Integer i = new Integer(1000);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.toHexString(i));//把i遍历转化为16进制字符串
		Integer i2 = Integer.parseInt("234");//按照十进制转化为数字
		Integer i3 = new Integer("333");
		System.out.println(i2+10);
		System.out.println(i2.intValue());
		
		String str =234+"";
	}
}
