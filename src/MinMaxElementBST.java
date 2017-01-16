public class MinMaxElementBST {
	
	private long min = 0;
	private long max = 0;
	private long depth1 = 0;
	private long depth2 = 0;
	
	public long find_min(Tree_Node root){
		Tree_Node t = root;
		min = t.data;
		t = t.left_child;
		while(t!= null){
			if(t.data < min){
				min = t.data;
			}
			t = t.left_child;
		}
		return min;
	}
		
	public long find_max(Tree_Node root){
		Tree_Node t = root;
		t = t.right_child;
		while(t!= null){
			if(t.data > max){
				max = t.data;
			}
			t = t.right_child;
		}
		return max;
	}
	
	public void depth_tree_1(Tree_Node root){
		Tree_Node t = root;
		while(t.left_child != null){
			depth1 += 1;
			t = t.left_child;
		}
		t= root;
		while(t.right_child != null){
			depth2 += 1;
			t = t.right_child;
		}
		if(depth1 > depth2){
			System.out.println("Depth: " + depth1);
		}
		else{
			System.out.println("Depth: " + depth2);
		}
	}
	
	public long depth_tree_2(Tree_Node root){
		if(root == null){
			return 0;
		}
		else{
			long l_depth = depth_tree_2(root.left_child);
			long r_depth = depth_tree_2(root.right_child);
			if(l_depth > r_depth){
				return l_depth + 1;
			}
			else{
				return r_depth + 1;
			}
		}
	}
	
	public void search(Tree_Node root, long val){
		if(root != null){
			if(root.data == val){
				System.out.println("1");
			}
			else if(val < root.data){
				search(root.left_child, val);
			}
			else{
				search(root.right_child, val);
			}
		}
		else
		{
			System.out.println("0");
		}
	}
	
	public static void main(String[] args){
		Tree t = new Tree();
//		Tree_Node n =  new Tree_Node(25);
//		t.add(n, 10);
//		t.add(n, 50);
//		t.add(n, 12);
//		t.add(n, 4);
//		t.add(n, 75);
//		t.add(n, 42);
		Tree_Node n =  new Tree_Node(10);
		t.add(n,20);
		t.add(n,5);
		t.add(n,3);
		t.add(n,15);
		t.add(n,2);
		t.add(n,1);
		t.in_order_tree(n);
		MinMaxElementBST b = new MinMaxElementBST();
		System.out.println("Minimum: "+ b.find_min(n));
		System.out.println("Maximum: "+ b.find_max(n));
		//b.depth_tree_1(n);
		System.out.println("Depth: " + b.depth_tree_2(n));
		b.search(n, 8);
	}
	
}
