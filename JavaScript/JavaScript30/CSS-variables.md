## [CSS variables](https://youtu.be/AHLNzv13c2I)

- `||`
  ```js
  const s1 = "hello" || "world"
  console.log(s1) // hello
  
  const s2 = undefined || "world"
  console.log(s2) // world
  
  let d;
  d = false || undefined; // undefined
  d = undefined || false; // false
  ```
- Change values: [using CSS custom properties](https://developer.mozilla.org/ko/docs/Web/CSS/Using_CSS_custom_properties)
  ```js
  function handleUpdate() {
      const suffix = this.dataset.sizing || ''; // Add an unit
      document.documentElement.style.setProperty(`--${this.name}`, this.value + suffix);
  }
  ```
