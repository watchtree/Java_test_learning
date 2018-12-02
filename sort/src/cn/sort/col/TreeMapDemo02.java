package cn.sort.col;

import java.util.TreeMap;

public class TreeMapDemo02 {
	public static void main(String[] args) {
		Worker w1 = new Worker("w1",12000);
		Worker w2 = new Worker("w2",8000);
		Worker w3 = new Worker("w3",5000);
		
		TreeMap<Worker, String> employees = new TreeMap<Worker, String>();
		employees.put(w1, "wtt");
		employees.put(w2, "wtt");
		employees.put(w3, "wtt");
		System.out.println(employees);
	}
}
