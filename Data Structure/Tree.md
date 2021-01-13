## Tree

- NO cycles at all
- Usually used as binary tree: has at most two children
  - Binary search tree (BST): left child node is smaller amd right one is larger than the parent node
    - For searching a specific value
  - Heap (complete binary tree):
    - For finding a max or min value: max & min heap
    - Use an array: root index is 1
      - Parent's node's index: `(child node's index) // 2`
      - Left child node's index: `(parent node's index) * 2`
      - Right child node's index: `(parent node's index) * 2 + 1`
