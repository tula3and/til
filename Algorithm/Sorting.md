## Sorting

- Name (Best / Worst time complexity)
- Stable sort: positions of same key do not change
  - Insertion sort (n, n^2)
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
  - Merge sort (nlogn, nlogn)
    ```c
    void merge(int* init, int i, int m, int n) {
        int* merged = malloc(sizeof(int) * (n + 1));
        int j, k, t;
        // copy all to merged
        for (j = i; j <= n; j++) {
            merged[j] = init[j];
        }
        // first start index: i
        // second start index: j
        j = m + 1;
        // save a sorted result to init using k
        k = i;
        while (i <= m && j <= n) {
            if (merged[i].key <= merged[j].key) {
                init[k++] = merged[i++];
            }
            else {
                init[k++] = merged[j++];
            }
        }
        // add remains
        if (i > m) {
            for (t = j; t <= n; t++) {
                init[t] = merged[t];
            }
        }
        else {
            for (t = i; t <= m; t++) {
                init[k + t - i] = merged[t];
            }
        }
    }

    void merge_sort(int *list, int left, int right, int n) {
        int mid;
        if (left < right) {
            mid = (left + right) / 2;
            merge_sort(list, left, mid, n); // sort the front
            merge_sort(list, mid + 1, right, n); // sort the rear
            merge(list, left, mid, right); // merge
            printList(list, n);
        }
    }
    ```
  - Bubble sort (n^2, n^2)
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
- Unstable sort
  - Selection sort (n^2, n^2)
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
  - Heap sort (nlogn, nlogn): [Tree - Heap](https://github.com/tula3and/til/blob/master/Data%20Structure/Tree.md#tree)
  - Shell sort (n, n^2)
  - Quick sort (nlogn, n^2)
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


