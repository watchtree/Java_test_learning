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
		super();//���췽���ĵ�һ������super����д��Ĭ�ϲ�ȫ
		System.out.println("���ڳ�ʼ���Ѿ������õĶ���"+this);
		this.id = id;
		this.name = name;	
	}
	
	public void login(){
		System.out.println(this.name +",Ҫ��½");
	}

	
	public static void main(String[] args) {
		User u3 = new User(101, "wtt");
		System.out.println("��ӡ����"+u3);
		u3.login();
	}
	
}
