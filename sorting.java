//1. Bubble sort
import java.util.Scanner;

class Sorting{

    static void merge(int beg,int end,int mid,int[] arr){
        int i= beg;
        int j = mid+1;
        int k=0;
        int[] b = new int[arr.length];
        
        while(i<=mid&&j<=end){
            if(arr[i]<arr[j]){
                b[k]=arr[i];
                i++;
            }else{
                b[k]=arr[j];
                j++;
            }
            k++;
        }
        if(i<=mid){
            for(int x=i;x<=mid;x++){
                b[k]=arr[x];
                k++;
            }
        }

        if(j<=end){
            for(int x=j;x<=end;x++){
                b[k]=arr[x];
                k++;
            }
        }

        for(int f=beg;f<=end;f++){
            arr[f]=b[f-beg];
        }
    }
    static void sortMerge(int beg,int end,int[] arr){
        if(beg>=end)
            return;
        
        int mid = (end+beg)/2;
        
        sortMerge(beg, mid, arr);
        sortMerge(mid+1, end, arr);

        merge(beg,end,mid,arr);
    }

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
        //sortBubble(arr);
        sortMerge(0, n-1, arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}