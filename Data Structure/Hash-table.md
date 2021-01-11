## Hash table

- Key - Value
- Dictionary in python
- Find hash address through hashing function
- Make a hash table not using dictionary
  ```python
  hash_table = [0 for i in range(8)]
  
  def hash_func(num): # Or use hash()
      return num % 8

  def save_data(data, value):
      key = ord(data[0]) # ASCII
      hash_address = hash_func(key)
      hash_table[hash_address] = value
  
  def read_data(data):
      key = ord(data[0])
      hash_address = hash_func(key)
      return hash_table[hash_address]
  ```
- Biggest problem: collision
  - How to solve it?
    1. Chaining (Open hashing - using memory outside): use linked list
    2. Linear probing (Close hashing - using memory inside): move the fixed space
    3. Redefine hash function or expand storage space of hash table: make lesser collisions
- Hash functions in Python
  - `hash(<data>)`
  - SHA: Secure Hash Algorithm
  - SHA-1 or SHA-256: [`hashlib`](https://docs.python.org/ko/3.10/library/hashlib.html)
    ```python
    import hashlib
    
    data = 'test'.encode()
    hash_object = hashlib.sha1() # or hashlib.sha256()
    
    # Result changes everytime you repeat this code
    hash_object.update(data)
    
    dig = hash_object.digest()
    print(dig) # <class 'bytes'>
    
    hex_dig = hash_object.hexdigest()
    print(hex_dig) # <class 'str'>
    ```

