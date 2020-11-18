from tkinter import *

window1 = Tk()
window1.title('Simple Calculator')
window1.geometry('400x400')

def onClick(button):
    if (button == 'C'):
        enterString.set('')
        afterString.set('')
    elif (button == '='):
        if (str(afterCal.get()) == ''):
            afterString.set(eval(enterString.get()))
    else:
        fir = enterString.get()
        enterString.set(fir + button)

padLst = ['1', '2', '3', '4', '5', '6', '7', '8', '9', '.', '0', '=']
otherLst = ['+', '-', '*', '/', 'C']

enterString = StringVar()
afterString = StringVar()

beforeCal = Entry(window1, textvariable = enterString)
beforeCal.grid(row=0, columnspan=10) #columnspan makes the space for Entry

afterCal = Entry(window1, textvariable = afterString)
afterCal.grid(row=1, columnspan=10)

for i, num in enumerate(padLst):
    Button(window1,
           text = num,
           width = 3,
           command = lambda temp = num:onClick(temp)).grid(row = i//3 + 2, column = i%3)

for i, other in enumerate(otherLst):
    Button(window1,
           text = other,
           width = 3,
           command = lambda temp = other:onClick(temp)).grid(row = i + 2, column = 3)

window1.mainloop()
