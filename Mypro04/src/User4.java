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
		//��ʱ����TestparameterTransfer01����u1��ַ���ݽ�u1��ַ����u����u1.name�ı�
		u1.TestParameterTransfer01(u1);
		System.out.println(u1.name);
		
		//����u1��ַ���ݽ�u1��ַ����u�����Ǵ�ʱ�½��˶����µ�ַ��ֵ��u��u.name�ڽ��иı���u1�޹�
	
		u1.TestParameterTransfer02(u1);
		System.out.println(u1.name);		
	}
}
