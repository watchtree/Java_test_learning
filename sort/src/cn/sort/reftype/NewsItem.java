package cn.sort.reftype;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.tools.JavaCompiler;

/**
 * 新闻条目实体类
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

	//按时间降序+点击量升序+标题降序
	@Override
	public int compareTo(NewsItem o) {
		// TODO Auto-generated method stub
		int result = 0;
		result =  - this.pubTime.compareTo(o.pubTime);
		if(result==0){
			//点击量
			result = this.hits - o.hits;
			if(result==0){
				//标题
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
		sb.append("标题：").append(this.title);
		sb.append("时间").append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(this.pubTime));
		sb.append("点击量").append(this.hits).append("\n");
		
		return sb.toString();
		
	}
	
}
