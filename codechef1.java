import java.util.*;
import java.io.*;
class main{
    public static void check(String[] A){
        for(int i=0;i<A.length;i++){
            int flag=0;
            List<Integer> ls = new ArrayList<Integer>();
            List<Integer> lsi= new ArrayList<Integer>();
            for(int j=0;j<A[i].length();j++){
                int b = (int)A[i].charAt(j)-48;
                if(b!=-2){
                    ls.add(j);
                    lsi.add(b);
                }
            }
            if(ls.size()<=1){
                System.out.println("safe");
            }else{
                for(int x=1;x<ls.size();x++){
                    flag = 0;
                    int diff=ls.get(x)-ls.get(x-1)-1;
                    int sum = lsi.get(x)+lsi.get(x-1);
                    if(diff<sum){
                        System.out.println("unsafe");
                        flag=1;
                        break;
                    }
                }
                if(flag!=1){
                    System.out.println("safe");
                }
        }
    }
 }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        sc.nextLine();
        String[] A = new String[a];
        for(int i=0;i<a;i++){
            A[i]=sc.nextLine();
        }
        check(A);
        
    }
}