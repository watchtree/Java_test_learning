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
//		e.setDepartment("��Ŀ");
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
//		e2.setDepartment("��Ŀ2");
//		e2.setSalary(3000);
//		String strDate2 = "2007-12";
//		DateFormat format2 = new SimpleDateFormat("yyyy-MM");
//		try {
//			e2.setHireDate(format.parse(strDate));
//		} catch (ParseException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
		Employee e1 = new Employee(0301, "wtt1", 3000, "��Ŀ��", "2007-10");
		Employee e2 = new Employee(0302, "wtt2", 4000, "��Ŀ��", "2008-10");
		Employee e3 = new Employee(0303, "wtt3", 5000, "��Ŀ��", "2009-10");
		
		List<Employee> list = new ArrayList<Employee>();//���뷺��֮��ֻ����<Employee>�������鵱��
		
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
