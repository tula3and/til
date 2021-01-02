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

- Find the comment and use the codes below
  ```python
  import bz2 # Related the photo of bee, maybe?

  un = b'BZh91AY&SYA\xaf\x82\r\x00\x00\x01\x01\x80\x02\xc0\x02\x00 \x00!\x9ah3M\x07<]\xc9\x14\xe1BA\x06\xbe\x084'
  pw = b'BZh91AY&SY\x94$|\x0e\x00\x00\x00\x81\x00\x03$ \x00!\x9ah3M\x13<]\xc9\x14\xe1BBP\x91\xf08'

  print(bz2.decompress(un)) # b'huge'
  print(bz2.decompress(pw)) # b'file'
  ```
- Login with huge and file

### 9. connect the dots

- Open the page source and copy the comment which is two long lists
  - They consists of points: (x, y, x, y, ..., x, y, x, y)
- Use the codes below to use (x, y) in two lists
  ```python
  import turtle

  first = [146,399,163,403,170,393,169,391,166,386,170,381,170,371,170,355,169,346,167,335,170,329,170,320,170,
           310,171,301,173,290,178,289,182,287,188,286,190,286,192,291,194,296,195,305,194,307,191,312,190,316,
           190,321,192,331,193,338,196,341,197,346,199,352,198,360,197,366,197,373,196,380,197,383,196,387,192,
           389,191,392,190,396,189,400,194,401,201,402,208,403,213,402,216,401,219,397,219,393,216,390,215,385,
           215,379,213,373,213,365,212,360,210,353,210,347,212,338,213,329,214,319,215,311,215,306,216,296,218,
           290,221,283,225,282,233,284,238,287,243,290,250,291,255,294,261,293,265,291,271,291,273,289,278,287,
           279,285,281,280,284,278,284,276,287,277,289,283,291,286,294,291,296,295,299,300,301,304,304,320,305,
           327,306,332,307,341,306,349,303,354,301,364,301,371,297,375,292,384,291,386,302,393,324,391,333,387,
           328,375,329,367,329,353,330,341,331,328,336,319,338,310,341,304,341,285,341,278,343,269,344,262,346,
           259,346,251,349,259,349,264,349,273,349,280,349,288,349,295,349,298,354,293,356,286,354,279,352,268,
           352,257,351,249,350,234,351,211,352,197,354,185,353,171,351,154,348,147,342,137,339,132,330,122,327,
           120,314,116,304,117,293,118,284,118,281,122,275,128,265,129,257,131,244,133,239,134,228,136,221,137,
           214,138,209,135,201,132,192,130,184,131,175,129,170,131,159,134,157,134,160,130,170,125,176,114,176,
           102,173,103,172,108,171,111,163,115,156,116,149,117,142,116,136,115,129,115,124,115,120,115,115,117,
           113,120,109,122,102,122,100,121,95,121,89,115,87,110,82,109,84,118,89,123,93,129,100,130,108,132,110,
           133,110,136,107,138,105,140,95,138,86,141,79,149,77,155,81,162,90,165,97,167,99,171,109,171,107,161,
           111,156,113,170,115,185,118,208,117,223,121,239,128,251,133,259,136,266,139,276,143,290,148,310,151,
           332,155,348,156,353,153,366,149,379,147,394,146,399]

  second = [156,141,165,135,169,131,176,130,187,134,191,140,191,146,186,150,179,155,175,157,168,157,163,157,159,
            157,158,164,159,175,159,181,157,191,154,197,153,205,153,210,152,212,147,215,146,218,143,220,132,220,
            125,217,119,209,116,196,115,185,114,172,114,167,112,161,109,165,107,170,99,171,97,167,89,164,81,162,
            77,155,81,148,87,140,96,138,105,141,110,136,111,126,113,129,118,117,128,114,137,115,146,114,155,115,
            158,121,157,128,156,134,157,136,156,136]

  def main():
      turtle.setup()
      turtle.penup()
      turtle.speed(1000)
      for i in range(0, len(first), 2):
        turtle.penup()
        turtle.goto(first[i], first[i+1])
        turtle.pendown()
        turtle.circle(1)
      for i in range(0, len(second), 2):
        turtle.penup()
        turtle.goto(second[i], second[i+1])
        turtle.pendown()
        turtle.circle(1)
      turtle.done()

  main()
  ```
- The result looks like this:<br/>
![](https://github.com/tula3and/til/blob/master/Python/Python%20Challenge/9_result.png?raw=true)
- Change `good` to `cow` in the URL
  - The page says, hmm. it's a male.
- Change `cow` to `bull` in the URL

### 10. what are you looking at?

- Move to the [sequence page](http://www.pythonchallenge.com/pc/return/sequence.txt)
  - `a = [1, 11, 21, 1211, 111221,` 
  - The rule is (the number of n) + (n) + ...
  - If there is different one, stop and count again from zero
  - The solution
    ```python
    a = [1, 11, 21, 1211, 111221]

    while (len(a) != 31):
        result = ''
        base = list(str(a[-1]))
        start = base[0]
        cnt = 1
        for i in range(1, len(base)):
            cnt += 1
            if (start != base[i]):
                result += str(cnt - 1)
                result += start
                cnt = 1
                start = base[i]
        result += str(cnt)
        result += start
        a.append(int(result))

    print(len(str(a[30]))) # 5808
    ```
- Change `bull` to `5808` in the URL


