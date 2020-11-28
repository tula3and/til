## Linux

- `pwd` 현재 위치 확인하기
- `ls -al` 현재 위치의 모든 파일 출력하기
- `cat` 파일 내용 출력하기
  - `grep <text> <file>` 원하는 파일 내용만 출력하기
  - 추가 연결은 `|` == pipeline 을 이용하기
    ```
    cat <file> | grep <text1> | grep <text2>
    ```
- `cd` 현재 위치 이동하기
  - `..` 상위 폴더로 이동하기
- `sudo` 관리자 권한으로 실행하기
  - `chmod` 권한 관리하기
    1. `r` read, 읽기 권한
    2. `w` write, 쓰기 권한
    3. `x` execute, 실행 권한
- `vim` 텍스트 편집기
  - 기본 루틴 `i` → 글 수정 → `Esc` → `:wq`
- `nano` 텍스트 편집기
  ```
  sudo apt-get install nano
  ```
- `mv <pre name> <next name>` 파일 이름 바꾸기
- `rm` 삭제하기
  - `-r` 폴더를 지울 때
- IO redirection
  - Output
    - `cat hello.txt > result.txt`
    - `rm hello.txt 2> error.txt` Error: `2>` 이용
    - `cat hello.txt >> result.txt` Append
  - Input
    - `cat < hello.txt`
- `ps aux` 프로세스 목록 보기
  - `top` 또는 `htop` 도 가능하다.
    ```
    sudo apt-get install htop
    ```
- `crontab` 정해진 시간마다 명령 반복하기
  - `-e` → 주석 가장 아래에 `* * * * * /root/every_minute.sh 2>error.log`
  - Shell script 예시: `-e` 파일 유무 판단 시
    ```
    #!/bin/bash

    if [ -e /root/date.log ]; then
    cd /root;touch date.log
    fi

    date >> /root/date.log 2>&1
    ```

