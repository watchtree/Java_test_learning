package cn.bjsxt.stringbuilder;
/**
 * ����StringBuilder���÷���,�ɱ��ַ�����
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
		
		//StringBuffer�ؼ���synchronized �漰���߳�����
		StringBuffer sb2 = new StringBuffer();
	}
}
