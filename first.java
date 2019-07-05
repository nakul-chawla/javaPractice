//1.Find number of substrings of a string
//2.Find all the substrings
import java.io.*;
import java.util.Scanner;
class first{
    //1.
    static int countSubstring(String a){
        int n=a.length();
        return (n*(n+1))/2;
    }
    //2.
    static void findSubstrings(String a){
        for(int i=0;i<a.length();i++){
            for(int j=i;j<=a.length();j++){
                System.out.println(a.substring(i,j));
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a = sc.nextLine();
        System.out.print(countSubstring(a));
        findSubstrings(a);
    }
}