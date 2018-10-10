package cn.sxt.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
/**
 * 飞机游戏主窗口
 * @author tree
 *
 */
public class MygameFrame extends JFrame{
	

	Image planeimg = GameUtil.getImage("images/plane.png");
	Image bg = GameUtil.getImage("images/bg.jpg");
	Plane plane = new Plane(planeimg, 250,250);
	
	//paint方法用于窗口绘制，自动被调用，g相当于一只画笔
	@Override
	public void paint(Graphics g) {

		
		g.drawImage(bg, 0, 0, null);
		plane.drawSelf(g);//画飞机


	}
	
	//定义内部类，可以直接使用外部属性
	//帮助反复重画窗口
	class PaintThread extends Thread{
		@Override
		public void run() {
			while(true){
				repaint();//重画
				System.out.println("窗口画一次");
				//自动加入异常
				try {
					Thread.sleep(40);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	//加入键盘监听的内部类
	class KeyMonitor extends KeyAdapter{

		@Override
		public void keyPressed(KeyEvent e) {
			System.out.println(e.getKeyCode());
		}

		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println(e.getKeyCode());
		}
		
		
	}
	
	//初始化窗口
	public void launchFrame(){
		this.setTitle("wtt");
		this.setVisible(true);
		this.setSize(500, 500);
		this.setLocation(300, 300);
		
		//关闭窗口
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {

				System.exit(0);//0正常结束
			}
		});
		
		new PaintThread().start();//启动重画窗口的线程
		addKeyListener(new KeyMonitor());//给窗口增加键盘监听
	}
	

	public static void main(String[] args) {
		MygameFrame f = new MygameFrame();
		f.launchFrame();
	}
}
