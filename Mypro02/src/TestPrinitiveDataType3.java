/**
 * 
 * @author tree
 *
 */
public class TestPrinitiveDataType3 {
	public static void main(String[] args){
		char a = 'T';
		char b = '杀';
		
		char c = '\u0061';
		System.out.println(c);
		System.out.println('\n');
		
		//转义字符
		System.out.println('a' + 'b');
		System.out.println("" + 'a'+ '\n' + 'b');
		System.out.println("" + 'a'+ '\t' + 'b');
		System.out.println("" + 'a'+ '\'' + 'b');
		
		//测试布尔类型
		boolean man = true;
		if(man==true){
			System.out.println("男性");
			
		}
	}
}
