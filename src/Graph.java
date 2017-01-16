import java.util.Scanner;

class Neighbor {
	public int vertexNum;
	public Neighbor next;
	public Neighbor(int vnum, Neighbor nbr){
		this.vertexNum = vnum;
		next = nbr;
	}
}

class Vertex {
	String name;
	Neighbor adjList;
	Vertex(String name, Neighbor neighbors){
		this.name = name;
		this.adjList = neighbors;
	}
}

public class Graph {

	Vertex[] adjLists;
	
	public Graph(int num){
		adjLists = new Vertex[num];
	}
	
	public void build_graph(Scanner s){
		for(int v=0; v < adjLists.length; v++){
			adjLists[v] = new Vertex(s.next(), null);
		}
		System.out.println("Number of connections: ");
		int n = s.nextInt();
		while(n > 0){
			int v1 = indexforname(s.next());
			int v2 = indexforname(s.next());
			
			adjLists[v1].adjList = new Neighbor(v2, adjLists[v1].adjList);
			adjLists[v2].adjList = new Neighbor(v1, adjLists[v2].adjList);
			
			n -= 1;
		}
	}
	
	int indexforname(String name){
		for(int v=0; v<adjLists.length; v++){
			if(adjLists[v].name.equals(name)){
				return v;
			}
		}
		return -1;
	}
	
	public void print(){
		System.out.println();
		for(int v=0; v < adjLists.length; v++){
			System.out.print(adjLists[v].name);
			for(Neighbor nbr= adjLists[v].adjList; nbr != null; nbr = nbr.next){
				System.out.print(" --> " + adjLists[nbr.vertexNum].name);
			}
			System.out.println("\n");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Number of vertices: ");
		Scanner s = new Scanner(System.in);
		
		Graph g = new Graph(s.nextInt());
		g.build_graph(s);
		g.print();
	}

}
