## TypeScript tutorial

- Install [Node.js](https://nodejs.org/en/download/) and [Yarn](https://classic.yarnpkg.com/en/docs/install#windows-stable)
- Install typescript with `yarn global add typescript`
  - If the error `Cannot find module 'typescript/bin/tsc'` occurs using `tsc-watch`:
    ```
    yarn global remove typescript
    yarn add typescript
    ```
- Use `?` setting optional parameters
- Use `interface` or `class` to specify a group (e.g. blocks in blockchain)
  - `interface` does not exist in javascript
  - `class` exists in javascript but some functions are only in typescript
    - `static` functions
    - `public` or `private` declaration of variables

