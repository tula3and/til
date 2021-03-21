## Basic concepts

- Data abstraction
  - A data type: a collection of `objects` and a set of `operations` that act on those objects
  - An abstract data type is also a data type:
    - Specification of the objects
    - Specification of the operations on the objects
    - Seperated from the representation of the objects and the implementation of the operations
  - ADT (abstract data type): objects + functions (operations)
      - Creators (Constructors): `int i`
      - Transformers: `10 * 10`
      - Observers (Reporters): `sizeof(i)`
- Data structure: data type + storage structure
- Program: data structure + algorithm
- Definitions of algorithm
  - A finite set of instructions that accomplishes a particular task
  - input ≥ 0
  - output > 0
- System life cycle
  - Requirement specification: 요구 사항 기술
  - Analysis: top-down, bottom-up
  - Design: language-indepentent
    - Data objects that the program needs: abstract data type
    - Operations performed on the data objects: algorithm specifications
  - Implementation: 이행
  - Testing
- Performance analysis: machine-independent
  - Time complexity
    - T(P) = compile time + execution time
    - Count program step: 정확히 세기
      - Using a global variable: don't count setting variables
        - `for` loop
          ```c
          float sum(float list[], int n) {
            float tempsum = 0; // +1
            int i;
            for (i = 0; i < n; i++) { // +(n+1)
              tempsum += list[i]; // +n
            }
            return tempsum; // +1
          }
          // total of program steps is 2n+3
          ```
        - Recursive
          ```c
          float rsum(float list[], int n) {
            count++; // if conditional
            if (n) { // +(n+1)
              count++; // return
              return rsum(list, n-1) + list[n-1]; // +n
            }
            count++; // return
            return 0; // +1
          }
          // count value is 2n+2
          ```
      - Using a tabular method
    - Three kinds of step counts: best-case, worst-case, average
    - Motivation to determine step counts
      - Compare two programs for the same function
      - Predict the runtime as the change of input values
    - Asymptotic notation: max (O), min (Ω), max and min (Θ)
      - Big O notation: delete coefficient (그래서 Ω나 Θ도 표기 방법 동일)
      - O(1) < O(logn) < O(n) < O(nlogn) < O(n^2) < O(n^3) < O(2^n)
  - Space complexity
    - S(P) = fixed space (constant) + variable space
    - Variable: per recursive call: for each recursive call, compiler must save three things
      1. parameters
      2. local variables
      3. the return address
    - Example: S(P) = (4 * 3) * n bytes
      ```c
      // two parameters: 4 * 2 bytes
      float rsum(float list[], int n) {
        // return address: (used internally) 4 bytes
        if (n) return rsum(list, n-1) + list[n-1];
        return 0;
      }
      ```
- Measurement analysis: machine-dependent
  - `clock()`: 1/1000 sec
  - `duration = ((double)(clock() - start)) / CLOCKS_PER_SEC;`
