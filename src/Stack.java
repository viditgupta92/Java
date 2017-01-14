
public class Stack {
	
	public Node top = null;
	
	public boolean isEmpty(){
		return top == null;
	}
	
	public void insert(long val){
		Node n = new Node(val);
		n.next = top;
		top = n;
	}
	
	public Node delete(){
		Node temp = top;
		top = top.next;
		return temp;
	}
	
	public void print_stack(){
		Node temp = top;
		while(temp.next != null){
			System.out.println(temp.data);
			System.out.println("V");
			temp = temp.next;
		}
		System.out.println(temp.data);
	}

	public static void main(String[] args) {
		Stack s = new Stack();
		s.insert(1);
		s.insert(2);
		s.insert(3);
		s.insert(4);
		s.insert(5);
		s.delete();
		s.delete();
		s.delete();
		s.delete();
		s.print_stack();
		System.out.println(s.isEmpty());
		s.delete();
		System.out.println(s.isEmpty());
	}
}
