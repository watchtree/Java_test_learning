package cn.sort.reftype;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * 
 * @author tree
 *
 */
public class NewsItamApp {
	public static void main(String[] args) {
		List<NewsItem> news = new ArrayList<NewsItem>();
		news.add(new NewsItem("new1", 100, new Date()));
		news.add(new NewsItem("new2", 50, new Date(System.currentTimeMillis()-1000*60*60)));
		news.add(new NewsItem("new3", 60, new Date(System.currentTimeMillis())));
		System.out.println("����ǰ"+news);
		Collections.sort(news);
		System.out.println("�����"+news);
	}
}
