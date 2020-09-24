## Encryption

- `bcrypt`
  - Before saving passwords in DB
  - Open Anaconda prompt
    ```
    conda create -n <name> python=3.8
    conda activate <name>
    pip install bcrypt
    ```
  - `python`
    ```python
    >>> import bcrypt
    >>> password = 'hello1234'
    >>> after = bcrypt.hashpw(password.encode('utf-8'), bcrypt.gensalt())
    >>> new_password = 'hello1234'
    >>> bcrypt.checkpw(new_password.encode('utf-8'), after)
    True
    ```
