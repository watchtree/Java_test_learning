package cn.sxt.oo2;

public class TestEquals {
	public static void main(String[] args) {
		Object obj;
		String str;
		
		User u1 = new User(100, "wtt", "123456");
		User u2 = new User(100, "wtt", "123456");
		
		System.out.println(u1==u2);
		System.out.println(u1.equals(u2));
		
		String str1 = new String("sxt");
		String str2 = new String("sxt");
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
	}
}

class User{
	int id;
	String name;
	String pwd;
	public User(int id, String name, String pwd) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
	}
	
	public boolean equals(Object obj){
		if(obj==null){
			return false;
		}else{
			if(obj instanceof User){
				User c = (User)obj;
				if(id == this.id){
					return true;
				}
			}
		}
		return false;
	}
	
	
	//�Ҽ�source�Զ�����generate hashcode and equals
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + id;
//		return result;
//	}
//
//
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())//�Ƚ�����
//			return false;
	
//		User other = (User) obj;//ǿ��ת��
//		if (id != other.id)
//			return false;
//		return true;
//	}
}