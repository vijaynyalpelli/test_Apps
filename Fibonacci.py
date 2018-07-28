def fibbonaci (number):
    if (number == 0):
        print ("No numbers")
    elif (number == 1):
        print ("0, ", end="")
    else:
        a = 0;
        b = 1;
        i = 0;
        while (i < number):
            print (a)
            b = a + b
            a = b - a
            i = i + 1

number = int(input("Enter the number : "))
fibbonaci(number)



