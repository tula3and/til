## [Clock](https://youtu.be/xu87YWbr4X0)

- Rotate hands (CSS)
  ```css
  transform: rotate(<degree>deg);
  transform-origin: 100%;
  ```
- `setInterval(<func>, <time>)`: repeat a function every fixed time
  - `<time>`: `1000` == 1 sec
- Get the time now: [`Date()`](https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Global_Objects/Date)
  ```js
  const now = new Date();
  const seconds = now.getSeconds();
  const minutes = now.getMinutes();
  const hours = now.getHours();
  ```




