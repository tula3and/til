## Sorting

- Selection sort
  ```c
  int min, where, temp;
  for (int i = 0; i < size - 1; i++) {
      min = arr[i]; where = -1;
      for (int k = i + 1; k < size; k++) {
          if (min > arr[k]) {
              min = arr[k];
              where = k;
          }
      }
      if (where == -1) continue;
      temp = arr[i];
      arr[i] = min;
      arr[where] = temp;
  }
  ```
