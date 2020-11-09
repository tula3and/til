## Python tutorial

1. [Operator](https://github.com/tula3and/til/blob/master/Python/Tutorial.md#operator)
2. [Dictionary](https://github.com/tula3and/til/blob/master/Python/Tutorial.md#dictionary)
3. [Set](https://github.com/tula3and/til/blob/master/Python/Tutorial.md#set)
4. [Function](https://github.com/tula3and/til/blob/master/Python/Tutorial.md#function)
5. [Built-in functions](https://github.com/tula3and/til/blob/master/Python/Tutorial.md#built-in-functions)
6. [Class](https://github.com/tula3and/til/blob/master/Python/Tutorial.md#class)
7. [External module](https://github.com/tula3and/til/blob/master/Python/Tutorial.md#external-module)
8. [File I/O](https://github.com/tula3and/til/blob/master/Python/Tutorial.md#file-io)
9. [Exception handling](https://github.com/tula3and/til/blob/master/Python/Tutorial.md#exception-handling)
10. [Errors](https://github.com/tula3and/til/blob/master/Python/Tutorial.md#errors)
11. [References](https://github.com/tula3and/til/blob/master/Python/Tutorial.md#references)

## Operator

- `Arithmetic` +, -, *, /, //, %, **
- `Shift` >>, <<
  - `print(5 << 2)` is 20.
- `Bitwise` &(and), |(or), ~(not)
- `Logical` and, or, not, ^(xor)
- `Comparison` >, <, >=, <=, ==, !=

## Dictionary

- Can't use two or more same keys
- `dic = {key: value}`
- `dic[key] = new_value`
- `del dic[key]`

## Set

- `set()`
- `add()`, `remove()`
- `s1.union(s2)` or `s1 | s2`
- `s1.intersection(s2)` or `s1 & s2`
- `s1.difference(s2)` or `s1 - s2
- `s1.symmetric_difference(s2)` or `s1 ^ s2`

## Function

- `def func_name(parameter):`
  - Infront of parameter, add `*` → tuple or `**` → dictionary
  - Parameter can get a default value.
  - You can omit parameter.
- `func_name(argument)`

## Built-in functions

- `map(function, list)` and `filter(function, list)`
  ```python
  doubling = lambda x:x**2

  lst = [1,2,3,4,5,6,7,8,9,10]

  print(list(map(doubling, lst))) #[1, 4, 9, 16, 25, 36, 49, 64, 81, 100]
  print(list(filter(lambda x:x%2==0, lst))) #[2, 4, 6, 8, 10]
  ```
- `enumerate(list)`
  ```python
  for i, num in enumerate(list):
      #index(i) and factor(num)
  ```
- `cycle(list)`
  ```python
  from itertools import cycle

  #print infinitely
  for letter in cycle(['a', 'b', 'c', 'd', 'e']):
      print('%s' %letter)
  ```

## Class

- `class class_name:`
  ```python
  class Tree:
      root = 1
      leaf = 100
      def __init__(self):
          print('bigTree')

  #Inheritance
  class Tree1(Tree):
      def __init__(self):
          #If you want to inherit __init__() in the class above
          #super(Tree1, self).__init__()
          print('first')
  ```

## External module

- `import module_name` or `from module_name import what_you_want_to_call`
  - `what_you_want_to_call` = `*` is comfortable to use module.
- Make a .py file, e.g., two.py
- Import two.py to another .py file in the same folder
  ```python
  import two

  #test() is a function under two.py
  two.test()

  if __name__ == '__main__':
      print('one')
  ```
- `if __name__ == '__main__':` Execute codes if running module is main.

## File I/O

- `file = open('d:/test.txt', <type>)` → Jobs → `file.close()`
- Types
  - `'w'` Clear the present file. If there is no file, make a new file.
  - `'r'` Read the present file.
  - `'a'` Append the text to the present file. If there is no file, make a new file.
  - `'w+'` ≡ `'w'` + `'r'`
  - `'r+'` ≡ `'r'` + `'w'`
  - `'a+'` ≡ `'a'` + `'r'`
- Jobs
  - `file.write('text')`
  - `lines = file.readlines()`
    - `type(lines)` is <class 'list'>
- `.seek(x, 0)` Set the pointer (x is distance)

## Exception handling

- try + except
  ```python
  try:
      num = input()
      print('%d' %num)
  except:
      print('error occurred')
  ```
- try + except + else
  ```python
  try:
      num = input()
      print('%d' %num)
  except TypeError:
      print('TypeError occurred')
  except ValueError:
      print('ValueError occurred')
  else:
      print('successfully finished')
  ```
- try + except + finally
- try + except + else + finally

## Errors

- UnicodeDecodeError: 'cp949' codec can't decode byte 0xe2 in position 6987: illegal multibyte seq
  ```python
  file = open(name, 'r', encoding='UTF8')
  ```
  
## References

- [Python documentation](https://docs.python.org/3/)
- [Time complexity](https://www.ics.uci.edu/~pattis/ICS-33/lectures/complexitypython.txt)
