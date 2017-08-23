/*
	Implement Graph Data Structure
*/
import java.util.ArrayList;


public class GraphDataStructure{
	// represents a vertex in a graph
	public class Vertex{
		int data;
		ArrayList<Vertex> adjacents;
	
		public Vertex(int data){this.data=data; this.adjacents=null;}
	}


	ArrayList<Vertex> vertexList;
	public GraphDataStructure(int numVertex){vertexList= new ArrayList<Vertex>();}



	public void addVertex(Vertex v, Vertex destination){
		
	}



	public static void main(String[] args) {
		
	}
}