import time
import matplotlib.pyplot as pl
import numpy as num
n= int(raw_input())

a=[]
b=[]
t=0
t1=0
for x in range(1,n+1):
    a.append((x))
    c=num.full((x,x),1)
    d=num.full((x,x),2)
    e=num.full((x,x),0)
    for y in range(x):
        tt=time.clock()
        e=c.dot(d)
        t=t+time.clock()-tt
        t1=t1+1
    t=t/t1
    b.append(t)


pl.xlabel("Tamano de la matriz")
pl.ylabel("Tiempo")
pl.title("Tiempo estimado")
pl.plot(a,b)
pl.show()

for x in range(len(b)):
    print "Tiempo para n="+str(x+1)+": " + str(b[x])
