## Docker

- [Docker Desktop for Windows](https://hub.docker.com/editions/community/docker-ce-desktop-windows/) 설치는 WSL2가 필요하다.
  - WSL2와 VirtualBox을 동시에 사용할 때는 충돌이 있다.
  - 사용 전에 아래 명령을 명령 프롬프트(cmd)를 `관리자 권한`으로 실행하고 아래 명령어를 실행하자.
    - WSL2: `bcdedit /set hypervisorlaunchtype auto`
      - `wsl` 명령어 사용 기본값 설정: `wsl -s <사용할 기본값>`
      - `<사용할 기본값>` 이름 확인: `wsl -l`
    - VirtualBox: `bcdedit /set hypervisorlaunchtype off`
  - 위의 명령 입력 후에는 재부팅하기.
- 컨테이너는 하나의 가상 환경처럼 작동하고 그 안에 채워지는 게 이미지라고 생각하면 쉽다.
- 그리고 컨테이너를 올릴 땐, 그 컨테이너가 또 하나의 이미지로 생성된다.

## Commands

```
create ---> start ---> running ---> stopped ---> deleted
[ docker create ]
            [ docker start ]
[           docker run           ]
                            [     docker stop    ]
                                    [       docker rm      ]
```

- `docker create <IMAGE NAME>` 이미지를 이용해 파일 스냅샷 컨테이너에 넣기
- `docker start <CONTAINER NAME>` 이미지를 이용해 제작된 컨테이너에 시작 시 실행될 명령어 넣기
  - `-a` 출력되는 결과 기록
- `docker run --name <CONTAINER NAME> <IMAGE NAME>` `create`와 `start`를 한 번에 실행
  - `docker run -p <HOST PORT NUM>:<CONTAINER PORT NUM> <IMAGE NAME>` 포트 포워딩: 두 개의 포트가 연결된다.
- `docker exec <CONTAINER ID>` 이미 실행 중인 컨테이너에 명령 전달하기
  - `docker exec -it <CONTAINER ID> sh` 쉘 환경으로 접속하기
- `docker stop <CONTAINER ID>` 컨테이너 종료하기
  - 다른 컨테이너랑 구분될 경우, `<CONTAINER ID>`의 일부만 작성해도 된다.
  - ID 대신 NAME을 사용해도 된다.
  - `docker stop`은 `SIGTERM`을 먼저 주고 정리 후 `SIGKILL`이 주어진다.
  - 따라서 바로 `SIGKULL`이 도착하는 `docker kill`에 비해서 끝내는 시간이 늦다.
- `docker start <CONTAINER ID>` 존재하는 컨테이너 실행하기
- `docker logs -f <CONTAINER ID>` 컨테이너 로그 보기
  - `-f` 계속 로그를 볼 수 있다.
- `docker ps` 실행 중인 컨테이너 목록 확인하기
  - `-a` 종료된 컨테이너까지
- `docker rm <CONTAINER ID>` 컨테이너 삭제하기
- `docker images` 이미지 목록 확인하기
- `docker pull <name>` 이미지 다운로드 또는 업데이트 하기
- `docker rmi <IMAGE ID>` 이미지 삭제하기
- `docker system prune` 컨테이너, 이미지, 네트워크 전부 삭제하기
  - 실행 중인 컨테이너에는 영향을 주지 않는다.

## References

- [Docker Docs](https://docs.docker.com/engine/reference/run/)
- [WSL2 설치 및 사용 방법](https://www.44bits.io/ko/post/wsl2-install-and-basic-usage)
- [초보를 위한 도커 안내서](https://subicura.com/2017/01/19/docker-guide-for-beginners-1.html)
- [생활코딩 Docker 입구 수업](https://youtube.com/playlist?list=PLuHgQVnccGMDeMJsGq2O-55Ymtx0IdKWf)
