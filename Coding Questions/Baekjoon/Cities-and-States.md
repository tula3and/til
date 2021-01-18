## [Cities and States](https://www.acmicpc.net/problem/14171)

- 문자열
- Solution
  - `two cities are a "special pair" if they satisfy this property and come from different states.`
  - 두 번째 조건때문에 도시 앞 두 글자랑 코드가 같으면 제외된다.
  - 왜 틀렸는지 며칠 동안 못 찾았는데, 해당 딕셔너리에 있는 수에 따라 몇 쌍인지 달라진다는 걸 생각을 못했다.
- Python
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
          answer += dic[target] * dic[key]
      except:
          pass

  print(answer // 2)
  ```
