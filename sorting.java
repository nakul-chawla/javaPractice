//1. Bubble sort
import java.util.Scanner;

class Sorting{
    static void sortBubble(int arr[]){
        int n=arr.length;
        int swap=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-(i+1);j++){
                if(arr[j]>arr[j+1]){
                   swap = arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=swap; 
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(""+arr[i]+" ");
        }        
    }
    public static void main(String args[]){
        System.out.println("Enter size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sortBubble(arr);
    }
}