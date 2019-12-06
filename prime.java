import java.io.*;
import java.util.*;
import java.lang.*;
class prime{
    public static void checkPrime(int n){
        int[] arr = new int[n];
        for(int i=1;i<n;i++){
            arr[i]=i+1;
        }
        int a = (int)Math.sqrt(n);
        int j=0;
        for(int i=1;i<=a;i++){
            if(arr[i]!=0){
                j=i*i;
                while(j<n){
                    arr[j]=0;
                    j=j+i;
                }
            }
        }
        for(int i=1;i<n;i++){
            if(arr[i]!=0){
                System.out.println(arr[i]);
            }
            
        }
    }

    public static void findPrime(int n){
        boolean[] arr=new boolean[n+1];
        for(int i=2;i<=n;i++){
            arr[i]=true;
        }
        for(int i=2;i*i<=n;i++){
            if(arr[i]==true){
                for(int j=i*i;j<=n;j=j+i){
                    arr[j]=false;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(arr[i]==true){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args){
        System.out.println("Enter the number");
        // int a = (int)(Math.sqrt(80));
        // System.out.println(a);
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        findPrime(n);
    }
}