package cn.bjsxt.collectior;
/**
 * �Զ���ʵ��map
 * @author tree
 *
 */
public class Sxtmap001 {
	SxtEntry[] arr = new SxtEntry[990];//�趨һ��������Ϊ�洢�ռ�
	
	
	int size;
	
	public void put(Object key, Object value){
		SxtEntry e = new SxtEntry(key, value);
		//���������ȵ�ֱ�Ӹ���
		for(int i=0;i<size;i++){
			if(arr[i].key.equals(key)){
				arr[i].value = value;
				return;//ֱ�ӽ�������ֵ
			}
		}
		arr[size++] = e;
	}
	
	public Object get(Object key){
		for(int i=0;i<size;i++){
			if(arr[i].key.equals(key)){
				return arr[i].value;
			}
		}
		return null;
	}
	
	public boolean containsKey(Object key){
		for(int i=0;i<size;i++){
			if(arr[i].key.equals(key)){
				return true;
			}
		}
		return false;
	}
	public boolean containsValue(Object value){
		for(int i=0;i<size;i++){
			if(arr[i].value.equals(value)){
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Sxtmap001 m = new Sxtmap001();
		m.put("123", new Wife("zqc"));
		m.put("123", new Wife("hzy"));
		Wife w = (Wife) m.get("123");
		System.out.println(w.name);
		
	}
}
class SxtEntry{
	Object key;
	Object value;
	public SxtEntry(Object key, Object value) {
		super();
		this.key = key;
		this.value = value;
	}	
}