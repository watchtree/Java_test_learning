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
	
	//右键source 生成getter和setter
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
//			System.out.println("请输入正常年龄");
//		}
//		
//	}
//	public int getAge(){
//		return this.age;
//	}
	
	
	
}


