//Find number of substrings of a string

import java.io.*;
import java.util.Scanner;
class first{
    static int countSubstring(String a){
        int n=a.length();
        return (n*(n+1))/2;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a = sc.nextLine();
        System.out.print(countSubstring(a));
    }
}