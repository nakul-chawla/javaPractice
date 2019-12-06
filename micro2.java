import java.io.*;
import java.util.*;

class UserMainCode{

    public static String characterAt(String input1,int input2){
        int sum=0;
        char h='a';
        String ans="some";
        for(int i=0;i<input1.length();i++){
            int c = input1.charAt(i);
            if(c>48&&c<59){
                sum=sum+c-48;
            }else{
                h=input1.charAt(i);
            }
            if(sum>=input2){
                //System.out.println(h+"");
                ans=String.valueOf(h);
                return ans;
             
            }
        }
        ans="-1";
        return ans;
    }
    public static void main(String args[]){
        String a="a3b2";
        int ab=7;
        System.out.println(characterAt(a, ab));
    }
}