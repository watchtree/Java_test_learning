/**
 * 
 * @author tree
 *
 */
public class User3 {
	int id;
	String name;
	String pwd;
	
	static String company;
	static{
		//静态块 
		System.out.println("执行类的初始化工作");
		company = "华电";
		printCompany();
	}
	
	public static void printCompany(){
		System.out.println(company);
		
	}
	
	public static void main(String[] args) {
		User3 user3=null;
	}
}
