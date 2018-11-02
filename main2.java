
public class main {

	public static void main(String[] args) {
		Data object = new Data();
		object.add(1);
		object.add(9);
		object.add(4);
		object.add(5);
		object.add(10);
		object.add(0);
		System.out.println(object.getValue(0));
		System.out.println(object.getValue(3));

	}
	public static class Data{
		private Node first;
		public int size;
		public int index;
		public class Node{
			private int data;
			private Node next;
		}
		
		public Data(){
			first = null;
		}
		
		public boolean isEmpty(){
			return first == null;
		}
		
		public void add(int data){
			Node head = first;
			first = new Node();
			first.data = data;
			first.next = head;
			size++;
		}
		
		public int peek(){
			return first.data;
		}
		public int size(){
			return size;
		}
		
		public int remove(){
			int data = first.data;
			first = first.next;
			size--;
			return data;
		}
		
		public int getValue(int index){
			int data = 0;
			
			if (index > size){
				return -1;
			}
			else{
				for(int i = 0;i<=index;i++){
					data = first.data;
					first = first.next;
					}
				add(data);
				return data;
			}
			}
		}
	}
