## Solutions: 11 to 15

### 11. odd even

- Enlarge the picture
  - You can see this picture looks like checked pattern
  - Odd rows start with dark one
  - Even rows start with bright one
- Use the codes below
  ```python
  import cv2
  from google.colab.patches import cv2_imshow # for using colab
  image = cv2.imread("/cave.jpg")
  
  change = 0

  for i in range(len(image)):
    for k in range(len(image[i])):
      if ((k % 2) != (change % 2)):
        for m in range(len(image[i][k])):
          image[i][k][m] = 0
    change += 1

  cv2_imshow(image)
  ```
- The result looks like this:<br/>
![](https://github.com/tula3and/til/blob/master/Python/Python%20Challenge/11_result.png?raw=true)
- Change `5808` to `evil` in the URL

### 12. dealing evil

- Open the page `evil1.jpg` and change it to `evil2.jpg`
- Download `evil2.gfx` and use the codes below
  ```python
  file = open('evil2.gfx', 'rb')

  bytes = file.read()

  for i in range(5):
      picture = open("%d.png" %i, 'wb')
      picture.write(bytes[i::5]) # Divide into 5 in evil1.jpg
      picture.close()
  ```
- The result is `disproportional`(ity - with a slash mark)
- Enter `www.pythonchallenge.com/pc/return/disproportional.html`

### 13. call him

- Click number 5 on the picture
  - There is a `xml` page: import [xmlrpc.client](https://docs.python.org/ko/3/library/xmlrpc.client.html)
- Use the codes below
  ```python
  import xmlrpc.client

  s = xmlrpc.client.ServerProxy('http://www.pythonchallenge.com/pc/phonebook.php')

  print(s.system.listMethods())

  print(s.system.methodHelp('phone'))
  print(s.system.methodSignature('phone'))

  print(s.phone('Bert')) # From evil4.jpg (not in Chrome)
  ```
- The result is `555-ITALY`
  - Input `ITALY` and you can see "SMALL letters."
- Change `disproportional` to `italy` in the URL

### 14. walk around

- Check a hint in page source: `remember: 100*100 = (100+99+99+98) + (...`
- Mouseover on `wire.png`: 100 × 100 pixels (intrinsic: 10000 × 1 pixels)
  - Use `wire.png` and make a roll with it: 100 + 99 + 99 + 98 + 98 + 97 + 97 + 96 + ...
- Use the codes below: import [Image](https://pillow.readthedocs.io/en/stable/reference/Image.html#image-module)
  ```python
  from PIL import Image

  im = Image.open("wire.png")
  result = Image.new(im.mode, [100,100])

  direction = [(1,0), (0,1), (-1,0), (0,-1)]

  fill_in = [100, 99, 99, 98]

  where = (-1,0)
  p = 0
  while (fill_in[3] != 0):
      for i in range(len(fill_in)):
          num = fill_in[i]
          for k in range(num):
              where = where[0] + direction[i][0], where[1] + direction[i][1]
              result.putpixel(where, im.getpixel((p,0)))
              p += 1

      for i in range(len(fill_in)):
          fill_in[i] -= 2

  result.save('14_result.png')
  ```
- The result looks like this:<br/>
![](https://github.com/tula3and/til/blob/master/Python/Python%20Challenge/14_result.png?raw=true)
- Change `italy` to `cat` in the URL
- Change `cat` to `uzi` in the URL

### 15. whom?

- We can see a calendar with a circle on 26
  - This year is 1XX6
  - It is a leap year: import [calendar.isleap](https://docs.python.org/ko/3/library/calendar.html#calendar.isleap) and
  [calendar.weekday](https://docs.python.org/ko/3/library/calendar.html#calendar.weekday)
    ```python
    import calendar

    lst = [str(i) for i in range(100)]

    for i in range(10):
        if (len(lst[i]) == 1):
            lst[i] = '0' + lst[i]

    leap_years = []
    for i in range(len(lst)):
        year = int('1' + lst[i] + '6')
        if (calendar.isleap(year)):
            leap_years.append(year)

    for leap_year in leap_years:
        if (calendar.weekday(leap_year, 1, 5) == 0):
            print(leap_year)
    ```
  - The result is 1176, 1356, 1576, 1756, and 1976
- Two clues in page source
  - he ain't the youngest, he is the second
    - The year is 1756
  - todo: buy flowers for tomorrow
    - `tomorrow` means Jan 27
- The answer is `1756. 1. 27.`
  - It is Mozart's birthday!
- Change `uzi` to `mozart` in the URL



