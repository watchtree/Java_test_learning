package cn.bjsxt.collection2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test01 {
	public static void main(String[] args) {
//		Employee e = new Employee();
//		e.setId(0301);
//		e.setName("wtt");
//		e.setDepartment("项目");
//		e.setSalary(3000);
//		String strDate = "2007-10";
//		DateFormat format = new SimpleDateFormat("yyyy-MM");
//		try {
//			e.setHireDate(format.parse(strDate));
//		} catch (ParseException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		
//		Employee e2 = new Employee();
//		e2.setId(0302);
//		e2.setName("wtt2");
//		e2.setDepartment("项目2");
//		e2.setSalary(3000);
//		String strDate2 = "2007-12";
//		DateFormat format2 = new SimpleDateFormat("yyyy-MM");
//		try {
//			e2.setHireDate(format.parse(strDate));
//		} catch (ParseException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
		Employee e1 = new Employee(0301, "wtt1", 3000, "项目部", "2007-10");
		Employee e2 = new Employee(0302, "wtt2", 4000, "项目部", "2008-10");
		Employee e3 = new Employee(0303, "wtt3", 5000, "项目部", "2009-10");
		
		List<Employee> list = new ArrayList<Employee>();//加入泛型之后只能让<Employee>放入数组当中
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		printEmpName(list);
	}
	public static void printEmpName(List<Employee> list){
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).getName());
		}
	}
}
