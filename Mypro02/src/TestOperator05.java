/**
 * 
 * @author tree
 *
 */
public class TestOperator05 {
	public static void main(String[] args){
		String a = "3";
		int b = 4;
		int c = 5;
		char d = 'a';
		System.out.println(a+b);
		System.out.println(b+c);
		//从左到右计算 加入字符串即变为字符形式
		System.out.println(a+b+c);
		System.out.println(b+c+a);		
		System.out.println(d+4);
	}
}
