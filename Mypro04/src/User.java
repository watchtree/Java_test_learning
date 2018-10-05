/**
 * 
 * @author tree
 *
 **/

public class User {
	int id;
	String name;
	String pwd;
	
	public User(){
		
	}
	
	public User(int id, String name){
		super();//构造方法的第一句总是super，不写会默认补全
		System.out.println("正在初始化已经创建好的对象"+this);
		this.id = id;
		this.name = name;	
	}
	
	public void login(){
		System.out.println(this.name +",要登陆");
	}

	
	public static void main(String[] args) {
		User u3 = new User(101, "wtt");
		System.out.println("打印对象"+u3);
		u3.login();
	}
	
}
