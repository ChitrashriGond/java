package com.xworkz.test1;

import java.util.HashMap;

public class test2 {
   /* Task 1. -  A[] = {1,5,6,7,9,3,4,2} ;Sum = 8 Output = [6,2] [5,3] [7,1]*/
 public  static void main(String[] args){

   int  A[]={1,5,6,7,9,3,4,2};
 int sum=8;
 int c=0;

 HashMap<Integer,Integer> hashMap=new HashMap<Integer, Integer>();

 for (int i=0; i<=c;i++) {
int sum1=sum-A[i];
if(hashMap.containsKey(sum1)){
    int c=hashMap.get(sum1);
    for(int k=0; k<=c;k++){
        System.out.println();
    }
}

 }
    }





}
