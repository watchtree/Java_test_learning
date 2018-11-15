package cn.bjsxt.collectior;

import java.util.Date;

public class Student {
	private int id;
	private String name;
	private Date birthday;
	
	
	//重写，生成hashcode随机生成的地址
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		//判定对象相等
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())//类型对比
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		//上述判定通过返回true
		return true;
	}
	
	
}
