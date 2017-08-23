/*
	Given a graph, implement Depth First Search (DFS) 
*/


public class DFS{
	
	public void DFS(Node start){
		if(start==null) return;
		visit(start);
		start.visited = true;

		for(Node node : start.adjacents){
			if(node.visited==false)
				DFS(node);
		}
	}



	public static void main(String[] args) {
		
	}
}