import java.util.*;
public class Graph {

  ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();

  public Graph(ArrayList<GraphNode> nodeList) {
    this.nodeList = nodeList;
  }

  public void addUndirectedEdge(int i, int j) {
    GraphNode first = nodeList.get(i);
    GraphNode second = nodeList.get(j);
    first.neighbors.add(second);
    second.neighbors.add(first);
  }

  public String toString(){
  StringBuilder stringBuilder = new StringBuilder();
      for (int i = 0; i < nodeList.size(); i++) {
      stringBuilder.append( nodeList.get(i).name + ": ");

        for (int j = 0; j < nodeList.get(i).neighbors.size(); j++) {
            if (j ==  nodeList.get(i).neighbors.size()-1) {
            stringBuilder.append( (nodeList.get(i).neighbors.get(j).name));
            }else{
              stringBuilder.append( (nodeList.get(i).neighbors.get(j).name + "-> "));
            } 
        }

      stringBuilder.append("\n");
      }
      return stringBuilder.toString();
  }
  void bfsVisit(GraphNode graphNode){
      LinkedList<GraphNode> queue = new LinkedList<>();
      queue.add(graphNode);

      while (!queue.isEmpty()) {
        GraphNode currentNode = queue.remove(0);
        currentNode.isVisited = true; 
        System.out.print(currentNode.name + " ");
        for (GraphNode neighbor : currentNode.neighbors) {
            if (!neighbor.isVisited) {
                  queue.add(neighbor);
                  neighbor.isVisited=true; 
            } 
        }
      }
  }
  public void bfs(){
    for (GraphNode graphNode : nodeList) {
        if (!graphNode.isVisited) {
          

              bfsVisit(graphNode); 
        }
    }
  }
}
