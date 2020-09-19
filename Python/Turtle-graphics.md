## Turtle graphics

- Cautions
  - Don't save the file name as `turtle.py`
- Drawing a polygon
  ```python
  import turtle

  def polygon(size, sides):
      angle = 360.0 / sides
      for i in range(sides):
          turtle.forward(size)
          turtle.left(angle)

  def main():
      turtle.setup()
      num = int(input())
      polygon(100, num)
      turtle.done()

  main()
  ```
- Drawing a heart
  ```python
  import turtle as t
  import math

  def axes():
      t.goto(-400,0)
      t.forward(800)
      t.penup()
      t.back(400)
      t.left(90)
      t.forward(200)
      t.pendown()
      t.back(400)
      t.penup()
      t.forward(200)
      t.right(90)

  def plot():
      for i in range(0, 360):
          t1 = math.radians(i)
          x1 = math.sin(t1)
          x = x1**3
          x = x*16
          y1 = math.cos(t1)
          y2 = math.cos(2 * t1)
          y3 = math.cos(3 * t1)
          y4 = math.cos(4 * t1)
          y = 13*y1 - 5*y2 - 2*y3 - y4
          t.goto(10 * x, 10 * y)
          t.pendown()

  def main():
      t.setup(1000, 500)
      t.color("blue")
      axes()

      t.color("red")
      plot()

      t.done()

  main()
  ```
