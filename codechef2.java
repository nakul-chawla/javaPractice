import java.util.*;
import java.io.*;

class main{
    public static void check(int[] A,int k){
        Arrays.sort(A);    
        int i=0;
        while(i<(A.length-1) && Math.min(A[i],A[i+1])>k){
            A[i]=A[i]-1;
            A[i+1]=A[i+1]-1;
            if((Math.min(A[i],A[i+1])<=k)){
                i++;
            }
        }
        int sum=0;
        for(int x=0;x<A.length;x++){
            sum=sum+A[x];
        }
        System.out.println(sum);
        // for(int i=0;i<A.length;i++){
        //     for(int j=1;j<A.length;j++){
        //         if(Math.min(A[i],A[j])>k){
        //             A[i]=A[i]-1;
        //             A[j]=A[j]-1;
        //         }
        //     }
        // }
 }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        sc.nextLine();
        // int[] A = new int[]{2,2};
        // int k=1;
        // check(A,k);
        for(int i=0;i<a;i++){
            int arr = sc.nextInt();
            int k = sc.nextInt();
            sc.nextLine();
            int[] A = new int[arr]; 
            for(int y=0;y<arr;y++){
                A[y] = sc.nextInt();
           }
           
            check(A,k);
        }
        
    }
}