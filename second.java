//1.Find unique numbers in the array.

import java.util.Scanner;
import java.util.HashMap;    
    
class second{

//1.
public static int count_unique(int[] arr){
    HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
    int n = arr.length;
    for(int i=0;i<n;i++){
        hm.put(arr[i],arr[i]);
    }
    return hm.size();
    
}    

public static void main(String args[]){
    System.out.println("Enter size of array");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println(count_unique(arr));   
    }
}