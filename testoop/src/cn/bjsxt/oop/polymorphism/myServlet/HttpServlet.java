package cn.bjsxt.oop.polymorphism.myServlet;

public class HttpServlet {
	public void service(){
		System.out.println("httpServlet.service()");
		doGet();
	}
	public void doGet(){
		System.out.println("HttpServlet.doGet()");
	}
	public void doPost(){
		System.out.println("HttpServlet.doPost()");
	}
}
