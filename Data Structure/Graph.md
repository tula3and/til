## Graph

- A nonempty set of vertices and a set of undirected edges, where each edge is a pair of vertices
- (undirected) `(u, v)` is an edge in E(G)
  - Vertices u and v are adjacent.
  - The edge (u, v) is incident on vertices u and v.
- (directed) `<u, v>` is an edge in E(G)
  - Vertex u is adjacent to v and v is adjacent from u.
  - The edge <u, v> is incident to vertices u and v.
- Complete graph: undirected, n-vertex and n(n-1)/2 edges
- Restrictions
  - May not have an edge from a vertex back to itself: self edge or self loop
  - May not have multiple occurrences of the same edge
- Adjacency list: O(e) (using a linked list)
- Adjacency matrix: O(n^2) (using a 2D array)
- Graph traversal
  - DFS (Depth First Search)
    - Use a stack or recursion
      ```c
      void dfs(int v) {
        Pointer temp;
        visited[v] = TRUE;
        printf("%4d", v);
        for (temp = graph[v]; temp; temp = temp->link) {
          if (visited[temp->vertex] == FALSE) {
            dfs(temp->vertex);
          }
        }
      }
      ```
  - BFS (Breadth First Search)
    - Use a queue
      ```c
      void bfs(int v) {
        pointer temp;
        visited[v] = TRUE;
        printf("%4d", v);
        qinsert(v);
        int now;
        
        // If you use a queue using a linked list
        // while (front == NULL) {
        // front = NULL, rear = NULL
        // Insert a new node in the queue
        // front = <the new node>, rear = <the new node>
        
        while (front != rear) {
          now = qdelete();
          for (temp = graph[now]; temp; temp = temp->link) {
            if (visited[temp->vertex] == TRUE) continue;
            printf("%4d", temp->vertex);
            qinsert(temp->vertex);
            visited[temp->vertex] = TRUE;
          }
        }
      }
      ```

