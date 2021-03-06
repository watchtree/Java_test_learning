package cn.bjsxt.myCollection;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * 模拟实现jdk中的arrayList类
 * @author tree
 *
 */
public class MyArrayList {
	Object[] value;
	
    int size;

    public MyArrayList(){
//    	value = new Object[16];
    	this(16);//调用自身构造器 public MyArrayList(int size){
    }
    public MyArrayList(int size){
    	value = new Object[size];
    }
    
    public int size(){
    	return size;
    }
    
    public void add(Object obj){
    	value[size]= obj;
    	size++;
    	if(size>=value.length){
    		//扩容
    		int newCapacity = value.length*2;
    		Object[] newList = new Object[newCapacity];
    		//拷贝将就容器装入新容器
    		for(int i=0; i<value.length;i++){
    			newList[i]= value[i];
    		}
    		value = newList;
    	}
    }
    
    public Object get(int index){
    	if(index<0||index>size-1){
    		try{
    			throw new Exception();//手动抛出异常
    		} catch (Exception e){
    			e.printStackTrace();
    		}
    		
    	}
    	return value[index];
    	
    }
    
    public static void main(String[] args) {
		MyArrayList list =  new MyArrayList(2);
		list.add("wtt");
		list.add(new Human("wtt"));
		list.add("war");
		list.add("war3");
		
		Human human = (Human) list.get(1);//已知其Human，强制转型
		System.out.println(human.getName());
		System.out.println(list.get(2));
		System.out.println(list.size);
	}
}
