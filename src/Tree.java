
public class Tree {

	private Tree_Node root = null;
	
	public void add(Tree_Node root, long val){
		Tree_Node t = new Tree_Node(val);
		if(root == null){
			root = t;
		}
		else
		{
			if(val < root.data){
				if(root.left_child == null){
					root.left_child = t;
				}
				else
				{
					this.add(root.left_child, val);
				}
			}
			
			if(val > root.data){
				if(root.right_child == null){
					root.right_child = t;
				}
				else
				{
					this.add(root.right_child, val);
				}
					
			}
		}
	}
	
	public void in_order_tree(Tree_Node root){
		if(root != null){
			this.in_order_tree(root.left_child);
			System.out.println(root.data);
			this.in_order_tree(root.right_child);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree t = new Tree();
		Tree_Node n =  new Tree_Node(25);
		t.add(n, 10);
		t.add(n, 50);
		t.add(n, 12);
		t.add(n, 4);
		t.add(n, 75);
		t.add(n, 42);
		t.in_order_tree(n);
	}

}
