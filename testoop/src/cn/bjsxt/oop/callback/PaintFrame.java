package cn.bjsxt.oop.callback;



public class PaintFrame {
	public static void drawFrame(IMyFrame f){
		System.out.println("启动线程");
		System.out.println("增加循环");
		System.out.println("查看消息栈");
		
		//画窗口
		f.paint() ;
		
		System.out.println("启动缓存增加效率");
		
	}
	
	public static void main(String[] args) {
		drawFrame(new GameFrame01());
		
		//传递不同的对象可以调用不同的方法
		//回调、 模板方法模式
	}
}

class GameFrame01 implements IMyFrame{
	@Override
	public void paint() {
		// TODO Auto-generated method stub
		System.out.println("GameFrame01.paint()");
		System.out.println("画窗口");
	}
}

//class GameFrame02 extends MyFrame{
//	@Override
//	public void paint() {
//		// TODO Auto-generated method stub
//		System.out.println("GameFrame02.paint()");
//		System.out.println("画窗口");
//	}
//}