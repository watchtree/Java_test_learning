package cn.sort.bubble;

import java.util.Arrays;

public class BubbleSort1 {
	public static void main(String[] args) {
		int[] arr = {9, 8, 7, 6, 5};
		
		sortFirst(arr);
		sortFirst(arr);
	}
	
	public static void sortFirst(int[] arr){

		for(int i=0;i<arr.length-1;i++){
			if(arr[i]>arr[i+1]){
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
			System.out.println(Arrays.toString(arr));
 
		}
	}
}
