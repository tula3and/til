## Solutions

### 0. warming up

- 2**38 = 274877906944
- Change the URL to `pythonchallenge.com/pc/def/274877906944.html`

### 1. What about making trans?

- Use the codes below
  ```python
  import string

  target = "g fmnc wms bgblr rpylqjyrc gr zw fylb. rfyrq ufyr amknsrcpq ypc dmp." \
           "bmgle gr gl zw fylb gq glcddgagclr ylb rfyr'q ufw rfgq rcvr gq qm jmle." \
           "sqgle qrpgle.kyicrpylq() gq pcamkkclbcb. lmu ynnjw ml rfc spj."
  url = "http://www.pythonchallenge.com/pc/def/map.html"

  x = 'abcdefghijklnmopqrstuvwxyz'
  y = 'cdefghijklmnpoqrstuvwxyzab'

  after = target.maketrans(x, y)
  print(target.translate(after))

  # i hope you didnt translate it by hand. thats what computers are for.
  # doing it in by hand is inefficient and that's why this text is so long.
  # using string.maketrans() is recommended. now apply on the url.

  after = url.maketrans(x, y)
  print(url.translate(after))

  # jvvr://yyy.ravjqpejcnngpig.eqo/re/fgh/ocr.jvon
  ```
- Change `map` to `ocr` in the URL

### 2. ocr

- Open the page source
- Copy the block below the sentence, `find rare characters in the mess below:`
- Save the mess as a text file `test.txt` and use the codes below
  ```python
  file = open('test.txt', 'r')

  lines = file.readlines()
  lst = []

  for line in lines:
      for i in range(len(line)):
          if (line[i] not in lst):
              lst.append(line[i])

  print(lst)
  # ['%', '$', '@', '_', '^', '#', ')', '&', '!', '+', ']', '*', '}', '[', '(', '{', '\n', 'e', 'q', 'u', 'a', 'l', 'i', 't', 'y']
  ```
- Change `ocr` to `equality` in the URL

### 3. re

- Open the page source and copy the comment below
- Save the mess as a text file `test.txt` and use the codes below
  ```python
  file = open('test.txt', 'r')

  lines = file.readlines()
  lst = []
  cnt = 0
  saved = ''

  for line in lines:
      for i in range(len(line)):
          if (line[i].isupper()):
              if (saved != ''):
                  lst.append(saved)
                  saved = ''
              cnt += 1
          else:
              if (cnt != 0):
                  lst.append(cnt)
              if (line[i] != '\n'):
                  saved += line[i]
              cnt = 0

  saved = ''
  for i in range(len(lst)):
      if (lst[i] == 3 and lst[i + 2] == 3 and len(lst[i + 1]) == 1):
          saved += lst[i + 1]

  print(saved) # linkedlist
  ```
- Change `ocr` to `linkedlist` in the URL
- Change `linkedlist.html` to `linkedlist.php` in the URL

### 4. follow the chain

- Click the photo
- Change number behind `?nothing=`
- Use the codes below
  ```python
  import requests

  num = "12345" # 12345, 8022

  while True:
      url = "http://www.pythonchallenge.com/pc/def/linkedlist.php?nothing=" + num
      req = requests.get(url)
      html = req.text
      num = html.split()[-1]
      print(num)
      if (not num.isnumeric()):
          break

  print(num)
  ```
- Input `http://www.pythonchallenge.com/pc/def/peak.html` in the URL

### 5. peak hell

- Peak hell sounds like `pickle`
- Use the codes below
  ```python
  import urllib.request # Get data as binary
  import pickle

  url = "http://www.pythonchallenge.com/pc/def/banner.p"
  html = urllib.request.urlopen(url).read()
  things = pickle.loads(html)

  for thing in things:
      for i in range(len(thing)):
          what = thing[i][0]
          how_many = thing[i][1]
          print(what * how_many, end='')
      print()
  ```
- The result looks like this: ![](https://github.com/tula3and/til/blob/master/Python/Python%20Challenge/5_result.png?raw=true)
- Change `peak` to `channel` in the URL


