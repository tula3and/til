## JavaScript tutorial

## Connect JS with HTML

```html
<script src="main.js"></script>
<script async src="main.js"></script>
<script defer src="main.js"></script>
```

- `First` stop parsing and start fetching JS codes
- `Second - async` No squence. Execute parsing and fetching in parallel.
- `Second - defer` In squence after fetching all lines. Execute parsing and fetching in parallel.

## Basic structure

```js
'use strict';
```

## Variables

```js
let num = 1;

//cannot change const
const weekends = 2;
```

- Don't use `var` because of hoisting and ignoring blocks
- No variable types
  - TypeScript = JS + variable types
- Boolean
  - false `0` `null` `undefined` `NaN` `''`
  - Strict equality `===`
      ```js
      console.log('hello' === 'hello'); //true
      console.log('1' ===  1); //false
      ```
  - Use question mark
      ```js
      console.log( 100 > 1 ? 'yes' : 'no'); //yes
      ```
      
## Operator

- `Logical` &&, ||, !
  - Put heavy operations to the back!

## Conditional

- "Early return, early exit"
    ```js
    {
      if () {
        return "something wrong"
      }

      // long statement
    }
    ```

- Switch
    ```js
    switch (variable) {
      case 'value1':
        statement;
        break;
      case 'value2':
      case 'value3':
        statement;
        break;
      default:
        statement
    }
    ```

## Function

```js
fun1 = function () { console.log("hello"); }
fun2 = () => console.log("hello");

fun1() //hello
fun2() //hello
```

## Object

- Pack data to manage easily
    ```js
    const tula = { name: 'tula', age: 100 };
    console.log(tula.name); //most
    console.log(tula['name']); //call a function
    ```
- Make many objects at once
    ```js
    //using function
    function Person(name, age) {
        this.name = name;
        this.age = age;
    }

    //copy and modify
    const other = Object.assign({}, tula);
    ```

## References

- [자바스크립트 기초 강의 (ES5+): 같이 노트를 작성하며 배워요](https://www.youtube.com/playlist?list=PLv2d7VI9OotTVOL4QmPfvJWPJvkmv6h-2)
