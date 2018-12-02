package cn.sort.reftype;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GoodsApp {
	public static void main(String[] args) {
		List<Goods> list = new ArrayList<Goods>();
		list.add(new Goods("good1", 100, 2000));
		list.add(new Goods("good2", 50, 2000));
		list.add(new Goods("good3", 0, 1000));
		System.out.println("����ǰ"+list);
		Collections.sort(list, new GoodFavComp());
		Collections.sort(list, new GoodsPriceComp());
		System.out.println("�����"+list);
		
	}
}
