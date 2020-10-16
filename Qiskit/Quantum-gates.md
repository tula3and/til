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

## Quantum gates

- Hadamard(H) gate<br/>
![hgate](https://latex.codecogs.com/gif.latex?%5Cfrac%7B1%7D%7B%5Csqrt%7B2%7D%7D%5Cbegin%7Bbmatrix%7D%201%20%26%201%20%5C%5C%201%20%26%20-1%20%5Cend%7Bbmatrix%7D)
