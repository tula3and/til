## Thread

- Thread finishes when `run()` dies so `run()` is usually an infinite loop
  - Use `interrupt()` to kill this infinite one
  - Once a thread has finished, cannot reuse it: make a new object and call `start()` again
- How to make a thread
  - Use `java.lang.Thread` class
    ```java
    class ThreadClass extends Thread {
      public void run() {
        for (int i = 10; i >= 0; i--) {
          System.out.println(i + " ");
          try {
            sleep(1000); // 1000ms
          }
          catch (InterruptedException e) { 
            e.printStackTrace();
          }
        }
      }
    }
    
    public class ThreadTest {
      public static void main(String[] args) {
        Thread t = new ThreadClass();
        t.start();
      }
    }
    ```
  - Use `java.lang.Runnable` interface
    ```java
    class RunnableInterface implements Runnable {
      public void run() {
        for (int i = 10; i >= 0; i--) {
          System.out.println(i + " ");
          try {
            Thread.sleep(1000);
          }
          catch (InterruptedException e) { 
            e.printStackTrace();
          }
        }
      }
    }
    
    public class RunnableTest {
      public static void main(String[] args) {
        Thread t = new Thread(new RunnableInterface());
        t.start();
      }
    }
    ```
- Thread synchronization
  - Use `synchronized` to set a block for exclusive execution
    ```java
    // example: sharing a board
    class SharedBoard {
      private int sum = 0;
      // synchronized function is called on threads
      // but it does not execute on more than one thread at the same time
      synchronized public void add() {
        sum += 10;
        System.out.println(Thread.currentThread().getName() + ": " + sum);
      }
      // return the sum value
      public int getSum() { return sum; }
    }
    ```
  - Use `wait()` and `notify()` to control the execution order
    - Use `wait()` to make a thread wait
    - Use `notify()` (or `notifyAll()`) for waking up the waiting thread
    - These functions can be used on the `synchronized` block only

