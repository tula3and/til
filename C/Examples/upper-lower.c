#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>
#include <string.h>

int main() {
	char string[100];
	int i = 0;

	scanf("%s", string);

	while (i < strlen(string)) {
		if (string[i] >= 'A' && string[i] <= 'Z') {
			string[i] += 32;
		}
		else if (string[i] >= 'a' && string[i] <= 'z') {
			string[i] -= 32;
		}

		i += 1;
	}

	printf("result: %s", string);

	return 0;
}
