package Graph;
import java.util.ArrayList;
public class allPathFromSourceToTarget {
 




  static class Edge{
  int source;
  int dest;
  public Edge(int s,int d){
    this.source=s;
    this.dest=d;
  }

}
public static void creategraph(ArrayList<Edge>[] graph){
  for(int i=0; i<graph.length; i++){
    graph[i]=new ArrayList<Edge>();
  }
  graph[0].add(new Edge(0,1));
  graph[0].add(new Edge(0,2));

  graph[1].add(new Edge(1,3));
  graph[1].add(new Edge(1,0));

  graph[2].add(new Edge(2,0));
  graph[2].add(new Edge(2,4));
 

  graph[3].add(new Edge(3,1));
  graph[3].add(new Edge(3,4));
  graph[3].add(new Edge(3,5));

  graph[4].add(new Edge(4,2));
  graph[4].add(new Edge(4,3));
  graph[4].add(new Edge(4,5));

  graph[5].add(new Edge(5,3));
  graph[5].add(new Edge(5,4));
  graph[5].add(new Edge(5,6));
  
  graph[6].add(new Edge(6,5));
  
  
 }
 public static void printAllPath(ArrayList<Edge> graph[],boolean[]vis,int curr,String path,int tar){
  if(curr==tar){
    System.out.println(path);
    return;
  }

  for(int i=0;i<graph[curr].size();i++){
    Edge e=graph[curr].get(i);

    if(vis[e.dest]==false){
      vis[curr]=true;
      printAllPath(graph, vis, e.dest, path+e.dest, tar);
      vis[curr]=false;

    }

  }

 }
public static void main(String[] args) {
  int v=7;
  int src=0;
  int tar=5;


  ArrayList<Edge> graph[]=new ArrayList[v];
  creategraph(graph);
  boolean []vis=new boolean[v];
  String path="0";
  printAllPath(graph, vis, src, path, tar);
 


  
  }


}






