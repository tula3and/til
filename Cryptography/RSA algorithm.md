## RSA algorithm

- Public-key cryptography
- John has `public key` and `private key`.
  - John is the only owner of `private key`.
  - Anyone can access `public key`.
- Main process
  1. John makes `public key` and `private key`.
  2. A person who sends information to John encrypts it with `public key`.
  3. John decrypts the encrypted information with `private key`.
- How to make `public key` and `private key`
  - `public key`
    - n, e
    - n = p * q (p, q are prime numbers)
    - e
      - Φ(n) = (p - 1) * (q - 1)
      - 1 < e < Φ(n) (e is `relatively` prime with Φ(n))
  - `private key`
    - n, d
    - d
      - (e * d) mod Φ(n) = 1
- How to encrypt and decrypt
  - Before encryption 🍎
  - After encryption 🔒
  - Encryption
    ```
    🔒 = 🍎^e mod n
    ```
  - Decryption
    ```
    🍎 = 🔒^d mod n
    ```
- Stability
  - Prime factorization with big numbers
  - Inverse operation of remainder operation

