## Search

- Binary search: [수 찾기](https://github.com/tula3and/til/blob/master/Coding%20Questions/Baekjoon/%EC%88%98-%EC%B0%BE%EA%B8%B0.md)
  ```c
  // recursive
  int binarySearch(int arr[], int start, int end, int search) {
      // printf("call binarySearch: left=%d right=%d\n", start, end);
      if (start - end >= 1) return -1;
      int middle = (start + end) / 2, result;
      if (search > arr[middle]) {
          start = middle + 1;
      }
      else if (search == arr[middle]) {
          result = middle;
          return result;
      }
      else {
          end = middle - 1;
      }
      binarySearch(arr, start, end, search);
  }
  ```
