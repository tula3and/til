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

