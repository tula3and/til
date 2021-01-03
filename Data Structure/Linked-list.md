## Linked list

- Linking data away from each other with arrows
  - Node: the place for saving data
  - Pointer: the place for linking information
- Make liked list with python
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


