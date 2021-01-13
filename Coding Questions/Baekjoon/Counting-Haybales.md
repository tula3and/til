## [Counting Haybales](https://www.acmicpc.net/problem/14170)

- 이분 탐색
- Solution
  - 시간 초과의 연속.
  - 이분 탐색 관련 코드 설명은
  [수 찾기](https://github.com/tula3and/til/blob/master/Coding%20Questions/Baekjoon/%EC%88%98-%EC%B0%BE%EA%B8%B0.md#%EC%88%98-%EC%B0%BE%EA%B8%B0) 참고.
  - 마지막에 정말 최대한 줄였다고 생각했는데 시간 초과 나길래 아래 코드를 붙이고 드디어 `틀렸습니다`를 얻었다.
    ```cpp
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    ```
  - 뭐가 틀렸을까를 고민해봤는데 예제에 (내가 만든 알고리즘 기준으로) 빠진 예시가 하나 있었다.
  - 양쪽 끝을 검사해서 똑같은 수가 있을 경우와 없을 경우를 구분해서 차를 이용해 답을 냈다.
    - 그래서 총 경우의 수는 4, 그런데 예제에는 `(없을 경우, 있을 경우)`가 빠져있었다.
    - 추가로 `(4, 5)`를 확인해보고 최종 코드를 작성했다.
- C++
  ```cpp
  #include <iostream>
  #include <algorithm>
  #include <string.h>
  using namespace std;

  int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);

    int target_length, answer_length, i;
    int arr[100001];

    cin >> target_length >> answer_length;

    for (i = 0; i < target_length; i++) {
      cin >> arr[i];
    }

    sort(arr, arr + target_length);

    int start, end, mid, k, answer;

    int num[2];
    int space[2];
    int found;
    for (i = 0; i < answer_length; i++) {
      cin >> num[0] >> num[1];
      memset(space, -1, sizeof(space));

      for (k = 0; k < 2; k++) {
        start = 0;
        end =  target_length - 1;
        found = 0;		
        while (start - end < 1) {	
          mid = (start + end) / 2;	
          if (num[k] == arr[mid]) {
            space[k] = mid;
            found = 1;
            break;
          }
          else if (num[k] > arr[mid]) {
            start = mid + 1;					
          }
          else {
            end = mid - 1;
          }
        }
        if (space[k] == -1) {
          space[k] = start;
        }
      }

      if (found) {
        answer = space[1] - space[0] + 1;
      }
      else {
        answer = space[1] - space[0];
      }

      cout << answer << "\n";		
    }

    return 0;	
  }
  ```




