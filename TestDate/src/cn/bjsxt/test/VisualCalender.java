package cn.bjsxt.test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class VisualCalender {
	public static void main(String[] args) {
		System.out.println("���������ڣ�2013-3-10��");
		Scanner scanner = new Scanner(System.in);
		String inputStr = scanner.nextLine();
		String temp = inputStr;
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		//���ַ���ת��Ϊʱ����󣬸�ʽ���ַ���
		//SimpleDateFormat ��һ���������Ի�����صķ�ʽ����ʽ���ͷ������ڵľ����ࡣ���������и�ʽ�������� -> �ı������������ı� -> ���ڣ��͹淶����
		try {
			Date date = format.parse(temp);
			Calendar calendar = new GregorianCalendar();
			calendar.setTime(date);
			int day = calendar.get(Calendar.DATE);
			calendar.set(Calendar.DATE, 1);
			
			System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
			
			int maxdate = calendar.getActualMaximum(Calendar.DATE);
			
			System.out.println("��\tһ\t��\t��\t��\t��\t��");
			//���ӻ�
			
			for(int i=0;i<calendar.get(Calendar.DAY_OF_WEEK)-1;i++){
				System.out.print("\t");
			}
			

			for(int i=1;i<=maxdate;i++){
				
				if(i == day){
					System.out.print("*");
				}
				System.out.print(i+"\t");
				
				int w = calendar.get(Calendar.DAY_OF_WEEK);
				if(w == Calendar.SATURDAY){
					System.out.println();
				}
				calendar.add(Calendar.DATE, 1);
				
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}