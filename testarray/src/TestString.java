/**
 * ��ҵ��
 * ��ϰString��ĳ��÷���
 * �������鿴Դ��
 * ��ߣ��Ķ�String������ط�����Դ��
 * @author tree
 *
 */
public class TestString {
	public static void main(String[] args) {
		String str =new String("abcd");
		char[] c = {'a', 'b'};
		String str1 = new String(c);
		
		String str2 = str;
		String str3 = new String("abcd");
		System.out.println(str.charAt(2)); //����
		System.out.println(str2.equals(str));
		System.out.println(str3.equals(str));//�Ƚ������Ƿ����
		
		String str4 = "def";
		String str5 = "def";
		System.out.println(str4.equals(str5));
		System.out.println(str4==str5);
		System.out.println(str3.indexOf('b'));
		
		System.out.println(str3.indexOf('f'));
		String s = str3.substring(2);//����һ���µ��ַ�����ָ��������ʼ
		String str6 = str3.replace('a', '*');//�滻
		System.out.println(str6);
		
		String str7 = "abcde,rrtt,cccee";
		String[] strArray = str7.split(",");
		for(int i=0;i<strArray.length;i++){
			System.out.println(strArray[i]);
		}
		
		String str8 = "  aa  bb  ";
		String str88 = str8.trim();//ȥ����β���пո�
		System.out.println(str88.length());
	}
					
}