import time
import matplotlib.pyplot as plt

n=int(raw_input())
tiempo=[]
s=[];
a=0;
b=1;
c=0;
tt=time.clock();
tiempo.append(time.clock()-tt);
s.append(1)
if (n==1):
    print 1
else:
    for x in range(1,n):
        c=a+b;
        a=b;
        b=c;
        t=time.clock()-tt;
        tiempo.append(t)
        s.append(x+1)
    print c
print tiempo
print s
plt.plot(s,tiempo)
plt.xlabel("numero n")
plt.ylabel("tiempo")
plt.show()
