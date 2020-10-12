## Diffie-Hellman key exchange

- Symmetric-key cryptography
- For not encrypted environment
  - 2 Half-information → 1 entire key
- Main process
  - p, q (p, q are prime numbers)
  - Alice → A, Bob → B
  - Alice sends `p^A % q` to Bob
  - Bob sends `p^B % q` to Bob
  - For Alice, key is `(p^B % q)^A % q`
  - For Bob, key is `(p^A % q)^B % q`
- [Why two keys are the same?](https://github.com/tula3and/til/blob/master/Mathematics/Discrete-mathematics.md#%EC%A6%9D%EB%AA%85)
