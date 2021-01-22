## [Secret Cow Code](https://www.acmicpc.net/problem/14454)

- 수열
- Solution
  - 단순하게 문자열 늘리는 걸로 시작 → 당연히 시간 초과
  - 문자를 숫자로 바꿔서 좀 더 단순하게 생각해보기로 했다.
    - COW를 123으로 바꿔서
    - 그럼 그 다음에 붙는 게 `123456`인데 이때 `456`은 앞의 `312`에 해당한다.
    - 또 다음에 붙는 게 `123456789101112` 이때 `789101112`은 앞의 `612345`에 해당한다.
    - 위의 두 경우 모두 `전 문자열의 길이 + 1`을 빼주면 해당 위치를 얻는다.
    - 단, 전 문자열 바로 뒤에 붙는 문자는 1만 빼주면 된다.
  - 위의 과정을 최종 코드로 작성했다.
- C++
  ```cpp
  #include <iostream>
  #include <string>
  using namespace std;

  int main() {
    string target;	
    long long num;
    cin >> target >> num;

    while (num > target.size()) {
      long long now = target.size();

      while (now < num) {
        now *= 2;
      }
      now /= 2;

      if (num - now == 1) {
        num -= 1;
      }
      else {
        now += 1;
        num -= now;
      }
    }

    cout << target[num - 1] << "\n";

    return 0;	
  }
  ```
