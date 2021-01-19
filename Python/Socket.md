## [Socket](https://docs.python.org/ko/3.7/library/socket.html)

- 아래 코드는 동기식으로 구성되어 있음. (요청에 대한 응답을 기다린 후, 응답이 오면 다음 요청을 하는 방식)
- Server must be on first.
- `server.py`
  ```python
  from socket import *

  def receive(s):
      data = s.recv(4800) # Data size
      print(data.decode('utf-8'))

  def send(s):
      data = input('> ')
      s.send(data.encode('utf-8'))

  serverSocket = socket(AF_INET, SOCK_STREAM)
  serverSocket.bind(('', 8080))
  serverSocket.listen(4) # The number of concurrent users

  clientSocket, address = serverSocket.accept()

  print('Client', address, 'is online')
  print('Client', address, 'is typing...')

  while True:
      receive(clientSocket)
      send(clientSocket)
  ```
- `client.py`
  ```python
  from socket import *

  def receive(s):
      data = s.recv(4800)
      print(data.decode('utf-8'))

  def send(s):
      data = input('> ')
      s.send(data.encode('utf-8'))

  print('Connecting...')

  clientSocket = socket(AF_INET, SOCK_STREAM)
  clientSocket.connect(('127.0.0.1', 8080))

  print('Now you can send a message!')

  while True:
      send(clientSocket)
      receive(clientSocket)
  ```
