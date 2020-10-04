def main():
	//prompt user for their name and call it in say_hello
	name = input("Enter your name: ")
	say_hello(name)

def say_hello(name):
	//print name in correct format
	print("Hello, " + name + "!")

//call main
main()
