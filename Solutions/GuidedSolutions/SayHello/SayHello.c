#include <stdio.h>

void sayHello(char* name) {
	//print hello, name
	printf("Hello, %s", name);
}

int main() {
	//create variable to read name into
	char name[35];

	//prompt user for name
	printf("Enter your name(under 35 characters): ");
	
	//read name from input
	if(fgets(name, sizeof(name), stdin))	
		sayHello(name);
	else
		return 1; //return with error if name was not read correctly

	//return without error
	return 0;
}
