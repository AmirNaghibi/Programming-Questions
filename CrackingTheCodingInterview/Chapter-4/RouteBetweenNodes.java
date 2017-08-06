/* CCI : page 109
	Given a directed graph, design an algorithm to find out whether 
	there is a route between two nodes
*/


public class RouteBetweenNodes{
	
	boolean hasRoute(Node start, Node end){
		if(start==null || end||null) return false;
		if(start==end) return true;
		Queue q = new Queue;
		start.visited = true;
		q.enqueue(start);

		while(! q.isEmpty()){
			Node n = q.dequeue();
			//visit(n);
			if(n==end) return true;
			for(Node c : n.children){
				if(!c.visited()){
					// visit(c);
					if(c==end) return true;
					c.visited==true;
					q.enqueue(c);
				}
			}
		}
	}

	public static void main(String[] args) {
		// Make a graph object and call the method hasRoute and pass two arguments.
		// Used BFS algorithm.
	}
}