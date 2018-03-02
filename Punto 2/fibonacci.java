//para byte overflow en n=12
//para short overflow en n=24
//para int overflow en n=47
//para long overflow en n=93
//para BigInteger no tiene overflow
import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main {
  
    //static byte a,b,c;
    //static short a,b,c;
    //static int a,b,c;
    //static long a,b,c;
    static BigInteger a,b,c;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
 
        String A = br.readLine();
        int n =Integer.parseInt(A);
        //a=0;
        //b=1;
        //c=0;
        a=BigInteger.valueOf(0);;
        b=BigInteger.valueOf(1);;
        c=BigInteger.valueOf(0);;
        if (n==1 || n==2){
        	System.out.println(1);
    	}else{
        for(int i=1;i<n;i++){
            //c=(byte)(a+b);
            //c=(short)(a+b);
            //c=a+b;
            c=a.add(b);
            a=b;
            b=c;
            
        }
        	System.out.println(c);
        }
 
 
    }
}
