/**
 * 
 * @author tree
 *
 */
public class User2 {
	int id;
	String name;
	String pwd;
	static String company = "����";
	//����static�൱�ڼ��뵽���� ��һ����������ڶ����
	
	public User2(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public void login(){
		//�Ǿ�̬��������Ե��þ�̬����
		printCompany();
		System.out.println("��½" + name);
		
	}
	
	public static void printCompany(){
		//login();//��̬�����в��ܵ��÷Ǿ�̬����
		System.out.println(company);
	}
	
	public static void main(String[] args) {
		User2 u = new User2(101,"wtt");
		User2.printCompany();
		User2.company = "����";
		User2.printCompany();
	}
}
