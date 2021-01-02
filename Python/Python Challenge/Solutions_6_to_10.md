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

- Download the image file and use the codes below
  ```python
  import cv2
  image = cv2.imread("/oxygen.png")

  print(len(image)) # 95
  print(len(image[0])) # 629
  print(len(image[0][0])) # 3

  middle = 95 // 2
  target = image[middle]
  lst = []

  for i in range(len(target)):
    lst.append(target[i][0])

  for i in range(len(lst)):
     print(chr(lst[i]), end='')
  ```
- The result is `sssssmmmmmmmaaaaaaarrrrrrrttttttt       ggggggguuuuuuuyyyyyyy,,,,,,,       yyyyyyyooooooouuuuuuu       mmmmmmmaaaaaaadddddddeeeeeee       iiiiiiittttttt.......       ttttttthhhhhhheeeeeee       nnnnnnneeeeeeexxxxxxxttttttt       llllllleeeeeeevvvvvvveeeeeeelllllll       iiiiiiisssssss       [[[[[[[111111100000005555555,,,,,,,       111111111111110000000,,,,,,,       111111111111116666666,,,,,,,       111111100000001111111,,,,,,,       111111100000003333333,,,,,,,       111111111111114444444,,,,,,,       111111100000005555555,,,,,,,       111111111111116666666,,,,,,,       111111122222221111111]]]]]]]]GEC;67<:3:<963,-01/..`
  - After removing duplicated letters, the actual one is `smart guy, you made it. the next level is [105, 110, 116, 101, 103, 114, 105, 116, 121]`
- To find the answer, use the codes below
  ```python
  answer = [105, 110, 116, 101, 103, 114, 105, 116, 121]

  for num in answer:
    print(chr(num), end='') # integrity
  ```
- Change `oxygen` to `integrity` in the URL

### 8. working hard?

-

