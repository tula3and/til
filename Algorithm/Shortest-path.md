## Shortest path

- Dijkstra: find n - 1 paths from a vertex
  - Initial setting
    ```c
    int graph[MAX_VERTEX][MAX_VERTEX]; // initialize INF except i == j
    int visited[MAX_VERTEX]; // 0
    int distance[MAX_VERTEX]; // initialize INF
    int path[MAX_VERTEX]; // initialize start value
    ```
  - Main function
    ```c
    void dijkstra(int start, int vertex) {
        int i, j;
        distance[start] = 0;
        for (i = 0; i < vertex; i++) {
            visited[start] = 1;
            int index = -1, min = INF;
            for (j = 0; j < vertex; j++) {
                if (visited[j]) continue;
                if (distance[j] > distance[start] + graph[start][j]) {
                    distance[j] = distance[start] + graph[start][j];
                    path[j] = start; // save the shortest path
                }
                if (min > distance[j]) {
                    min = distance[j];
                    index = j;
                }
            }
            printDistance(start, vertex);
            // distance[index] has the smallest except visited ones
            start = index;
        }
    }
    ```
  - Print each path
    ```c
    void printPath(int start, int end) {
        int trace[MAX_VERTEX];
        int temp = end, length = 0;
        while (path[temp] != start) {
            trace[length++] = path[temp];
            temp = path[temp];
        }
        int i;
        printf("distance[%d-%d]=%2d : <%d->", start, end, distance[i], start);
        for (i = length - 1; i > -1; i--) {
            printf("%d> <%d->", trace[i], trace[i]);
        }
        printf("%d>\n", end);
    }
    ```
- Floyd
  ```c
  void floyd(int vertex) {
    int i, j, k; // i → j through k
    for (k = 0; k < vertex; k++)
        for (i = 0; i < vertex; i++)
            for (j = 0; j < vertex; j++)
                graph[i][j] = MIN(graph[i][j], graph[i][k] + graph[k][j]);
  }
  ```

