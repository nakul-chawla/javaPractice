import java.util.*;
class func{
    public static void  findFactorial(int x){
        int fact=1;
        for(int i=2;i<=x;i++){
            fact=(fact*i);
        }
        System.out.println(fact);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        findFactorial(x);
    }
}