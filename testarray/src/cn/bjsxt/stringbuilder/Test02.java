package cn.bjsxt.stringbuilder;
/**
 * 测试StringBuilder常用方法,可变字符序列
 * @author tree
 *
 */
public class Test02 {
	public static void main(String[] args) {

		StringBuilder sb =  new StringBuilder("abcdefrgdfkhhlmnwdsfzxczx");
		sb.delete(3, 5).delete(3, 5);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		//StringBuffer关键词synchronized 涉及多线程问题
		StringBuffer sb2 = new StringBuffer();
	}
}
