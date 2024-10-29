# Binary Search Tree (BST)

A **Binary Search Tree (BST)** is a type of binary tree where each node has a key, and every node's key is greater than the keys in its left subtree and less than the keys in its right subtree. BSTs are widely used for efficient searching and sorting operations due to this ordered structure.

## Key Concepts

- **Root:** The topmost node in the BST.
- **Node:** Each element in the BST, containing a key, and possibly left and right children.
- **Edge:** The connection between parent and child nodes.
- **Leaf:** A node with no children.
- **Height of the tree:** The path length from the root to the deepest node.
- **Depth of a node:** The path length from the root to the specified node.
- **Subtree:** A portion of the tree that itself is a tree.

## Properties of Binary Search Tree

1. **Left Subtree:** All keys in the left subtree are less than the root node's key.
2. **Right Subtree:** All keys in the right subtree are greater than the root node's key.
3. **No Duplicates:** BSTs do not allow duplicate nodes (each key must be unique).
4. **Recursive Structure:** Each left and right subtree must also be a binary search tree.

## Example

Here’s an example of a Binary Search Tree:

```
     8
    / \
   3   10
  / \    \
 1   6    14
```

- **Root:** `8`
- **Left Subtree of 8:** Contains nodes `3`, `1`, `6`, `4`, `7`, all with keys less than `8`.
- **Right Subtree of 8:** Contains nodes `10`, `14`, `13`, all with keys greater than `8`.

## Operations

1. **Search:** Locate a node with a given key by comparing keys at each node, starting from the root.
2. **Insert:** Add a new node while maintaining BST properties.
3. **Delete:** Remove a node, adjusting subtrees as needed to maintain BST properties.
4. **Traversal:** Visit nodes in a specific order, commonly:
   - **In-order Traversal (LNR):** Yields nodes in ascending order.
   - **Pre-order Traversal (NLR):** Useful for copying or deleting the tree.
   - **Post-order Traversal (LRN):** Useful for deleting nodes in a cleanup process.

## Complexity

- **Time Complexity:**
  - **Search, Insert, Delete:** O(h), where h is the height of the tree.
  - **Traversal:** O(n), where n is the number of nodes.

- **Space Complexity:** O(n) for storing nodes in the tree.
