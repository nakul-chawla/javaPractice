import java.util.*;
import java.io.*;

class main{
    public static void check(String k){
        int maxim=Integer.valueOf(k);
        String n;
        for(int i=0;i<k.length();i++){
            n = k.substring(0,i)+k.substring(i+1,k.length());
            int num = Integer.valueOf(n);
            maxim=Math.min(maxim,num);
        }
        System.out.println(maxim);
 }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<a;i++){
            String b = sc.nextLine();
            check(b);
        }
    }
}