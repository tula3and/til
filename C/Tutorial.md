## C tutorial

- 1 Byte = 8-bit
- 1 Kilobyte(KB) = 2^10 bytes
- 1 Megabyte(MB) = (2^10)^2 bytes
- GB, TB, PB, EB, ZB, ...

## In Visual Studio

- 솔루션 `.sin` > 프로젝트 `.vcxproj`
- *.c → 컴파일 → *.obj → 링크 → *.exe
  - 컴파일 오류, 링크 오류, 논리 오류
  - 컴파일 전에 전처리기의 전처리 과정이 필요
    - 전처리 지시자는 `#`으로 시작

## Basic structure

```c
//scanf(" %d", &num)
//make a space | use getchar()
#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>

int main() {
  //statements
  
  return 0;
}
```

- 전처리(`#`뒤에 오는 것들) → 외부선언 → 함수 `main()` → 기타 함수구현
- 매크로 상수
  - `#define` 으로 정의
  - 정의 시, 매개변수를 모두 괄호로 묶는 게 좋음
  - 두 줄 이상일 경우, `\`으로 연결 가능
- 식별자(identifiers): 변수 또는 함수 이름
  - 영문자, 숫자, 밑줄 `_`로 구성
  - 식별자의 첫 문자로 숫자 불가능
  - 예약어(reserved word, keyword) 사용 불가능: `auto` `default` `enum` `volatile` `union` 등
- bool 자료형이 따로 없다. → `enum`으로 정의 가능
  ```c
  //FALSE == 0, TRUE == 1
  //0, 0.0, \0 mean false
  enum bool {FALSE, TRUE};
  ```
- 주석(comments): `//` 또는 `/* ... */`

## 자료형

- %`<+|-|0|#>` `<전체폭>`.`<소수점아래폭>` `<d|i|f|o|x|X>`
  - `+`만 적을 경우: 우측정렬, + 출력
  - `-`만 적을 경우: 좌측정렬
  - `0`만 적을 경우: 빈칸을 `0`으로 채움
  - `#`만 적을 경우: 8진수 `0` 또는 16진수 `0x|0X` 서식문자가 붙음
  - 아무것도 안 적을 경우: 우측정렬
- % `<전체폭>`.`<출력문자수>`s
- 정수형(%d)
  - short(%hd): 2 bytes
  - int: 4 bytes
  - long long: 8 bytes
  - unsigned(%u) 붙일 경우 0과 양수만 가능
    - unsigned 오버플로 `255 + 1` → `0`
    - unsigned 언더플로 `0 - 1` → `255`
    - 음수를 나타낼 때, 2의 보수를 취한다.
      1. 1의 보수(모든 자리에 `NOT` 연산)를 취한다.
      2. 1을 더한다.
  - 선언 시, 가장 앞에 `0`을 붙이면 `8진수`, `0x`을 붙이면 `16진수`로 인식
  - 출력 시, % 뒤에 `#`을 넣으면 `0` 또는 `0x` 표기
    - 10진수: %d, %i
    - 8 진수: %o, %#o
    - 16진수: %x, %X, %#x, %#X
- 부동소수형
  - float(%f): 4 bytes
    - 소수점 아래 6자리까지
    - float 오버플로 `10^38` 이상 → `inf`
    - float 언더플로 매우 작은 수 → `0.000000`
  - double(%lf): 8 bytes
    - 지수 표현 `1.234E+3` = `1.234 * 10^3`
  - `#include <float.h>`
    - float 최대 최소 매크로 상수(%e): `FLT_MAX` `FLT_MIN`
    - double 최대 최소 매크로 상수(%e): `DBL_MAX` `DBL_MIN`
    - long double 최대 최소 매크로 상수(%e): `LDBL_MAX` `LDBL_MIN`
- 문자형
  - char: 1 byte
    - `문자열 길이 == 1`이면
      - 선언 시, 작은 따옴표를 이용
      - 출력 시, `%c`
    - `문자열 길이 > 1`이면
      - 선언 시, 큰 따옴표 이용
      - 출력 시, `%s`
    - `문자 | 정수 | \8진수 | \16진수`를 변수로 넣은 다음, 출력 시 `%`에 따라 문자 또는 정수(아스키코드 기준) 출력 가능
      - 아스키코드: 초창기 7-bit 인코딩 → 8-bit 인코딩
        - 대문자 + 32 == 소문자
      - 유니코드: 16-bit, 전 세계의 모든 문자 표기 가능
  - 문자열 선언하기
    ```c
    char string1[] = { 'h', 'e', 'l, 'l', 'o', '\0' };
    char string2[] = "hello";
    char string3[10] = "hello";
    char *string4 = "hello";
    
    char *string5[] = { "hello", "world" };
    char string6[][] = { "hello", "world" };
    ```

## 연산자

- 전위(prefix) 연산자와 후위(postfix) 연산자

    ```c
    int main() {
      int num1 = 10;
      int num2 = (num1--) + 2;

      printf("num1: %d \n",  num1); //9
      printf("num2: %d \n",  num2); //12

      return 0;
    }
    ```

- `Logical` &&, ||, !

## 조건과 반복

- `switch`: `case` 다음에 변수는 올 수 없다.
  ```c
  switch (num) {
  case 1: case 4: //num == 1 || num == 4 실행
    //statements
    break;
    
  case 2:
    //statements
    break;
    
  case 3:
    //statements
    break;
    
  default:
    printf("It doesn't match.\n");
  }
  ```
- 조건 연산자 `<조건> ? 참 : 거짓`
  ```c
  (<조건> ? <조건>이 참일 경우 실행 : <조건>이 거짓일 경우 실행);
  num = (<조건> ? <조건>이 참일 경우 선택 : <조건>이 거짓일 경우 선택);
  ```

## 배열

- 주소값 `&array[i]` == `score + i`
- 참조값 `score[i]` == `*(score + i)`

## 포인터

- 포인터의 변수 값과 포인터가 가르키는 변수의 자료형이 같아야 한다.
- num와 *p, &num와 p
    ```c
    #include <stdio.h>

    int main() {
      int *p = NULL; //int *p;
      int num = 1;

      p = &num;

      printf("%d\n", num);  //1
      printf("%d\n", &num); //8387196
      printf("%d\n", p);    //8387196
      printf("%d\n", *p);   //1

      return 0;
    }
    ```
- 증감 연산자 후위 증감의 우선 순위가 전위 증감과 참조 연산자 `*`의 우선 순위보다 높다.
  - 전위 증감과 참조 연산자는 `우 → 좌`로 계산한다.
  - `*p++` == `*(p++)`
  - `++*p` == `++(*p)`
  - `*++p` == `*(++p)`
- `const`와 `*`가 같이 있을 때
  ```c
                                //error
  int const *pi = &i;           //*pi = 100;
  int* const pii = &i;          //pii = &j;
  char* const title = "hello";  //title = "world"
  ```
- 함수를 이용해 변수에 접근할 때
  - 포인터로 접근하지 않을 경우, C에서는 기본적으로 `call by value`가 설정되어 있기 때문에 원래 값에는 변화가 없다.
  - 원래 값에 접근하려면 포인터를 이용해 `call by reference`를 구현하면 된다.
- 함수에서 배열을 전달인자로 넘기면 실제 그 배열 메모리 전체가 함수로 넘어가지 않고, 배열의 가장 첫 번째 주소가 전달인자가 된다.
  - 배열을 매개변수에서 선언할 때 `arr[]` 또는 `*arr`을 적는다.
  - 배열의 이름은 포인터 변수와 동일한 역할을 한다.
  - 배열의 주소는 연결되어 있어서 첫 번째 주소값을 이용해 그 다음의 값들도 가져올 수 있다.
    - 배열에서 포인트 주소를 n 증가시키면 (n * 자료형의 크기) 만큼 커진다.
- 배열 선언 시
  - 이차원 배열 `(*ptr)[3]`
  - 일차원 배열 `*ptr[3]`
- 배열 포인터를 이용해서 출력하기
  ```c
  #include <stdio.h>

  int main() {
    int arr[3][4] = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12} };
    int(*ptr)[4] = arr;
    int i, j;

    printf("이중포인터(**)로 출력\n");
    for (i = 0; i < 3; i++) {
      for (j = 0; j < 4; j++) {
        printf("%d\n", *(*(arr + i) + j)); //배열에 주소값 참고
      }
    }

    printf("*ptr[i]로 출력\n");
    for (i = 0; i < 3; i++) {
      for (j = 0; j < 4; j++) {
        printf("%d\n", *(ptr[i] + j));
      }
    }

    return 0;
  }
  ```

## 구조체

- 하나 이상의 변수를 묶은 덩어리
- 변수만 묶은 형태로, 파이썬의 `class`와는 다른 개념이다.
- 구조체 선언하기
  - `struct <구조체 이름> {};`
      ```c
      #include <stdio.h>

      struct person {
        char name[15];
        int age;
      };

      int main(){
        struct person tula; //struct person tula = { .name = "tula", .age = "20" };

        scanf("%s", tula.name);
        scanf("%d", &tula.age);

        printf("name : %s\nage : %d\n", tula.name, tula.age);

        return 0;
      }
        ```
  - `typedef struct _<구조체 이름(생략 가능)> {} <구조체 이름>;`
      ```c
      #include <stdio.h>

      typedef struct _Person {
        char name[15];
        int age;
      } Person;

      int main(){
        Person tula;

        scanf("%s", tula.name);
        scanf("%d", &tula.age);

        printf("name : %s\nage : %d\n", tula.name, tula.age);

        return 0;
      }
      ```
- 구조체를 배열로 사용하기
    ```c
    #include <stdio.h>

    typedef struct _Person {
    	char name[15];
    	int age;
    } Person;

    int main(){
    	Person tula[3];
        
    	for (int i = 0; i < 3; i++) {
    		scanf("%s", tula[i].name);
    		scanf("%d", &tula[i].age);  
    	}

    	for (int i = 0; i < 3; i++) {
    		printf("name : %s, age : %d\n", tula[i].name, tula[i].age);
    	}
        
    	return 0;
    }
    ```
- 함수에 구조체 전달하기 - `p->` 또는 `(*p)`
    ```c
    #include <stdio.h>

    typedef struct _Person{
    	int age;
    } Person;

    void change(Person *p){
    	p->age = 30; //(*p).age = 30;
    }

    int main(){
    	Person tula;
    	tula.age = 20;
    	printf("Before ");
    	printf("%d\n", tula.age);
    	
    	change(&tula);
        
    	printf("After ");
    	printf("%d", tula.age);
    }
    ```
