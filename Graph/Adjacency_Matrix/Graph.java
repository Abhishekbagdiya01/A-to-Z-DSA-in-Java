import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

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

  // Get neighbors
  public ArrayList getNeighbors(GraphNode graphNode) {
    ArrayList<GraphNode> neighbors = new ArrayList<>();
    int nodeIndex = graphNode.index;

    for (int i = 0; i < adjacencyMatrix.length; i++) {
      if (adjacencyMatrix[nodeIndex][i] == 1) {
        neighbors.add(nodeList.get(i));
      }
    }
    return neighbors;
  }

  private void bfsVisit(GraphNode graphNode) {
    LinkedList<GraphNode> queue = new LinkedList<>();
    queue.add(graphNode);

    while (!queue.isEmpty()) {
      GraphNode currentNode = queue.remove(0);
      currentNode.isVisited = true;
      System.out.print(currentNode.name + " ");
      ArrayList<GraphNode> neighbors = getNeighbors(currentNode);
      for (GraphNode neighbor : neighbors) {
        if (!neighbor.isVisited) {
          queue.add(neighbor);
          neighbor.isVisited = true;
        }
      }
    }
  }

  public void bfs() {
    for (GraphNode graphNode : nodeList) {
      if (!graphNode.isVisited) {
        bfsVisit(graphNode);
      }
    }
  }

  private void dfsVisit(GraphNode graphNode) {
    Stack<GraphNode> stack = new Stack<>();
    stack.push(graphNode);

    while (!stack.isEmpty()) {
      GraphNode currentNode = stack.pop();
      currentNode.isVisited = true;
      System.out.print(currentNode.name + " ");
      ArrayList<GraphNode> neighbors = getNeighbors(graphNode);
      for (GraphNode neighbor : neighbors) {

        if (!neighbor.isVisited) {
          stack.push(neighbor);
          neighbor.isVisited = true;
        }
      }
    }
  }

  // DFS
  public void dfs() {
    for (GraphNode graphNode : nodeList) {
      if (!graphNode.isVisited) {
        dfsVisit(graphNode);
      }
    }
  }
}
