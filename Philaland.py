def value():
    a=[]
    
    for test in range(int(input())):        
    	a.append(len(bin(int(input()))[2:]))
        
    for i in range(len(a)):
        print(a[i])

   
    
value()
