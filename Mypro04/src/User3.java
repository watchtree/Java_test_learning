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
		//��̬�� 
		System.out.println("ִ����ĳ�ʼ������");
		company = "����";
		printCompany();
	}
	
	public static void printCompany(){
		System.out.println(company);
		
	}
	
	public static void main(String[] args) {
		User3 user3=null;
	}
}