// sparse matrix
// in the index 0: the length of row and column and the number of elements which are not zero
typedef struct {
	int row;
	int col;
	int value;
} term;

void fastTranspose(term a[], term b[]) { // transposing a to save in b (row major order)
	int rowCnt[MAX_COL], starting[MAX_COL];
	int i, j, numCols = a[0].col, numTerms = a[0].value;

	b[0].row = numCols;
	b[0].col = a[0].row;
	b[0].value = numTerms;

	if (numTerms > 0) {
    		// initalize 0
		for (i = 0; i < numCols; i++) rowCnt[i] = 0;
    		// count the number of each column
		for (i = 1; i <= rowCnt; i++) rowCnt[a[i].col]++;

		// calculate starting
		starting[0] = 1;
		for (i = 1; i < numCols; i++) starting[i] = starting[i - 1] + rowCnt[i - 1];

		for (i = 1; i <= numTerms; i++) {
			j = starting[a[i].col]++;
			b[j].row = a[i].col;
			b[j].col = a[i].row;
			b[j].value = a[i].value;
		}
	}
}
