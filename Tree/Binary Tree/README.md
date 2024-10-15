# Binary Tree
A **Binary Tree** is a hierarchical data structure in which each node has at most two children, referred to as the **left child** and **right child**. Binary trees are widely used in computer science for various applications such as searching, sorting, and representing hierarchical structures.

## Key Concepts

- **Root:** The topmost node in a binary tree.
- **Node:** Each element of the binary tree.
- **Edge:** The link between parent and child nodes.
- **Leaf:** A node that has no children.
- **Height of a tree:** The length of the path from the root to the deepest node.
- **Depth of a node:** The length of the path from the root to the node.

## Types of Binary Trees

1. **Full Binary Tree:** Every node has either 0 or 2 children.
2. **Complete Binary Tree:** All levels are fully filled except possibly the last, and the last level has all keys as left as possible.
3. **Perfect Binary Tree:** All internal nodes have two children, and all leaves are at the same level.
4. **Balanced Binary Tree:** The difference in height between the left and right subtrees of any node is not more than one.
5. **Degenerate (or Pathological) Tree:** Each parent node has only one child, essentially forming a linked list.

## Applications

- **Binary Search Trees (BSTs):** A special type of binary tree used for efficient searching and sorting operations.
- **Heaps:** Binary trees used in implementing priority queues.
- **Expression Trees:** Used to represent expressions where leaves are operands and internal nodes are operators.
- **Huffman Encoding Trees:** Used in data compression algorithms.


## Example

Here’s an example of a binary tree:
```
    1
   / \
  2   3
 / \
4   5
```

- **Root:** `1`
- **Left Child of 1:** `2`
- **Right Child of 1:** `3`
- **Children of 2:** `4` (left), `5` (right)

## Binary Tree - Traversel
* Depth first Search
    - Pre Order Traversal
    - In Order Traversal
    - Post Order Traversal
* Breadth first Search
    - Level Order  Traversal 

## Complexity

- **Time Complexity:**
  - Search, Insert, Delete: O(h), where h is the height of the tree.
  - Traversal: O(n), where n is the number of nodes.
  
- **Space Complexity:** O(n) for storage of the tree.

