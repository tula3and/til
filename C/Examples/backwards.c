#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>

int main() {
	int num, over_zero, remain;

	printf("Input a number: ");
	scanf("%d", &num);

	if (num < 0) {
		num = -(num);
		over_zero = 0;
	}
	else {
		over_zero = 1;
	}

	while (num != 0)
	{
		remain = num % 10;
		printf("%d", remain);
		num = num / 10;
	}

	if (!over_zero)
	{
		printf("-");
	}

	return 0;
}
