/**
 * String成为不可变字符序列
 * 作业：
 * 练习String类的常用方法
 * 结合数组查看源码
 * 提高：阅读String类中相关方法的源码
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
		System.out.println(str.charAt(2)); //索引
		System.out.println(str2.equals(str));
		System.out.println(str3.equals(str));//比较内容是否相等
		
		String str4 = "def";
		String str5 = "def";
		System.out.println(str4.equals(str5));
		System.out.println(str4==str5);
		System.out.println(str3.indexOf('b'));
		
		System.out.println(str3.indexOf('f'));
		String s = str3.substring(2);//返回一个新的字符串从指定索引开始
		String str6 = str3.replace('a', '*');//替换
		System.out.println(str6);
		
		String str7 = "abcde,rrtt,cccee";
		String[] strArray = str7.split(",");
		for(int i=0;i<strArray.length;i++){
			System.out.println(strArray[i]);
		}
		
		String str8 = "  aa  bb  ";
		String str88 = str8.trim();//去除首尾所有空格
		System.out.println(str88.length());
		
		//忽视大小写比较字符串
		System.out.println("ABC".equalsIgnoreCase("abc"));
		
		//从前检查字符串索引和从后检查
		System.out.println("Abcbd".indexOf('b'));
		System.out.println("Abcbd".lastIndexOf('b'));
		
		//是否为语句开头或末尾
		System.out.println("Abcbd".startsWith("Ab"));
		System.out.println("Abcbd".endsWith("bd"));
		
		
		//转大写和小写
		System.out.println("Abcbd".toLowerCase());
		System.out.println("Abcbd".toUpperCase());
		
		System.out.println("#####################");
		
		String gh = "a";
		for (int i=0; i < 10; i++){
			gh += i;
		}//这样会导致空间的浪费，导致对象过多（11个对象）
		System.out.println(gh);
		
		
		String gh1 = new String("a");//代表两个对象一个“a"一个newString对象
		for (int i=0; i < 10; i++){
			gh1 += i;
		}//这样会导致空间的浪费，导致对象过多（12个对象）
		System.out.println(gh1);	
		
		
		//改进利用StringBuilder
		StringBuilder gh2 = new StringBuilder("a");//建立16+1的字符串
		for (int i = 0;i < 1000; i++){
			gh2.append(i);//数组自带扩容append过程
		}//节省了对象空间 
		System.out.println(gh2);
	}
			 		
}
