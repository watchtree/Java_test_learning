package cn.bjsxt.gen04;


public class bjsxt<T> {
	T stu;
	public static void main(String[] args) {
		//泛型的嵌套
		bjsxt<Student<String>> room = new bjsxt<Student<String>>();
		//从外到内一层层拆分
		room.stu = new Student<String>();
		Student<String> stu = room.stu;
		String score = stu.score;
		System.out.println(score);
	}

}

