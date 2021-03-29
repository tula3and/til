## Stack

- Linear structure using 1D array
- LIFO: Last-in, First-out
- C
  - Structure array
    ```c
    typedef struct {
      // data
    } element;

    element stack[MAX_STACK_SIZE];
    int top = -1;
    ```
  - Push: put in
    ```c
    void push(element item) {
      if (top == MAX_STACK_SIZE - 1) stackFull();
      stack[++top] = item;
    }
    ```
  - Pop: put out
    ```c
    element pop() {
      if (top == -1) return stackEmpty(); // return error // exit(EXIT_FAILURE);
      return stack[top--];
    }
    ```
- Python
  - Push: put in
    ```python
    data.append(element)
    ```
  - Pop: put out
    ```python
    data.pop()

    # def pop():
    #  saved = data[-1]
    #  del data[-1]
    #  return saved
    ```
- Process structure uses stack: recursive function
