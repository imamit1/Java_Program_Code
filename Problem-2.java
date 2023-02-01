package com.tandemloop;
import java.math.BigInteger;

public class Problem_2 {
	
	 public static void main(String[] args) {
         int a=9,c=1;
         System.out.print("1 ");
       for(int i=1; ; i++)
       {
           if(i==2)
           {
               continue;
           }
           BigInteger b = BigInteger.valueOf(i);
           if(b.isProbablePrime(8))
           {
               System.out.print(i+" ");
               c++;
           }
           if(c==a){
               break;
           }
       }
      
      }
	
   }

