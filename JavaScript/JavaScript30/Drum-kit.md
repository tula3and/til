## [Drum kit](https://youtu.be/VuN8qwZoego)

- [addEventListener()](https://developer.mozilla.org/ko/docs/Web/API/EventTarget/addEventListener)
  ```js
  // <EventTarget>.addEventListener(<EventType>, <EventListener>)
  window.addEventListener('keydown', function(e) {
      console.log(e); // e is KeyboardEvent
      console.log(e.keyCode); // keycode.info
  });
  
  // .key in CSS has transition with time limit
  // Constantly execute
  keys.forEach(key => key.addEventListener('transitioned', removeTransition));
  ```
- [querySelector()](https://developer.mozilla.org/ko/docs/Web/API/Document/querySelector)
  - `document.querySelector(<selectors>);`: [template literals](https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Template_literals)
    ```js
    window.addEventListener('keydown', function(e) {
        const audio = document.querySelector(`audio[data-key="${e.keyCode}"]`);
        if (!audio) return;
        audio.currentTime = 0;
        audio.play();
    });
    ```
  - `document.querySelectorAll(<selectors>);`
    ```js
    const keys = document.querySelectorAll('.key');
    ```
- [classList](https://developer.mozilla.org/en-US/docs/Web/API/Element/classList): using `add()` and `remove()` methods
  ```js
  window.addEventListener('keydown', function(e) {
      const key = document.querySelector(`.key[data-key="${e.keyCode}"]`);
      key.classList.add('playing');
  });
  
  function removeTransition(e) {
      if (e.propertyName !== 'transform') return; // Many events occur but choose just one
      this.classList.remove('playing');
  }
  ```



