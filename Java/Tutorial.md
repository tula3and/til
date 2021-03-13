## Java tutorial

- Download [OpenJDK](https://jdk.java.net/15/) and set the environment variable
- `.java` → (Compile) → `.class` → `Java Virtual Machine` → `computer`
- Print "Hello World"
  ```java
  public class HelloWorldApp{ // Class name must be same with the file name
    public static void main(String[] args) {
      System.out.println("Hello world!!"); // Not i
    }
  }
  ```
- Overriding & Overloading
  - Overriding: in a child class
    ```java
    class Plus {
        public int sum(int a, int b) {
            return a + b;
        }
    }
    
    // Overriding
    class NewPlus extends Plus {
        public int sum(int a, int b) {
            System.out.println("New!");
            return a + b;
        }
    }
    ```
  - Overloading: in the same class
    ```java
    class Plus {
        public int sum(int a, int b) {
            return a + b;
        }
        
        // Overloading
        public int sum(int a, int b, int c) {
            return a + b + c;
        }
    }
    ```
  



