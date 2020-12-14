## Go tutorial

- 컴파일할 파일은 `main.go`로 설정해야 한다.
- 가장 첫 줄에는 `package <file_name>`을 적어야 한다.
- 다른 패키지에서 함수를 사용할 때에는 `import`에 적어주면 된다.
  - VScode에서는 자동으로 추가된다.
- 패키지에서 함수를 선언할 때
  - 함수 이름 대문자로 시작: 외부에서 사용 가능
  - 함수 이름 소문자로 시작: 외부에서 사용 불가능 (private)

## Constant and Variable

- `const | var` `<name>` `<type>`
- `const name string = "tula"`
- `var name string = "tula"` == `name := "tula"`
  - 두 번째 축약형을 사용할 경우 타입을 알아서 찾아 준다. (파이썬처럼)
  - 단, 축약형은 `func` 안에서만 사용 가능

## Function

- 타입 명시
  ```go
  func multifly(a int, b int) int {
    return a * b
  }
  ```
- 여러 return 값을 가질 수 있다.
  ```go
  func lenAndUpper(name string) (int, string) {
    return len(name), strings.ToUpper(name)
  }
  
  /* naked return
  func lenAndUpper(name string) (length int, upperName string) {
    length = len(name)
    upperName = strings.ToUpper(name)
    return
  }
  */

  func main() {
    length, upperName := lenAndUpper("tula")
    fmt.Println(length, upperName)
  }
  ```
- `_`를 사용해서 반환값을 무시할 수도 있다.
  ```go
  func lenAndUpper(name string) (int, string) {
    return len(name), strings.ToUpper(name)
  }

  func main() {
    length, _ := lenAndUpper("tula")
    fmt.Println(length, upperName)
  }
  ```
- 가변 인자: `...`으로 선언
  ```go
  func repeatWord(words ...string) {
    fmt.Println(words)
  }

  func main() {
    repeatWord("tula", "hello", "world")
  }
  ```
- 함수 실행이 끝난 걸 `defer`을 통해 명시할 수 있다.
  ```go
  defer fmt.printIn("I'm done")
  ```

## Loop

- `for` and `range`
  ```go
  func printAll(numbers ...int) {
    for index, number := range numbers {
      fmt.Println(index, number) // range includes index
    }
  }
  
  /*
  func printAll(numbers ...int) {
    for i := 0; i < len(numbers); i++ {
      fmt.Println(numbers[i])
    }
  }
  */

  func main() {
    printAll(1, 2, 3, 4, 5)
  }
  ```

## `if` and `switch`

- `if`
  ```go
  func canIPass(height int) bool {
    if height > 150 {
      return true
    }
    return false
  }
  ```
- if 문 내에서 변수 추가 가능
  ```go
  func canIPass(height int) bool {
    if newHeight := height + 10; newHeight > 150 {
      return true
    }
    return false
  }
  ```
- `switch`
  ```go
  func canIPass(height int) bool {
    switch { // switch newHeight := height + 10; newHeight {
    case height > 150:
      return true
    case height < 30:
      return true
    }
    return false
  }
  ```

## Pointer

```go
func main() {
  a := 1
  b := &a
  *b = 100
  fmt.PrintIn(a) // 100
}
```

## Array and Slice

- Array: 크기 제한 O
  ```go
  words := [3]string{"tula", "hello", "word"}
  words[0] = "github"
  ```
- Slice: 크기 제한 X
  ```go
  words := []string{"tula", "hello", "word"}
  words = append(words, "github") // append doesn't modify the slice
  ```

## `map`

```go
tula := map[string]string{"name": "tula", "age": "100"}
fmt.Println(tula) // map[age:100 name:tula]

/*
for key, value := range tula {
  fmt.Println(key, value)
}
*/
```

## Struct

```go
type person struct {
	name    string
	age     int
	favFood []string
}

func main() {
	favFood := []string{"sushi", "cakes"}
	tula := person{name: "tula", age: 100, favFood: favFood}
	fmt.Println(tula)
}
```

