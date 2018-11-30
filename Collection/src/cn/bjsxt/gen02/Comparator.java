package cn.bjsxt.gen02;
/**
 * 接口中泛型字母只能使用在方法中，不能使用在全局常量中
 * @author tree
 *
 * @param <T>
 */
public interface Comparator<T> {
//	T int A=2;
	void compare(T t);
}
