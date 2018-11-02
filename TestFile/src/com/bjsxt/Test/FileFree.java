package com.bjsxt.Test;

import java.io.File;

/**
 * ����Ŀ¼
 * @author tree
 *
 */
public class FileFree {
	public static void main(String[] args) {
		File f = new File("D:/workspace/Mypro02");
		printFile(f, 0);
	}
	
	static void printFile(File file, int level){
		for(int i=0;i<level;i++){
			System.out.print("-");
		}
		System.out.println(file.getName());
		if(file.isDirectory()){
			File[] files = file.listFiles();
			for(File temp:files){//��ǿforѭ����������
				printFile(temp, level+1);
			}
		}
	}
}