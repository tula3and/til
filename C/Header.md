## Headers

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
