package cn.bjsxt.oop.callback;



public class PaintFrame {
	public static void drawFrame(IMyFrame f){
		System.out.println("�����߳�");
		System.out.println("����ѭ��");
		System.out.println("�鿴��Ϣջ");
		
		//������
		f.paint() ;
		
		System.out.println("������������Ч��");
		
	}
	
	public static void main(String[] args) {
		drawFrame(new GameFrame01());
		
		//���ݲ�ͬ�Ķ�����Ե��ò�ͬ�ķ���
		//�ص��� ģ�巽��ģʽ
	}
}

class GameFrame01 implements IMyFrame{
	@Override
	public void paint() {
		// TODO Auto-generated method stub
		System.out.println("GameFrame01.paint()");
		System.out.println("������");
	}
}

//class GameFrame02 extends MyFrame{
//	@Override
//	public void paint() {
//		// TODO Auto-generated method stub
//		System.out.println("GameFrame02.paint()");
//		System.out.println("������");
//	}
//}