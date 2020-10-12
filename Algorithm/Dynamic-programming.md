## Dynamic programming

- Related to induction
- Optimization of plain recursion
  - In time complexity: from exponential to polynomial
- Memoization
  - Without
    ```c
    #include <stdio.h>

    long long factorial(int n) 
    {
        if (n==0)
        {
            return 1;
        }

      return factorial(n-1) * n;
    }

    int main()
    {
        int num;

        printf("Input a number: ");
        scanf("%d", &num);

        printf("%d! = %lld", num, factorial(num));

        return 0;
    }
    ```
  - With
    ```c
    #include <stdio.h>

    long long factorial(int n, long long arr[]) 
    {
        if (arr[n] == 0)
        {
            if (n == 0) {
              arr[n] = 1;
            } else {
              arr[n] = factorial(n-1, arr) * n;
            }
        }

      return arr[n];
    }

    int main()
    {
      long long array[50] = { 0 };
        int num;

        printf("Input a number: ");
        scanf("%d", &num);

        factorial(num, array);
        printf("%d! = %lld", num, factorial(num, array));

        return 0;
    }
    ```
