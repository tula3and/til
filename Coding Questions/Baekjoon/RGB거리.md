## [RGB거리](https://www.acmicpc.net/problem/1149)

- Dynamic programming
- Solution
  - 최종적으로 나올 수 있는 값은 총 3개.
    - 첫 번째 수를 택했을 때, 그 다음에 두 번째 또는 세 번째만 선택할 수 있다.
    - 이때 두 가지 중 가장 작은 수를 선택하게 될 것이다.
    - 이렇게 두 번째 수, 세 번째 수까지 하면 3가지의 경우가 나온다.
  - 3개의 값을 이용해서 최솟값을 반영하면 끝.

- C
  ```c
  #define _CRT_SECURE_NO_WARNINGS
  #define MIN(a, b) (((a) < (b)) ? (a) : (b))
  /*
  smallest of three integers
  #define MIN(x, y, z) ((x) < (y) ? ((x) < (z) ? (x) : (z)) : ((y) < (z) ? (y) : (z)));
  */

  #include <stdio.h>

  int main() {
    int num, num1, num2, num3, fin1, fin2, fin3;
    int temp1, temp2, temp3;
    int i;

    scanf("%d", &num);
    scanf(" %d %d %d", &fin1, &fin2, &fin3);

    for (i = 0; i < num - 1; i++) {
      scanf(" %d %d %d", &num1, &num2, &num3);

      temp1 = fin1;
      temp2 = fin2;
      temp3 = fin3;

      fin1 = num1 + MIN(temp2, temp3);
      fin2 = num2 + MIN(temp1, temp3);
      fin3 = num3 + MIN(temp1, temp2);
    }

    temp1 = MIN(fin1, fin2);
    printf("%d", MIN(temp1, fin3));

    return 0;
  }
    ```
