## Headers

- `#include <stdlib.h>`
  - `rand()` 0과 32767 사이의 임의의 정수 반환
    - 그러나 함수 호출 순서에 따라서 매번 일정한 수 반환
      - 그래서 `srand()`를 이용해 시드값을 바꾼다.
    - `rand() % (b - a + 1) + a` a와 b 사이의 난수 발생
  - `srand(<seed>)` 시드값이 다르면 난수가 달라짐
- `#include <time.h>`
  - `time(NULL)` 1970년 1월 1일 이후 현재까지 경과된 시간을 초 단위로 반환
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
