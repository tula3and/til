## [Cities and States](https://www.acmicpc.net/problem/14171)

- 문자열
- Solution
  - `two cities are a "special pair" if they satisfy this property and come from different states.`
  - 두 번째 조건때문에 도시 앞 두 글자랑 코드가 같으면 제외된다.
- Python: 왜 틀렸는지 모르겠다.
  ```python
  import sys
  num = int(sys.stdin.readline().rstrip())

  dic = {}
  for i in range(num):
      city, code = sys.stdin.readline().rstrip().split(' ')

      if (city[0:2] != code):
          target = city[0:2] + code
          try:
              dic[target] += 1
          except:
              dic[target] = 1

  answer = 0
  for key in dic:
      target = key[2:] + key[0:2]
      try:
          answer += dic[target]
      except:
          pass

  print(answer // 2)
  ```
