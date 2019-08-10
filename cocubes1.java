import java.util.*;
import java.io.*;
class cocubes1{
    public static void removeRepeated(String a){
        int size=a.length();
        int i=1;
        char repeated=a.charAt(0);
        // for(int i=1;i<size;i++){
        //     if(a.charAt(i)==a.charAt(i-1)){
        //         a=a.substring(0,i-1)+a.substring(i+1, size);
        //     }
        //     System.out.println(a);
        // }
        while(i<size){
            if(a.charAt(i)==a.charAt(i-1)){
                repeated=a.charAt(i);
                a=a.substring(0,i-1)+a.substring(i+1, size);
                size=size-2;
                i=i-1;
            }else if(a.charAt(i)==repeated){
                a=a.substring(0,i)+a.substring(i+1, size);
                size=size-1;
            }else{
                i++;
            }
            System.out.println(a);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        removeRepeated(a);
    }
}