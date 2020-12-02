#include <stdio.h>
#define LIMIT 5

int main() {
	char number[LIMIT + 1];
	char name[10];
	
	printf("Input your number: ");
	fgets(number, sizeof(number), stdin);
	while (getchar() != '\n');
	
	printf("Input your name: ");
	fgets(name, sizeof(name), stdin);
	
	printf("Your number: %s\n", number);
	printf("Your name: %s\n", name);
	
	return 0;
}
