## Rules to modify [my Github blog](https://tula3and.github.io/)

- How to arrange posts as series
  - Navigation bar is on the [left top](https://stackoverflow.com/questions/12102069/whats-the-difference-between-left-top-and-top-left-in-jquery-ui-position)
  - Determine `<nav name>` by adding the text below to `_data / navigation.yml`
    ```
    <nav name>:
      - title: "<example title>"
        children:
          - title: "<inline title>"
            url: post link - start with /
          - title: "<inline title>"
            url: post link - start with /
    ```
  - Add the text below at the top of posts
    ```
    sidebar:
      - nav: <nav name>
    ```
