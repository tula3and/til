## Solutions: 6 to 10

### 6. now there are pairs

- Change `channel` to `zip` in the URL
  - You can see the sentence: yes. find the zip.
  - Input `http://www.pythonchallenge.com/pc/def/channel.zip` in the URL
- Read `readme.md` in the zipped folder
- Use the codes below
  ```python
  where = './channel/'
  file_name = '90052.txt'

  while True:
      file = open(where + file_name, 'r')
      line = file.readline().split()
      print(line)
      file_name = str(line[-1]) + '.txt'
  ```
- The last file is 46145.txt and it says `Collect the comments.`
  - Zipped files can have comments: [ZipFile.comment](https://docs.python.org/3/library/zipfile.html#zipfile.ZipFile.comment)
- Use the codes below
  ```python
  import zipfile

  where = './channel/'
  file_name = '90052.txt'

  zipped = zipfile.ZipFile('channel.zip', 'r')
  comments = []

  while True:
      before_num = str(zipped.read(file_name).split()[-1])[2:]
      after_num = before_num[:-1]
      comments.append(zipped.getinfo(file_name).comment)
      if (after_num == 'comments.'):
          break
      file_name = after_num + '.txt'

  for comment in comments:
      print(comment.decode('ascii'), end='')
  ```
- The result looks like this:<br/>
![](https://github.com/tula3and/til/blob/master/Python/Python%20Challenge/6_result.png?raw=true)
- Change `channel` to `hockey` in the URL
  - The page says, it's in the air. look at the letters.
  - The actual answer is `oxygen`
- Change `hockey` to `oxygen` in the URL

### 7. smarty

-


