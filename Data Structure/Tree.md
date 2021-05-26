## Tree

- NO cycles at all
- Usually used as binary tree: has at most two children
  - Binary search tree (BST): left child node is smaller and right one is larger than the parent node
    - For searching a specific value: O(the height of a BST)
    - Each node has exactly one key and the keys in the tree are distinct.
    - The keys (if any) in the left subtree are smaller than the key in the root.
    - The keys (if any) in the right subtree are larger than the key in the root.
    - The left and right subtrees are also binary search trees.
  - Threaded binary tree: replace null links of a leaf node to a pointer linked to another node
    - Use inorder traversal to find the pointer
      ```c
      Pointer inorderPredecessor(Pointer ptr) { // before ptr
        Pointer temp = ptr->leftChild; // left subtree
        if (ptr->leftThread == FALSE) {
          while (temp->rightThread == FALSE) temp = temp->rightChild; // move right
        }
        return temp;
      }
      
      Pointer inorderSuccessor(Pointer ptr) { // after ptr
        Pointer temp = ptr->rightChild; // right subtree
        if (ptr->rightThread == FALSE) {
          while (temp->leftThread == FALSE) temp = temp->leftChild; //  move left
        }
        return temp;
      }
      ```
    - If a leaf node is either the first node or the last one, connect it to the root
    - Because of these threaded links, each node has `boolean values` to check that the links are child nodes or not
      ```c
      /*
      root = malloc(sizeof(*root));
      root->leftThread = FALSE;
      root->rightThread = FALSE;
      root->data = ' ';
      root->leftChild = root;
      root->rightChild = root;
      */
      
      void makeThread(Pointer ptr) {
        if (ptr->leftThread && ptr->rightThread) return;
        if (ptr) {
          Pointer leftT = inorderSuccessor(ptr); // after ptr
          if (leftT != NULL && leftT->leftThread == TRUE) {
            leftT->leftChild = ptr;
          }
          Pointer rightT = inorderPredecessor(ptr); // before ptr
          if (rightT != NULL && rightT->rightThread == TRUE) {
            rightT->rightChild = ptr;
          }
          makeThread(ptr->leftChild);
          makeThread(ptr->rightChild);
        }
      }
      
      /*
      makeThread(root->leftChild);
      makeThread(root->rightChild);

      Pointer leftT = inorderSuccessor(root); // after root // first
      if (leftT != NULL && leftT->leftThread == TRUE) {
        leftT->leftChild = root;
      }
      Pointer rightT = inorderPredecessor(root); // before root // last
      if (rightT != NULL && rightT->rightThread == TRUE) {
        rightT->rightChild = root;
      }
      */
      ```
  - Heap (complete binary tree):
    - For finding a max or min value: max & min heap
      - Max heap: parent ≥ child
      - Min heap: parent ≤ child
    - Delete the root node first
      ```c
      // max heap
      element pop() {
        int parent, child;
        element item, temp;
        if (HEAP_EMPTY(n)) { // #define HEAP_EMPTY(n) (!n)
          fprintf(stderr, "The heap is empty.\n");
          exit(EXIT_FAILURE);
        }
        item = heap[1]; // root
        temp = heap[n--]; // last node
        parent = 1; child = 2;
        while (child <= n) { // check just one child node
          if ((child < n) && (heap[child].key < heap[child + 1].key)) {
            child++; // move to the right child
          }
          if (temp.key >= heap[child].key) break;
          heap[parent] = heap[child];
          parent = child;
          child *= 2;
        }
        heap[parent] = temp;
        return item;
      }
      ```
    - Use an array: root index is 1
      - Parent's node's index: `(child node's index) // 2`
      - Left child node's index: `(parent node's index) * 2`
      - Right child node's index: `(parent node's index) * 2 + 1`
    - Complete binary tree: fill left child first
- Make a binary tree with C
  - Make `Node` and `Pointer`
    ```c
    typedef struct Node *Pointer;
    typedef struct Node {
      int data;
      Pointer leftChild, rightChild;
    } Node;
    ```
  - Recursive: binary tree traversals: left first
    ```c
    void inorder(Pointer ptr) { 
      if (ptr) {
        inorder(ptr->leftChild);
        printf("%d", ptr->data);
        inorder(ptr->rightChild);
      }
    }

    void preorder(Pointer ptr) { 
      if (ptr) {
        printf("%d", ptr->data);
        preorder(ptr->leftChild);
        preorder(ptr->rightChild);
      }
    }

    void postorder(Pointer ptr) { 
      if (ptr) {
        postorder(ptr->leftChild);
        postorder(ptr->rightChild);
        printf("%d", ptr->data);
      }
    }
    ```
  - Iterative: binary tree traversals: left first
    ```c
    void iterinorder(Pointer ptr) {
      for (;;) { // infinite
        for (; ptr; ptr = ptr->left) push1(&ptr);
        ptr = pop1(); // if (top1 == -1) return NULL;
        if (ptr == NULL) break;
        printf("%d", ptr->data);
        ptr = ptr->right;
      }
    }
    
    void iterpreorder(Pointer ptr) {
      for (;;) {
        for (; ptr; ptr = ptr->left) {
          printf("%d", ptr->data);
          push2(&ptr);
        }
        ptr = pop2();
        if (ptr == NULL) break;
        ptr = ptr->right;
      }
    }

    // reference: https://youtu.be/xLQKdq0Ffjg
    void iterpostorder(Pointer ptr) {
      for (;;) {
        for (; ptr; ptr = ptr->left) push3(&ptr);
        if (top3 == -1) break;
        ptr = stack3[top3];
        if (ptr->right == NULL) { // leaf
          ptr = pop3();
          printf("%d", ptr->data);
          if (ptr == stack3[top3]->right) {
            ptr = pop3();
            printf("%d", ptr->data);
          }
          if (top3 == -1) break;
          ptr = stack3[top3]->right;
        }
        else {
          ptr = ptr->right;
        }
      }
    }
    ```





