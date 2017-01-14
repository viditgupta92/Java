
public class Queue {
	
	private Node first = null;
	private Node last = null;

	public boolean isEmpty(){
		return first == null;
	}
	
	public void insert(long val){
		Node n = new Node(val);
		if(first == null || last == null){
			first = n;
			last = n;		
		}
		else
		{
			last.next = n;
			last = n;
		}
	}
	
	public Node delete(){
		if(first == null){
			return null;
		}
		else
		{
			Node temp = first;
			first = first.next;
			return temp;
		}
	}
	
	public void print_queue(){
		Node temp = first;
		while(temp.next != null){
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println(temp.data);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		q.insert(1);
		q.insert(2);
		q.insert(3);
		q.insert(4);
		q.insert(5);
		q.delete();
		q.delete();
		q.delete();
		q.print_queue();
		q.delete();
		q.delete();
		System.out.println(q.isEmpty());
	}

}
