package cn.sxt.wtt;

import cn.sxt.oo.User;

import java.util.Date;
import java.sql.*;
import static java.lang.Math.*;//导入math类所有静态属性

public class Test {
	public static void main(String[] args) {
		User user = new User();  
		
		//Date date = new Date();//优先调用util里使用Date包而不是使用sql中data
		java.util.Date date = new Date();//最好防止混乱
		System.out.println(Math.PI);
		System.out.println(PI);
	}
	
}
