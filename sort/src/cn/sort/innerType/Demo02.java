package cn.sort.innerType;

import java.util.Arrays;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Demo02 {
	public static void main(String[] args) {
		String[] arr = {"a", "abcd", "abc", "def"};
		boolean sorted = true;
		int len = arr.length;
		for(int j=0;j<len;j++){
			sorted = true;
			for(int i=0;i<len-1-j;j++){
				if(((Comparable)arr[i]).compareTo(arr[i+1])>0){
					String temp = arr[i];
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
	}

}
