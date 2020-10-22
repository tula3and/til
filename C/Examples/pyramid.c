#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>

int main() {
	int i, space, star, num;

	printf("Input pyramid layers: ");
	scanf("%d", &num);

	for (i = 1; i <= num; i++) {
		space = num - i;
		while (space > 0) {
			printf(" ");
			space -= 1;
		};
		star = 2 * i - 1;
		while (star > 0) {
			printf("*");
			star -= 1;
		}
		
		printf("\n");
	}

	return 0;
}
