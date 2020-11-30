#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>
#include <string.h>
//#include <ctype.h>

int main() {
	char string[100];
	int i = 0;

	scanf("%s", string);

	while (i < strlen(string)) {
		if (string[i] >= 'A' && string[i] <= 'Z') {
			string[i] += 32;
			//string[i] = tolower(string[i]);
		}
		else if (string[i] >= 'a' && string[i] <= 'z') {
			string[i] -= 32;
			//string[i] = toupper(string[i]);
		}

		i += 1;
	}

	printf("result: %s", string);

	return 0;
}
