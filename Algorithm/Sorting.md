## Sorting

- Selection sort
  ```c
  void insertion_sort(int list[], int n) {
    int i, j, temp;

    for (i = 1; i < n; i++) {
      temp = list[i];
      for (j = i - 1; j >= 0 && list[j] > key; j--) {
        list[j + 1] = list[j]; // move to the right
      }
      list[j + 1] = temp;
    }
  }
  ```
- Bubble sort
  ```c
  void bubble_sort(int list[], int n) {
    int i, j;
    for (i = n - 1; i > 0; i--) {
      for (j = 0; j < i; j++) {
        if (list[j] > list[j + 1]) {
          int temp = list[j];
          list[j] = list[j + 1];
          list[j + 1] = temp;
        }
      }
    }
  }
  ```
- Quick sort
  ```c
  // left = 0, right = n - 1
  void quick_sort(int list[], int left, int right, int n) {
    int pivot = list[left];
    int i, j, temp;
    // size > 1
    if (left < right) {
      i = left + 1; j = right + 1;
      while (i < j) {
        j--;
        while (list[i] < pivot && i < n) i++;
        while (list[j] > pivot && j > -1) j--;
        // #define SWAP(x, y, temp) ((temp) = (x), (x) = (y), (y) = (temp))
        if (i < j) SWAP(list[i], list[j], temp);
      }
      // move pivot to divide
      SWAP(list[left], list[j], temp);
      quick_sort(list, left, j - 1, n);
      quick_sort(list, j + 1, right, n);
    }
  }
  ```


