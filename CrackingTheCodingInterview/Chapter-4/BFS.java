/*
	Given a graph, implement Depth First Search (DFS) 
*/


public class BFS{
	
	void BFS(Node start){
		if(start==null) return;

		Queue q = new Queue();

		q.enq(start);
		q.addedToQueue = true;

		while(!q.isEmpty()){
			Node n = q.deq();
			visit(n);

			for(Node node : n.adjacents){
				if(node.addedToQueue==false){
					q.enq(node);
					node.addedToQueue=true;
				}
			}
		}
	}

	public static void main(String[] args) {
		
	}
}