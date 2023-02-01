package com.tandemloop;

public class Problem_4 {
	 public static void main(String[] args) {
         int arr[] = {1,2,8,9,12,46,76,82,15,20,30};
         int n=arr.length,two=0,three=0,four=0,five=0,six=0,seven=0,
         eight=0,nine=0;
         for(int i=1;i<arr.length;i++)
         {
             if(arr[i]==1)
             {
             }
             else{
                if(arr[i]%2==0)
                {
                  two++;
                }
                if(arr[i]%3==0)
                {
                    three++;
                }
                 if(arr[i]%4==0)
                {
                    four++;
                }
                 if(arr[i]%5==0)
                {
                    five++;
                }
                if(arr[i]%6==0)
                {
                    six++;
                }
                 if(arr[i]%7==0)
                {
                    seven++;
                }
                if(arr[i]%8==0)
                {
                    eight++;
                }
                 if(arr[i]%9==0)
                {
                    nine++;
                }
             }
         }
        System.out.print("1:"+n+",2:"+two+",3:"+three+",4:"+four+",5:"+five+",6:"+six+",7:"+seven+",8:"+eight+",9:"+nine);
    }
 }

