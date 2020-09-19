## Factorization

1. Print all the prime before n
    ```python
    count = int(input('Input a number: '))

    while True:
        if count == 1:
            count = int(input("Input again: "))
        else:
            break

    for a in range(2, count + 1):
        prime = True
        for i in range(2, a):
            if a % i == 0:
                prime = False
        if (prime):
            print(a)
    ```

2. Factorization - return factors as a list
    ```python
    num = int(input())
    use = num

    def Divide(use):
        lst = []
        while (Prime(use) == False):
            i = 2
            a = True
            while (a):
                if Prime(i):
                    if (use % i == 0):
                        use = use // i
                        lst.append(i)
                        a = False
                    else:
                        i += 1
                else:
                    i += 1
        lst.append(use)
        return lst

    def Prime(n):
        prime = True
        for a in range(2, n):
            if n % a == 0:
                prime = False
                break
        return prime

    print(Divide(use))
    ```
