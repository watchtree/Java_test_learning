package cn.sort.reftype;
/**
 * 按价格排序的业务类（降序）
 * @author tree
 *
 */
public class GoodsPriceComp implements java.util.Comparator<Goods>{

	@Override
	public int compare(Goods o1, Goods o2) {
		// TODO Auto-generated method stub
		return (o1.getPrice() - o2.getPrice()>0?1:(o1.getPrice()==o2.getPrice()?0:-1));
		
	}
	

}
