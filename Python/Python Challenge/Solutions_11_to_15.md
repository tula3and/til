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

-


