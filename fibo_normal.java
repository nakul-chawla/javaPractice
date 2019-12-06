import java.util.*;

class fibonaaci{
    static int print_fibo(int a,int[] fib){
        if(a==0){
            fib[a]=0;
            return fib[a];
        }else if(a==1){
            fib[a]=1;
            return fib[a];
        }else{
            if(fib[a]!=(-1)){
                return fib[a];
            }           
            else{
                fib[a]=print_fibo(a-1, fib)+print_fibo(a-2, fib);    
                return fib[a];
            }
        }
    }
    public static void main(String args[]){
        int a;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        int[] fib=new int[a+1];
        for(int i=0;i<=a;i++){
            fib[i]=-1;
        }
        System.out.println(print_fibo(a,fib));
    }
}