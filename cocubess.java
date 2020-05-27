import java.util.Scanner;

class cocubess {
    public static int FindNumbersDivisible(int a,int b,int div){
        int result=0;
        int x = a%div;

        if(x!=0){
            a = a + (div - x);
        }

        b = b - (b%div);

        if(a>b){

            result=0;
        }else{
            result =  (b-a)/div + 1 ;
        }
        System.out.println(result);
        return(result);
        
    }
    public static void main(String[] args){
        int result=FindNumbersDivisible(13,30,3);
    }
}