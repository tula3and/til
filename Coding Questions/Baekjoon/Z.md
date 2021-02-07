## [Z](https://www.acmicpc.net/problem/1074)

- Recursion (이지만 수학으로 풀었다.)
- Solution
  - 배열을 계속 보면서 규칙을 찾으려고 했다.
  - Z의 총 네 부분의 형태는 같고 각 형태 간 차이는 한 부분의 전체 크기 `space` 만큼 변화한다.
  - `r`과 `c`의 값이 둘 다 1 이하가 되면 종료된다.
- C++
  ```cpp
  #include <iostream>
  using namespace std;

  int arr[16] = {0};

  int power(int num) {
      if (arr[num] == 0) {
        arr[num] = power(num - 1) * 2;
      }
      return arr[num];
  }

  int main() {
      ios::sync_with_stdio(0); cin.tie(0);    
      int n, r, c, answer = 0;
      cin >> n >> r >> c;

      arr[0] = 1;

      int space = power(n) * power(n);
      int target = power(n - 1);
      
      // Not using power() could be nice:
      // int n_power = 1 << n;
      // int space = n_power * n_power;
      // int target = 1 << (n - 1);

      while (target > 1) {
          space /= 4;

          if (r >= target) {
            r -= target;
            answer += space * 2;
          }

          if (c >= target) {
            c -= target;
            answer += space;
          }

          target /= 2;
      }

      answer += (r * 2 + c);

      cout << answer;
  }
  ```
  
