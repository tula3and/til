## [Drum kit](https://youtu.be/VuN8qwZoego)

- [addEventListener()](https://developer.mozilla.org/ko/docs/Web/API/EventTarget/addEventListener)
  ```js
  // <EventTarget>.addEventListener(<EventType>, <EventListener>)
  window.addEventListener('keydown', function(e) {
      console.log(e); // e is KeyboardEvent
      console.log(e.keyCode); // keycode.info
  });
  ```
