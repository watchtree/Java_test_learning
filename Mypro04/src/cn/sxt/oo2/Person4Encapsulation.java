package cn.sxt.oo2;
/**
 * 
 * @author tree
 *
 */
public class Person4Encapsulation {
	private int id;
	private String name;
	private int age;
	private boolean man;
	
	//�Ҽ�source ����getter��setter
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isMan() {
		return man;
	}
	public void setMan(boolean man) {
		this.man = man;
	}
	
	
	
//	public void setName(String name){
//		this.name = name;
//	}
//	
//	public String getName(){
//		return this.name;
//	}
//	public void setAge(int age){
//		if(age>=1&&age<=130){
//			this.age = age;
//		}else{
//			System.out.println("��������������");
//		}
//		
//	}
//	public int getAge(){
//		return this.age;
//	}
	
	
	
}


