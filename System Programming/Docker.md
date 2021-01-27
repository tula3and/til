## Docker

- [Docker Desktop for Windows](https://hub.docker.com/editions/community/docker-ce-desktop-windows/) 설치는 WSL2가 필요하다.
  - WSL2와 VirtualBox을 동시에 사용할 때는 충돌이 있다.
  - 사용 전에 아래 명령을 명령 프롬프트(cmd)를 `관리자 권한`으로 실행하고 아래 명령어를 실행하자.
    - WSL2: `bcdedit /set hypervisorlaunchtype auto`
    - VirtualBox: `bcdedit /set hypervisorlaunchtype off`
  - 위의 명령 입력 후에는 재부팅하기.

## Commands

- `docker ps` 실행 중인 컨테이너 목록 확인하기
  - `-a` 종료된 컨테이너까지
- `docker stop <CONTAINER ID>` 컨테이너 종료하기
  - 다른 컨테이너랑 구분될 경우, `<CONTAINER ID>`의 일부만 작성해도 된다.
- `docker rm <CONTAINER ID>` 컨테이너 삭제하기

## References

- [WSL2 설치 및 사용 방법](https://www.44bits.io/ko/post/wsl2-install-and-basic-usage)
- [초보를 위한 도커 안내서](https://subicura.com/2017/01/19/docker-guide-for-beginners-1.html)
