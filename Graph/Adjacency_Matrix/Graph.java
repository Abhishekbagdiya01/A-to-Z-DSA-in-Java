import java.util.ArrayList;
public class Graph {
  ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
  int[][] adjacencyMatrix;

  public Graph(ArrayList<GraphNode> nodeList) {
    this.nodeList = nodeList;
    adjacencyMatrix = new int[nodeList.size()][nodeList.size()];
  }

  public void addUndirectedEdge(int i, int j) {
    adjacencyMatrix[i][j] = 1;
    adjacencyMatrix[j][i] = 1;
  }

  public String toString() {
    StringBuilder sBuilder = new StringBuilder();
    sBuilder.append("   ");
    for (int i = 0; i < nodeList.size(); i++) {
      sBuilder.append(nodeList.get(i).name + " ");
    }

    sBuilder.append("\n");

    for (int i = 0; i < nodeList.size(); i++) {

      sBuilder.append(nodeList.get(i).name + ": ");
      for (int j : adjacencyMatrix[i]) {
        sBuilder.append((j) + " ");
      }
      sBuilder.append("\n");
    }
    return sBuilder.toString();
  }
}
