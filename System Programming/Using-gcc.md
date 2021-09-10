## Using gcc

- Download gcc
  ```
  sudo apt-get install gcc 
  ```
- Difference between `gcc` and `cc`: `cc` is a complier only for C lang, but `gcc` for C, C++, Java, and so on.
- Example: complie `main.c`
  ```
  gcc -c main.c
  gcc -o main main.o
  ./main
  ```
- Make `Makefile`: very tired to type all the commands while changing
  - `<target>`: `<parameter(s)>`
    ```
    main: main.o
      gcc -o main main.o
    main.o: main.c
      gcc -c main.c
    ```
  - Shortcut: use `$@` and `$?`
    ```
    main: main.o
      gcc -o $@ $?
    main.o: main.c
      gcc -c $?
    ```
  - Execute Makefile: `make <target>`
  - Error `:makefile:<line>: *** missing separator. Stop.`: check `set sets=` in .vimrc
