## Kotlin tutorial

- Download OpenJDK [Zulu](https://www.azul.com/downloads/zulu-community/?package=jdk) and [IntelliJ IDEA](https://www.jetbrains.com/idea/download/#section=windows)
- Edit Configurations: add arguments
  ```kotlin
  fun main(args: Array<String>) {
      println("${args[0]}")
  }
  ```

## Variable

- `val`: cannot change
- `var`: can change
- `var str1: String = "HelloWorld"`
- Check the type: Ctrl + Shift + p | use `is` & `!is`
- Usually use camel case: variables start with a small letter
- Multiple choice: Alt + Shift + double click
- Don't allow `null` basically, but `?` makes `null` available
  ```kotlin
  fun main() {
      var str1: String?
      str1 = null
      val len =  str1?.length ?: -1
  }
  ```

## Operator

- `===`: return true if references are same
- `Shift` .shr(`<bits>`), .shl(`<bits>`)
  - `println(5.shl(2))` is 20.
- `Bitwise` .and(`<bits>`), .or(`<bits>`), .xor(`<bits>`), .inv()
- `Logical` &&, ||, !

## Function

- Can set default value
  ```kotlin
  fun sum(a: Int, b: Int = -1): Int {
      var sum = a + b
      return sum
  }

  // fun sum(a: Int, b: Int) = a + b
  ```
- Many values
  ```kotlin
  fun printValues(vararg a: Int) {
      for (num in a) {
          print("$num ")
      }
  }
  
  printValues(1, 2, 3, 4, 5)
  ```
- Lambda
  ```kotlin
  val multi1 = { a: Int, b: Int -> a * b }
  val multi2: (Int, Int) -> Int = { a, b -> a * b }
  
  val isPositive: (int) -> Boolean = {
      val isPositive = it > 0
      isPositive // The last expression returns
  }
  
  val isPositiveLabel: (Int) -> Boolean = number@ {
      val isPositive = it > 0
      return@number isPositive
  }
  ```
- Anonymous
  ```kotlin
  fun (x: Int, y: Int): Int =  x + y
  
  val add1: (Int, Int): Int = fun(x, y) = x + y
  val add2 = { x: Int, y: Int -> x + y }
  ```
- Inline: `infix`
  ```kotlin
  infix fun Int.multi(x: Int): Int {
      return this * x
  }

  // result = 7.multi(3)
  result = 7 multi 3
  ```
- Tail recursive: `tailrec`
  ```kotlin
  tailrec fun factorial(n: Int, run: Int = 1): Long {
      return if (n == 1) run.toLong() else factorial(n-1, run*n)
  }
  ```





