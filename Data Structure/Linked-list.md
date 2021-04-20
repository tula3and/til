## Linked list

- Linking data away from each other with arrows
  - Node: the place for saving data
  - Pointer: the place for linking information
- Make a linked list with C
  - Make `Node` and `Pointer`
    ```c
    typedef struct Node* Pointer;
    struct Node {
      int data;
      Pointer link;
    };
    ```
  - Find the position to put data in
    ```c
    // Need to change before value so it must be its reference using *
    void find(Pointer first, Pointer *before, int data) {
      Pointer trav = first;

      if (first == NULL) { // Empty
        *before = first;
      }
      else {
        for (; trav; trav = trav->link) {  	
          if (data == trav->data) {
            *before = trav;
            return;
          }
        }
        printf("Cannot find the matched one\n");
      }
    }
    ```
  - Add data behind node `before`
    ```c
    void insert(Pointer *first, Pointer before, int data) {
      Pointer temp;
      temp = malloc(sizeof(*temp));    
      temp->data = data;

      if (*first == NULL) { // Empty
        temp->link = NULL;
        *first = temp;
      }
      else {
        if (before == NULL) {
          temp->link = *first;
          *first = temp;
        }
        else { 
          temp->link = before->link;
          before->link = temp;
        }
      }
    }
    ```
  - Delete node `target`
    ```c
    void delete(Pointer *first, Pointer before, Pointer target) {
      if (before) before->link = target->link;
      else *first = (*first)->link;
      free(target);
    }
    ```
  - Print data
    ```c
    void show(Pointer first) {
      int cnt = 1;
      for (; first; first = first->link, cnt++) {
        printf("(%p, %4d, %p)%s", first, first->data, first->link, cnt % 3 ? " " : "\n");
      }
      printf("\n");
    }
    ```
  - Reverse the list
    ```c
    void reverse(Pointer* first) {
      Pointer bef = NULL, current = *first, next = (*first)->link;
      while (next != NULL) {
        if (current == *first) {
          current->link = NULL;
        }
        else {
          current->link = bef;
        }
        bef = current;
        current = next;
        next = current->link;
      }
      current->link = bef;
      *first = current;
    }
    ```
- Make a linked list with python
  - Make `Node`
    ```python
    class Node:
      def __init__(self, data, next=None):
          self.data = data
          self.next = next

    node1 = Node(1)
    node2 = Node(2)

    # Link node1 with node2
    node1.next = node2
    ```
  - Add data (at the end)
    ```python
    def add(head, data):
        node = head
        while node.next:
            node = node.next
        node.next = Node(data)
    
    node1 = Node(1)

    for data in range(2, 10):
        add(node1, data)
    ```
  - Print data
    ```python
    node = node1
    
    while (node.next):
        print(node.data)
        node = node.next
    print(node.data)
    # Print 1 to 9
    ```
  - Add data (NOT just for the end)
    ```python
    def add(head, data, target=None):
      node = head
      notFound = True
      if (target != None):
          while (notFound):
              if (node.data == target):
                  notFound = False
                  new_node = Node(data)
                  new_node.next = node.next
                  node.next = new_node
              else:
                  node = node.next
      else:
          while node.next:
              node = node.next
          node.next = Node(data)
          
    add(node, 5.5, 5)
    
    node = node1
    
    while (node.next):
        print(node.data)
        node = node.next
    print(node.data)
    ```
  - Make `NodeMgmt`
    ```python
    class NodeMgmt:
      def __init__(self, data):
          self.head = Node(data)

      def add(self, data, target=None):
          node = self.head
          notFound = True
          if (target != None):
              while (notFound):
                  if (node.data == target):
                      notFound = False
                      new_node = Node(data)
                      new_node.next = node.next
                      node.next = new_node
                  else:
                      node = node.next
          else:
              while node.next:
                  node = node.next
              node.next = Node(data)

      def show(self):
          node = self.head
          while node:
              print(node.data)
              node = node.next

      def delete(self, data):
          if (self.head.data == data):
              temp = self.head
              self.haed = self.head.next
              del temp
          else:
              node = self.head
              while (node.next):
                  if (node.next.data == data):
                      temp = node.next
                      node.next = temp.next
                      del temp
                      return
                  else:
                      node = node.next
    ```
- Doubly linked list: it has two pointers which can explore both side


