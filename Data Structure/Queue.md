## Queue

- First-in, First-out. (FIFO)
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
- Python library `queue`
  ```python
  import queue
  
  data = queue.Queue() # queue.LifoQueue(), queue.PriorityQueue()
  data.put('hello')
  data.qsize() # 1
  
  data.get() # 'hello'
  data.qsize() # 0
  ```

