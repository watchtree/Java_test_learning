package cn.bjsxt.gen03;
/**
 * 父类为泛型类
 * 属性
 * 方法
 * 
 * 要不同时擦除，要么子类大于父类的类型
 * 不能子类擦除，父类泛型
 * 1/属性类型 
 * 父类中随父类定
 * 子类中随子类定 
 * 2/方法重写随父类而定
 * @author tree
 *
 * @param <T>
 */
public abstract class Father<T, T1> {
	T name;
	public abstract void test(T t);
}
/**
 * 子类声明时指定具体类型
 * 属性类型为具体类型
 * 方法同理
 * @author tree
 *
 */
class Child extends Father<String, Integer>{
	String t2;
	public void test(String t){
		this.name = "wtt";
		
	}
}
/**
 * 子类为泛型类,类型在使用时确定
 * @author tree
 *
 */
class Child2<T, T1> extends Father<T, T1>{
	T1 t2;
	public void test1(T1 t){
		
	}
	@Override
	public void test(T t) {
		// TODO Auto-generated method stub
		
	}
}
//子类继承父类
class Child3<T, T1> extends Father<T, T1>{
	T1 t2;

	public void test(T t) {
		// TODO Auto-generated method stub
		
	}
}


//子类为泛型类，父类不指定类型,泛型的擦除，使用object替换
class Child4<T1, T2> extends Father{
	T2 name2;
	@Override
	public void test(Object t) {
		// TODO Auto-generated method stub
		this.name = "12";
		this.name2 = (T2) "2131";
	}
	
}

//子类与父类同时擦除
class Child5 extends Father{
	String name2;//自己设定类型
	@Override
	public void test(Object t) {
		// TODO Auto-generated method stub
		this.name =" 12";//object类型
	}
	
}
//
////错误：子类擦除、父类使用泛型
//class Child6 extends Father<T, T1>{
//	
//}


//要不同时擦除要不父类擦除
 