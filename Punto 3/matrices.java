import java.util.*;
import java.lang.*;
import java.io.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
 
        String A = br.readLine();
        int n =Integer.parseInt(A);
        int[][] c;
        int[][] d;
        int[][] e;
        double t=0;
        int t1=0;
        for(int x=1;x<=n;x++){
          c=new int[x][x];
          d=new int[x][x];
          e=new int[x][x];
          for(int y=0;y<x;y++){
            for(int z=0;z<x;z++){
                c[y][z] = 1;
                d[y][z] = 2;
                e[y][z] = 0;
            }
        }
          for(int y=0;y<x;y++){
            for(int z=0;z<x;z++){
                long tt=System.nanoTime();
                for(int w=0;w<x;w++){
                    e[y][z]=e[y][z]+(c[y][w]*d[w][z]);
                }
                t=t+(System.nanoTime()-tt);
                t1=t1+1;
            }
        }
        t=t/t1;
        System.out.println("Tiempo para n="+x+": "+t);
    }
}
}
// MI PC                                                 Ideone.com
/*Tiempo para n=1: 796.0                                 Tiempo para n=1: 468.0 
Tiempo para n=2: 442.0                                   Tiempo para n=2: 318.2 
Tiempo para n=3: 242.92857142857142                      Tiempo para n=3: 225.08571428571426   
Tiempo para n=4: 197.2642857142857                       Tiempo para n=4: 207.2361904761905 
Tiempo para n=5: 221.45935064935065                      Tiempo para n=5: 242.16793073593075 
Tiempo para n=6: 196.3676851719709                       Tiempo para n=6: 202.34250473336186 
Tiempo para n=7: 2314.5311977512283                      Tiempo para n=7: 24851.15244646238       
Tiempo para n=8: 177.40456469485898                      Tiempo para n=8: 320.96153160030576 
Tiempo para n=9: 170.37685812173635                      Tiempo para n=9: 207.65951414596597 
Tiempo para n=10: 165.6555243068097                      Tiempo para n=10: 205.57573899778174 
Tiempo para n=11: 173.66335083855103                     Tiempo para n=11: 217.23433940513397 
Tiempo para n=12: 167.35178977052087                     Tiempo para n=12: 205.18497590677714 
Tiempo para n=13: 177.90152843683825                     Tiempo para n=13: 204.984352839935 
Tiempo para n=14: 169.30039559451905                     Tiempo para n=14: 203.48077276141865 
Tiempo para n=15: 166.14701644806007                     Tiempo para n=15: 204.3318393328721 
Tiempo para n=16: 169.05825335324067                     Tiempo para n=16: 205.68070310115834 
Tiempo para n=17: 171.32384215874131                     Tiempo para n=17: 208.6071040353508 
Tiempo para n=18: 24877.955108507427                     Tiempo para n=18: 207.74993224468247 
Tiempo para n=19: 163.6457308131609                      Tiempo para n=19: 205.64645746244722 
Tiempo para n=20: 175.28315182258297                     Tiempo para n=20: 208.29116601305313 
Tiempo para n=21: 173.44194598363717                     Tiempo para n=21: 1284.6295050335286 
Tiempo para n=22: 167.6857554534871                      Tiempo para n=22: 18.246279184462065 
Tiempo para n=23: 176.2515461969134                      Tiempo para n=23: 17.53960367233683 
Tiempo para n=24: 167.5049492951422                      Tiempo para n=24: 18.34643665381068 
Tiempo para n=25: 106.83321356548329                     Tiempo para n=25: 3657.4558093098017 
