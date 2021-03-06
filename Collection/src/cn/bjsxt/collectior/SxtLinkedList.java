package cn.bjsxt.collectior;

public class SxtLinkedList {
		private Node first;
		private Node last;
		private int size;
		
		public void add(Object obj){
			if(first==null){
				Node n = new Node();
				n.setPrevious(null);
				n.setObj(obj);
				n.setNext(null);
				first = n;//使链表可以找到第一个节点
				last = n;
			}else{
				//直接在last后增加新的节点
				Node n = new Node();
				n.setPrevious(last);
				n.setObj(obj);
				n.setNext(null);
				
				last.setNext(n);
				last = n;
			}
			size++;
		}
		
		public int size(){
			return size;
		}
		
		public Object get(int index){
			rangeCheck(index);
			Node temp = node(index);
			if(temp!=null){
				return temp.obj;	
			}
			return null;
		}
		
		//index越界处理
		public void rangeCheck(int index){
			
			if(index<0||index>=size){
				try{
					throw new Exception();
				}catch (Exception e){
					e.printStackTrace();
				}
			}
		}
		
		//节点定位
		public Node node(int index){
			Node temp = null;
			if(first!=null){
				if(index<(size>>1)){
					temp = first;
					for(int i=0;i<index;i++){
						temp = temp.next;
					}
				}else{
					temp = last;
					for(int i=size-1;i>index;i--){
						temp = temp.previous;
					}
				}
				
				//可以从前往后找也可以从后往前找加快效率
			
			}
			return temp;
		}
		
		public void remove(int index){
			rangeCheck(index);
			Node temp = node(index);
			temp = node(index);
			if(temp!=null){
				Node up = temp.previous;
				Node down = temp.next;
				up.next = down;
				down.previous = up;
			}
			size--;
		}
		
		public void add(Integer index,Object obj){
			Node temp = node(index);
			Node newNode = new Node();
			newNode.obj = obj;
			if(temp!=null){
				Node up = temp.previous;
				Node down = temp.next;
				up.next =newNode;
				newNode.next = down;
			}
			size++;
		}
		
		public static void main(String[] args) {
			SxtLinkedList list = new SxtLinkedList();
			list.add("aaa");
			list.add("asdaa");
			list.add("2aa");
			list.add("3aa");
			list.add("4sdaa");
			list.add("5aa");
//			list.remove(1);
//			System.out.println(list.get(1));
//			list.add(1,"ccc");
//			System.out.println(list.get(1));
			System.out.println(list.get(4));
		}
}
