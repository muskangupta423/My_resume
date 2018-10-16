a=input("Enter the number")
if a.isdigit():
	lst=list(a)
	lst=lst[::-1]
	b="".join(lst)
	print(b)
else:
	print("Invalid, please enter number only")