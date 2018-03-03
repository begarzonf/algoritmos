import time
import matplotlib.pyplot as pl

n= int(raw_input())

a=[]
b=[]
t=0
t1=0
for x in range(1,n+1):
    a.append((x))
    c=[[1 for y in range(x)] for y in range(x)]
    d=[[2 for y in range(x)] for y in range(x)]
    e=[[0 for y in range(x)] for y in range(x)]
    for y in range(x):
            for z in range(x):
                    tt=time.clock()
                    for w in range(x):
                        e[y][z]=e[y][z]+(c[y][w]*d[w][z])
                    t=t+time.clock()-tt
                    t1=t1+1
    t=t/t1
    b.append(t)

pl.xlabel("Tamano de la matriz")
pl.ylabel("Tiempo")
pl.title("Timpo estimado")
pl.plot(a,b)
pl.show()

for x in range(len(b)):
    print "Tiempo para n="+str(x+1)+": " + str(b[x])
