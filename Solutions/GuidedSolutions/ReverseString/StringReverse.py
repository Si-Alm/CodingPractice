def main():
	#some strings to test your function
	strings = ["Hacktoberfest", "Coding is fun", "Another string"]
	for s in strings:
		print(reverse_string(s))

	'''
	expected output:
		tsefrebotkcaH
		nuf si gnidoC
		gnirts rehtonA	   
	'''

#function to complete
def reverse_string(string):
	return string[::-1]

main()
