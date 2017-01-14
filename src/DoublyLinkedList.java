
public class DoublyLinkedList {
	
	public Doubly_Node head;
	
	public void insert(long val){
		Doubly_Node n = new Doubly_Node(val);
		if(head == null){
			head = n;
		}
		else{
			Doubly_Node t = head;
			while(t.next != null){
				t = t.next;
			}
			t.next = n;
			n.prev = t;
		}
	}
	
	public void delete_element(long val){
		Doubly_Node temp = head;
		while(temp!= null){
			if(temp.data == val){
				temp.next.prev = temp.prev;
				temp.prev.next = temp.next;
			}
			temp = temp.next;
		}
	}
	
	public void print_doubly_list(){
		Doubly_Node temp = head;
		while(temp.next != null){
			System.out.print(temp.data + "<->");
			temp = temp.next;
		}
		System.out.println(temp.data);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList d = new DoublyLinkedList();
		d.insert(1);
		d.insert(2);
		d.insert(3);
		d.insert(4);
		d.insert(5);
		d.print_doubly_list();
		d.delete_element(4);
		d.print_doubly_list();
	}

}
