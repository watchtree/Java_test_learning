package cn.sort.innerType;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
//import cn.sort.innerType.StringComp.Com;
import javax.naming.ldap.SortControl;

/**
 * ����
 * @author tree
 *
 */
public class Utils {
	/*
	 * List����+�Ƚ���
	 */
	public static <T> void sort (List<T> list, Comparator<T> com){
		Object[] arr = list.toArray();
		sort(arr, com);
		for(int i=0;i<arr.length;i++){
			list.set(i, (T)arr[i]);
		}
	}
	
	/*
	 * ��������򣨽���+Comparator�ӿ�
	 */

	public static void sort(Object[] arr, Comparator com){

		boolean sorted = true;
		int len = arr.length;
		System.out.println("===");
		for(int j=0;j<len;j++){
			sorted = true;
			
			for(int i=0;i<len-1-j;i++){
				if(com.compare(arr[i], arr[i+1])<0){
					Object temp = arr[i];
					arr[i]= arr[i+1];
					arr[i+1] = temp;
					sorted = false;
				}
				System.out.println(Arrays.toString(arr));
			}
			if(sorted){
				break; 
			}
		}
		System.out.println("===");
	}
	
	/*
	 * ��������
	 */
	public static <T extends Comparable<T>> void sort(List<T> list){
		//��ת����
		Object[] arr = list.toArray();
		sort(arr);
		for(int i=0;i<arr.length;i++){
			list.set(i, (T) arr[i]);
		}
		
	}
	
	
	/*
	 * ʹ�÷��ͷ���
	 */
	public static <T extends Comparable<T>> void sort(T[] arr) {
		boolean sorted = true;
		int len = arr.length;
		for(int j=0;j<len;j++){
			sorted = true;
			for(int i=0;i<len-1-j;i++){
				if(((Comparable)arr[i]).compareTo(arr[i+1])>0){
					T temp = arr[i];
					arr[i]= arr[i+1];
					arr[i+1] = temp;
					sorted = false;
				}
//				System.out.println(Arrays.toString(arr));
			}
			if(sorted){
				break; 
			}
		}
	}
	
	
	/*
	 * �����������
	 */
	public static void sort(Object[] arr) {
		boolean sorted = true;
		int len = arr.length;
		for(int j=0;j<len;j++){
			sorted = true;
			for(int i=0;i<len-1-j;i++){
				if(((Comparable)arr[i]).compareTo(arr[i+1])<0){
					Object temp = arr[i];
					arr[i]= arr[i+1];
					arr[i+1] = temp;
					sorted = false;
				}
//				System.out.println(Arrays.toString(arr));
			}
			if(sorted){
				break; 
			}
		}
	}
}