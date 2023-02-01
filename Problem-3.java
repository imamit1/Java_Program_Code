package com.tandemloop;


public class Problem_3 {
	  public static void main(String[] args) {
          int a=6,c=0;
        for(int i=1; ; i++)
        {
            if(i%2!=0)
            {
                System.out.print(i+" ");
                c++;
            }
            if(c==a || (a%2==0 && a-1==c)){
                break;
            }
        }
       
	  }
}
