/**Created on July 1, 2017 by Amir Naghibi

	Implement Breadth First Search and Depth First Search for Binary Search Tree.
	Note: BST is a type of graph. The implementation here is for a directed graph.
*/
import java.util.Queue;
import java.util.ArrayList;

public class Grapth_t implements Queue{
	// A node in a graph
	private static class GraphNode{
		int data;
		ArrayList<GraphNode> adjacentNodes;

		// Constructor
		GraphNode(int data){this.data=data; adjacentNodes=new ArrayList<GraphNode>();}
	}

	GraphNode root;

	Grapth_t(){root=null;}


	// insert the "newNode" to the "target" node
	void insert(GraphNode newNode){

	}

	public static void main(String[] args) {
		Grapth_t obj = new Grapth_t();

		GraphNode nodeRoot = new GraphNode(8);
		obj.array.add(nodeRoot);
	}
}