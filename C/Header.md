## Headers

- `#include <stdio.h>` The essential
- `#include <string.h>`
  - `strlen()` 문자열 길이 반환
  - `strtok_s(<char>, <div>, <r>)` `<div>`로 문자열 나눠 전자는 반환, 후자는 `<r>`에 할당
  - `memcpy(<save>, <copy>, <len>)` 문자배열 복사
  - `memchr(<where>, <char>, <len>)` `<char>` 이후의 문자열 전부 반환
  - `strstr(<where>, <char>)` `<char>` 시작 주소 반환 (못 찾으면 `NULL`)
  - `strcmp(<char>, <char>)` 두 문자열이 같으면 `0` 반환 (`1`일 경우 전자의 길이가 더 길다.)
  - `sscanf_s(<start>, "%s %s", s1, sizeof(s1), s2, sizeof(s2))` `<start>` 시작 위치 주소값
- `#include <stdlib.h>`
  - `malloc` 동적 메모리 할당
    ```c
    int main() {
        int size;
        int *arr;

        printf("The number of factors: ");
        scanf("%d", &size);

        arr = (int *)malloc(sizeof(int) * size);
        // int arr[size];

        free(arr);

        return 0;
    }
    ```
  - `calloc` 동적 메모리 할당 및 0으로 초기화
    ```c
    #define CALLOC(p,n,s) \
      if (!((p) = calloc(n,s))) { \
        fprintf(stderr, "Insufficient memory"); \
        exit(EXIT_FAILURE); \
      }

    int *x, n;
    x = (int*) calloc(n, sizeof(int));
    ```
  - `realloc` 이미 존재하는 배열 사이즈를 바꿀 때 사용
    ```c
    #define REALLOC(o,p,s) \
    if (!((p) = realloc(o,s))) { \
      free(o); \
      fprintf(stderr, "Insufficient memory"); \
      exit(EXIT_FAILURE); \
    }

    int *old, *x, s;
    old = x;
    if ((x = (int*) realloc(x, s * sizeof(int))) == NULL) {
      free(old);
      exit(EXIT_FAILURE);
    }
    ```
  - `rand()` 0과 32767 사이의 임의의 정수 반환
    - 그러나 함수 호출 순서에 따라서 매번 일정한 수 반환
      - 그래서 `srand()`를 이용해 시드값을 바꾼다.
        ```c
        srand((unsigned)time(NULL)); // #include <time.h>
        ```
    - `rand() % (b - a + 1) + a` a와 b 사이의 난수 발생
  - `srand(<seed>)` 시드값이 다르면 난수가 달라짐
- `#include <time.h>`
  - `time(NULL)` 1970년 1월 1일 이후 현재까지 경과된 시간을 초 단위로 반환
- `#include <ctype.h>` 검사 후 참일 경우 0이 아닌 정수 반환
  - `isalpha()` 영문자 검사
  - `isupper()` `islower()` 대소문자 검사
  - `toupper()` `tolower()` 대소문자 변환
- `#include <stdarg.h>`
  - `va_list`, `va_start`, `va_arg`, `va_end`
  - 가변 인자를 `...`으로 선언
  - Example codes
    ```c
    double test_func(char* type, int count, ...) {
      int i;

      va_list argp;

      va_start(argp, count);

      double total = 0;

      if (type == "d") {
        for (i = 0; i < count; i++) {
          total += va_arg(argp, int);
        }
      }
      else if (type == "f") {
        for (i = 0; i < count; i++) {
          total += va_arg(argp, double);
        }
      }

      va_end(argp);

      return total / count;
    };
    ```
