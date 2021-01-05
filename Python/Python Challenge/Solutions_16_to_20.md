## Solutions: 16 to 20

### 16. let me get this straight

- Make all "pink" block on the same line
  - RGB of pink: (255, 0, 255)
- Use the codes below
  ```python
  from PIL import Image

  im = Image.open('mozart.gif')
  im_rgb = im.convert('RGB')
  result = Image.new(im.mode, im.size)

  x = im.size[0]
  y = im.size[1]

  start_point = []
  end_point = []
  checked = True
  for j in range(y):
      for i in range(x):
          point = im_rgb.getpixel((i, j))
          if (point[0] == 255 and checked):
              checked = False
              start_point.append((i, j))
          elif (point[0] != 255 and not checked):
              checked = True
              end_point.append((i,j))

  print(start_point)
  print(end_point)

  for i in range(len(end_point)):
      length = end_point[i][0]
      cnt = 0
      for k in range(length, x):
          result.putpixel((cnt, end_point[i][1]), im.getpixel((k, end_point[i][1])))
          cnt += 1

  result.save('16_result.png')
  ```
- The result looks like this:<br/>
![](https://github.com/tula3and/til/blob/master/Python/Python%20Challenge/16_result.png?raw=true)
- Change `mozart` to `romance` in the URL

### 17. eat?

-






