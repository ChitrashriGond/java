package com.xworkz.test1;

import java.util.Scanner;

public class test1 {

/*    Task 1. -  A[] = {1,5,6,7,9,3,4,2} ;Sum = 8 Output = [6,2] [5,3] [7,1]
    Task 2. - String chitrashri = " My name is Chitrashri  Gond"    reverse this string .
    */
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
                String s=sc.nextLine();
        String s1="";

        for (int i=0; i<s.length();i++){
            char outp=s.charAt(i);
          s1=outp+s1;
        }
        System.out.println(s1);
    }


}
