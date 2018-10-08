package cn.sxt.game;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
/**
 * 飞机游戏主窗口
 * @author tree
 *
 */
public class MygameFrame extends JFrame{
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
	}
	
	public static void main(String[] args) {
		MygameFrame f = new MygameFrame();
		f.launchFrame();
	}
}
