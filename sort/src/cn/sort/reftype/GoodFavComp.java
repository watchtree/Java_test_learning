package cn.sort.reftype;
/**
 * 按收藏排序的业务类（降序）
 * @author tree
 *
 */
public class GoodFavComp  implements java.util.Comparator<Goods>{
	@Override
	public int compare(Goods o1, Goods o2) {
		// TODO Auto-generated method stub
		return o1.getFav() - o2.getFav();
		
	}
}
