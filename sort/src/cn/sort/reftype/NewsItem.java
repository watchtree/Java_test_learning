package cn.sort.reftype;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.tools.JavaCompiler;

/**
 * ������Ŀʵ����
 * @author tree
 *
 */
public class NewsItem implements java.lang.Comparable<NewsItem>{
	private String title;
	private int hits;
	private Date pubTime;
	
	public NewsItem() {
		// TODO Auto-generated constructor stub
	}
	
	
	public NewsItem(String title, int hits, Date pubTime) {
		super();
		this.title = title;
		this.hits = hits;
		this.pubTime = pubTime;
	}


	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getHits() {
		return hits;
	}
	public void setHits(int hits) {
		this.hits = hits;
	}
	public Date getPubTime() {
		return pubTime;
	}
	public void setPubTime(Date pubTime) {
		this.pubTime = pubTime;
	}

	//��ʱ�併��+���������+���⽵��
	@Override
	public int compareTo(NewsItem o) {
		// TODO Auto-generated method stub
		int result = 0;
		result =  - this.pubTime.compareTo(o.pubTime);
		if(result==0){
			//�����
			result = this.hits - o.hits;
			if(result==0){
				//����
				result = this.title.compareTo(o.title);
				return result;
			}else{
				return result;
			}
		}else{
			return result;
		}
	}
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("���⣺").append(this.title);
		sb.append("ʱ��").append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(this.pubTime));
		sb.append("�����").append(this.hits).append("\n");
		
		return sb.toString();
		
	}
	
}