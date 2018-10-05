/**
 * 
 * @author tree
 *
 */
public class User2 {
	int id;
	String name;
	String pwd;
	static String company = "华电";
	//加入static相当于加入到类里 ，一般变量是属于对象的
	
	public User2(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public void login(){
		//非静态方法里可以调用静态方法
		printCompany();
		System.out.println("登陆" + name);
		
	}
	
	public static void printCompany(){
		//login();//静态方法中不能调用非静态方法
		System.out.println(company);
	}
	
	public static void main(String[] args) {
		User2 u = new User2(101,"wtt");
		User2.printCompany();
		User2.company = "北京";
		User2.printCompany();
	}
}
