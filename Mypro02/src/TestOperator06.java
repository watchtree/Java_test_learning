/**
 * 
 * @author tree
 *
 */
public class TestOperator06 {
	public static void main(String[] args) {
		int score = 50;
		String type = score<60?"不及格":"及格";
		System.out.println(type);
		
		int x = -100; 
		System.out.println(x>0?1:(x==0?0:-1));
		
	}
}
