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





