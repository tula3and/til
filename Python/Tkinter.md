## Tkinter

- Tkinter is a module for making GUI.
  ```python
  from tkinter import *

  window1 = Tk()
  window1.title('first GUI')
  window1.geometry('400x400')

  window1.mainloop()
  ```
- `Label()` print texts
  ```python
  l1 = Label(window1, text = 'hello world')
  l1.pack()
  ```
- `Button()` add buttons
  - Don't add `()` after a command in `Button()`.
  ```python
  b1 = Button(window1, text = 'end program', command = quit)
  b1.pack()
  ```
- `Entry()` add input box
  ```python
  e1 = Entry(window1)
  e1.pack()
  ```
- `tkk.Combobox()`, `Checkbutton()`, and `Radiobutton()`
  ```python
  from tkinter import *
  import tkinter.ttk as tkk

  window1 = Tk()
  window1.geometry('400x400')

  str1 = StringVar()
  int1 = IntVar()
  int2 = IntVar()

  Label(window1, textvariable = str1).pack()
  c1 = tkk.Combobox(window1, textvariable = str1)
  c1['values'] = (1,2,3,4,5)
  c1.current(0)
  c1.pack()

  Label(window1, textvariable = str(int1)).pack()
  cb1 = Checkbutton(text = 'testing Checkbutton', variable = int1)
  cb1.select()
  cb1.pack()

  Label(window1, textvariable = str(int2)).pack()
  rb1 = Radiobutton(window1, text = '1 example', value=1, variable = int2)
  rb2 = Radiobutton(window1, text = '2 example', value=2, variable = int2)
  rb1.pack()
  rb2.pack()

  window1.mainloop()
  ```
- `.pack` and `.grid`
  ```python
  #object.pack()
  object.grid(row=0,column=0)
  ```
- text and textvariable
  - text uses `.config()`
  - textvariable uses `.set()` and `.get()`
  ```python
  from tkinter import *

  def test1():
      l1.config(text = 'world')

  def test2():
      str1.set('*' + str(str1.get()))

  window1 = Tk()

  str1 = StringVar()
  str1.set('world')

  l1 = Label(window1, text = 'hello')
  l2 = Label(window1, textvariable = str1)
  l1.pack()
  l2.pack()

  b1 = Button(window1, text = 'change label1', command = test1)
  b2 = Button(window1, text = 'change label2', command = test2)
  b1.pack()
  b2.pack()

  window1.mainloop()
  ```
