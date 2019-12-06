import java.util.*;
import java.io.*;
class amex2{
    public static int check(String[] A){
        List<Character> ls = new ArrayList<Character>();
        List<Integer> lsi=new ArrayList<Integer>();
        int flag;
        String ans="";
        int abc;
        System.out.println(abc);
        for(int i=0;i<A.length;i++){
            flag=0;
            for(int j=0;j<A[i].length();j++){
                if(!ls.contains(A[i].charAt(j))){
                    ls.add(A[i].charAt(j));
                }else{
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                lsi.add(i);
            }
        }
        if(lsi.isEmpty()){
            return 0;
        }else{
        for(Integer a : lsi){
            ans=ans + A[a];
        }
        abc=ans.length();
        return abc;
        } 
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] myArray= new String[4];
        myArray[0] = "eva";
        myArray[1] = "jqw";
        myArray[2] = "tyn";
        myArray[3] = "jan";        
        System.out.println(check(myArray));
    }
}