package cn.sxt.arrays;

public class Test01 {
	public static void main(String[] args) {
		int[] arr01 = new int[10];//ָ������10
		double[] arr02;
		String[] arr03 = new String[5];
		User[] arr04 = new User[5];
		
		arr01[0] = 13;
		arr01[1] = 15;
		arr01[2] = 20;
		
		int[] s= null; //��������
		s = new int[10];//���������ռ�
		for(int i = 0; i < 10; i++){
			s[i] = 2*i + 1; //������Ԫ�ظ�ֵ
			System.out.println(s[i]);
		}
		
		arr04[0] = new User(1001, "wtt");
		arr04[1] = new User(1002, "wtt1");
		arr04[2] = new User(1003, "wtt2");
	}
}

class User{
	private int id;
	private String name;
	
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}