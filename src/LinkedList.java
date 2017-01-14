public class LinkedList {
	
	private Node head = null;
	
	public boolean isEmpty(){
		return head == null;
	}
	
	public void insert(long val){
		Node n = new Node(val);
		if(head == null){
			head = n;
		}
		else{
			Node temp = head;
			while(temp.next != null){
				temp = temp.next;
			}
			temp.next = n;
		}	
	}
	
	public long delete(){
		Node temp = head;
		head = head.next;
		return temp.data;
	}
	
	
	public void print_list(){
		Node temp = head;
		while(temp.next != null){
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println(temp.data);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		list.print_list();
		list.delete();
		list.delete();
		list.delete();
		list.delete();
		list.delete();
		System.out.println(list.isEmpty());
		//list.print_list();
	}

}
