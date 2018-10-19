package cn.bjsxt.oop.callback;


//需要
public abstract  class MyFrame {
	//需要子类都重写这个方法
	public abstract void paint();
}

interface IMyFrame{
	void paint();
}