## Logic gates

- Boolean gates
  - NOT, AND, OR, and DUPE
  - `Reversible`
    - Can be `quantum gates`
    - NOT, CNOT, CCNOT(or Toffoli)
    - CNOT<br/>![cnot](https://user-images.githubusercontent.com/62553200/96273827-bfe36400-100a-11eb-9429-d15cc663702c.png)
    - CCNOT<br/>![ccnot](https://user-images.githubusercontent.com/62553200/96274608-aa226e80-100b-11eb-9783-04d05ad94256.png)
  - Not-reversible: AND, OR, NAND, DUPE
- Universal gate: NAND
  - NAND(x, y) =  NOT(AND(x, y))
  - AND(x, y) = NOT(NOT(AND(x, y))) = NOT(NAND(x, y))
  - OR(x, y) = NOT(AND(NOT(x), NOT(y))) = NAND(NOT(x), NOT(y))
  - NOT(x) = NAND(DUPE(x))
