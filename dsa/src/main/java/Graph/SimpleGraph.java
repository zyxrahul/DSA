package Graph;

//import java.awt.FocusTraversalPolicy;
import java.util.ArrayList;

public class SimpleGraph {
 static class Edge{
  int source;
  int dest;
  int wt;
  public Edge(int s,int d,int w){
    this.source=s;
    this.dest=d;
    this.wt=w;
  }
 }
 public static void creategraph(ArrayList<Edge>[] graph){
  for(int i=0; i<graph.length; i++){
    graph[i]=new ArrayList<Edge>();
  }
  graph[0].add(new Edge(0,2,2));

  graph[1].add(new Edge(1,3,0));
  graph[1].add(new Edge(1,2,10));

  graph[2].add(new Edge(2,0,2));
  graph[2].add(new Edge(2,1,10));
  graph[2].add(new Edge(2,3,-1));

  graph[3].add(new Edge(3,1,0));
  graph[3].add(new Edge(3,2,-1));
  
 }
  public static void main(String[] args) {
    int v=4; //number of vertices
    ArrayList<Edge> graph[]=new ArrayList[v];
    creategraph(graph);
    vertic(graph, 2);
  }
public static void vertic(ArrayList<Edge>[] graph,int v){
  System.out.printf("The Adjecent vertics and Weight of %d\n",v);
  for(int i=0;i<graph[v].size();i++){
    System.out.println(graph[v].get(i).dest +"  "+graph[v].get(i).wt);
  }
}

}
