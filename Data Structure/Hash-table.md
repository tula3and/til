## Hash table

- Key - Value
- Dictionary in python
- Find hash address through hashing function
- Make a hash table not using dictionary
  ```python
  hash_table = [0 for i in range(8)]
  
  def hash_func(num): # or use hash()
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

