//Count the numbers divisible by 3 and 5 between num1 and num2
import java.io.*;
import java.util.Scanner;

class cocubes2{
    public static void findCount(int num1,int num2){
        //will check divisibility by 15 directly
        int x=num1%15;
        //first number divisible in this range will be y
        int y=num1+(15-x);
        int count=0;
        for(int i=y;i<=num2;i=i+15){
            count++;
        }
        System.out.println(count);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        findCount(num1,num2);
    }
}