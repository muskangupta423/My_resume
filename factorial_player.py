a=input("Enter the number")
f=1
if a.isdigit() and a<=20:
	for i in range(1,int(a)+1):
		f=f*i
	print("Factorial is",f)
else:
	print("Invalid")