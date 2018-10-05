/**
 * 
 * @author tree
 *
 */
public class User4 {
	int id;
	String name;
	String pwd;
	
	public User4(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	
	public void TestParameterTransfer01(User4 u){
		u.name = "wtt";
	}
	
	public void TestParameterTransfer02(User4 u) {
		u = new User4(200, "wttree");
		u.name = "wttree";
	}
	
	public static void main(String[] args) {
		User4 u1 = new User4(100, "tree");
		//此时利用TestparameterTransfer01进行u1地址传递将u1地址赋给u，将u1.name改变
		u1.TestParameterTransfer01(u1);
		System.out.println(u1.name);
		
		//进行u1地址传递将u1地址赋给u，但是此时新建了对象将新地址赋值给u，u.name在进行改变与u1无关
	
		u1.TestParameterTransfer02(u1);
		System.out.println(u1.name);		
	}
}
