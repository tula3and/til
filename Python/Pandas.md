## Pandas

- Importing
  ```python
  import pandas as pd
  ```
- DataFrame (2D)
  ```python
  df = pd.DataFrame(
      {"a" : [4, 5, 6],
       "b" : [7, 8, 9],
       "c" : [10, 11, 12]},
       index = [1, 2, 3])
  print(df)
  ```
- Series (1D)
  ```python
  print(df["a"]) # Series
  print(df[["a"]]) # DataFrame
  ```
- Sorting
  ```python
  df.sort_values("a")
  df.sort_values("a", ascending=False)
  ```
- Deleting a column (axis=1)
  ```python
  df = df.drop(["a"], axis=1) # Default axis is 0
  ```
- Plotting
  ```python
  df.plot()
  ```

## References

- [Pandas Cheat Sheet](http://pandas.pydata.org/Pandas_Cheat_Sheet.pdf)
- [10 minute to pandas](https://pandas.pydata.org/pandas-docs/version/1.0.0/getting_started/10min.html)
