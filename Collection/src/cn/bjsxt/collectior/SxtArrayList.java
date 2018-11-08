package cn.bjsxt.collectior;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.List;

import org.omg.CORBA.OBJ_ADAPTER;

/**
 * 自己实现一个ArrayList
 * @author tree
 *
 */
public class SxtArrayList{
	
	private Object[] elementData;
	
	private int size;
	
	public int size(){
		return size;
	}
	
	public SxtArrayList(){
		this(10);
	}
	public SxtArrayList(int initialCapacity){
		if(initialCapacity < 0){
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		elementData = new Object[initialCapacity];
	}
	
	public void add(Object obj){
		//数组扩容和数据拷贝
		if(size==elementData.length){
			Object[] newArray = new Object[size*2+1];
//			System.arraycopy(elementData, 0, newArray, 0, elementData.length);
			
			for(int i=0;i<elementData.length;i++){
				newArray[i]= elementData[i]; 
			}
			elementData = newArray;
			
		}
		
		elementData[size++]= obj;
//		size++;
	}
	
	public boolean isEmpty(){
		return size==0;
	}
	
	public Object get(int index){
		rangeCheck(index);
		return elementData[index];
	}
	
	public void remove(int index){
		//删除指定位置对象
		//a b c d e
		
		rangeCheck(index);
        int numMoved = size - index - 1;
        if (numMoved > 0)
            System.arraycopy(elementData, index+1, elementData, index,
                             numMoved);
        elementData[--size] = null; // clear to let GC do its work

	}
	
	private void rangeCheck(int index){
		if(index<0||index>= size){
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void remove(Object obj){
		for(int i=0;i<size;i++){
			if(get(i).equals(obj)){//底层调用equals方法而不是== ，值相等则删除
				remove(i);
			}
		}
	}
	
	public Object set(int index, Object obj){
        rangeCheck(index);

        Object oldValue = elementData[index];
        elementData[index] = elementData;
        return oldValue;
		
	}
	
	public void add(int index, Object obj){
		
		rangeCheck(index);
		ensureCapacity();
		
		
		
		System.arraycopy(elementData, index, elementData, index+1, size-index);
		elementData[index]= elementData;
		size++;
	}
	private void ensureCapacity() {
		if(size+1>elementData.length){
			Object[] newArray = new Object[size*2+1];
			System.arraycopy(elementData, 0, newArray, 0, elementData.length);
		}
	}
	public static void main(String[] args) {
		SxtArrayList list = new SxtArrayList(3);
		list.add("333");
		list.add("123");
		list.add("333");
		list.add("333");
		list.add("333");
		System.out.println(list.size());
		System.out.println(list.get(6));
	}
}
