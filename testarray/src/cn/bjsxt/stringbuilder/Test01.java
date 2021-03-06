package cn.bjsxt.stringbuilder;
/**
 * String：不可变字符序列
 * 测试可变字符序列。StringBuilder（线程不安全、效率高），StringBuffer（线程安全、效率低）
 * @author tree
 *
 */
public class Test01 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();//根据源码可知这里创建初始化了一个长度为16的数组
		StringBuilder sb1 = new StringBuilder(32);//字符串长度为32
		StringBuilder sb2 = new StringBuilder("avbc");//创建4+16的字符串数组长度 
		
		
		//有很多重载方法都可用
		sb2.append("efg");
		sb2.append(true).append(321).append("随便");//通过returnthis实现方法链
		System.out.println(sb2);
	}
}
