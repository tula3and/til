## Queue

- FIFO: First-in, First-out
  - Enqueue: put in
    ```python
    def enqueue(element):
      data.append(element)
    ```
  - Dequeue: put out
    ```python
    def dequeue():
      saved = data[0]
      del data[0]
      return saved
    ```
- Linear queue: shifting all the behinds if the queue is full
  ```c
  int front = 0;
  int rear = 0;
  
  void queueFull(element item) {
    if (front > 0) {
      int i, j = 0;
      printf("Shifting data...\n");
      for (i = front; i < rear; i++) {
        queue[j] = queue[i];
        j++;
      }
      rear -= front;
      front = 0;
      queue[rear++] = item;
      return;
    }
    printf("Queue is full. Not added.\n");
  }
  
  void enqueue(element item) {
    if (rear == MAX_QUEUE_SIZE) queueFull(item);
    else queue[rear++] = item;
  }

  element dequeue() {
    if (front == rear) return queueEmpty(); // return error // exit(EXIT_FAILURE);
    return queue[front++];
  }
  ```
- Circular queue: initial: `front` = `rear` = 0
  - Empty queue: `front` == `rear`
  - Always empty in `front` index
  - Using `%` to calculate the position of `front` and `rear`
  - C: `qprint()` prints all the elements
    ```c
    element queue[MAX_QUEUE_SIZE];

    int front = 0;
    int rear = 0;

    void qprint() {
      if (front == rear) {
        printf("Queue is empty so cannot print any element.\n");
        return;
      }
      int i;
      if (front < rear) {
        for (i = front + 1; i <= rear; i++) {
          printf("%d, %s", queue[i].id, queue[i].name);
        }
      }
      else {
        for (i = front + 1; i < MAX_QUEUE_SIZE; i++) {
          printf("%d, %s", queue[i].id, queue[i].name);
        }
        for (i = 0; i <= rear; i++) {
          printf("%d, %s", queue[i].id, queue[i].name);
        }
      }
      printf("\n");
    }

    void enqueue(element item) {
      int temp = rear;
      rear = (rear + 1) % MAX_QUEUE_SIZE;
      if (front == rear) {
        queueFull();
        rear = temp;
        return;
      }
      queue[rear] = item;
    }

    element dequeue() {
      if (front == rear) return queueEmpty();
      front = (front + 1) % MAX_QUEUE_SIZE;
      return queue[front];
    }
    ```
- Size-up circular queue using `malloc`
  ```c
  #define MALLOC(p,s) \
    if (!((p) = malloc(s))) { \
      fprintf(stderr, "Insufficient memory"); \
      exit(EXIT_FAILURE); \
    }

  element *queue;
  
  int front = 0;
  int rear = 0;
  int capacity = 1;

  void copy(element* a, element* b, element* c) {
    while (a != b) *c++ = *a++;
  }

  void queueFull() {
    int start;
    element* newQueue;
    MALLOC(newQueue, 2 * capacity * sizeof(*queue));

    start = (front + 1) % capacity; // because front is empty
    if (start < 2) {
      copy(queue + start, queue + start + capacity - 1, newQueue);
    }
    else {
      copy(queue + start, queue + capacity, newQueue);
      copy(queue, queue + rear + 1, newQueue + capacity - start);
    }

    front = 2 * capacity - 1;
    rear = capacity - 2;
    capacity *= 2;
    free(queue);
    queue = newQueue;
    printf("Queue capacity is doubled: current capacity is %d.\n", capacity);
  }
  ```
- Python library `queue`
  ```python
  import queue
  
  data = queue.Queue() # queue.LifoQueue(), queue.PriorityQueue()
  data.put('hello')
  data.qsize() # 1
  
  data.get() # 'hello'
  data.qsize() # 0
  ```

