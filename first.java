//1.Find number of substrings of a string
//2.Find all the substrings
//3.Find all the uncommon substrings(We can use set to save them because it doesnt store duplicate value)
//4.Find the occurence of vowels in substrings
//5.Find no. of vowels in substring in other way
//6.Sort the substrings(use Tree Set)
import java.io.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.*;
class first{
    //1.
    static int countSubstring(String a){
        int n=a.length();
        return (n*(n+1))/2;
    }
    //2.
    static void findSubstrings(String a){
        for(int i=0;i<a.length();i++){
            for(int j=i;j<=a.length();j++){
                System.out.println(a.substring(i,j));
            }
        }
    }
    //3.
    static int differentSubstring(String a){
        Set<String> hashSet = new HashSet<String>();
        for(int i=0;i<a.length();i++){
            for(int j=i+1;j<=a.length();j++){
                System.out.println(a.substring(i,j));
                //System.out.println(hashSet.contains("")+" "+i+" "+j);
                hashSet.add(a.substring(i,j));
                //System.out.println(hashSet.contains("")+" "+i);
            }
   }
    // Iterator<String> b = hashSet.iterator(); 
    // while (b.hasNext()) 
    //     System.out.print(b.next());
//    System.out.println(hashSet.contains(""));
//    System.out.println(hashSet);
    return hashSet.size();
}
    //4.
    static int findVowelsInSubstring(String a){
        int num = 0;
        char ch;
        Set<String> set = new HashSet<String>();
        String str;
        for(int i=0;i<a.length();i++){
            for(int j=i+1;j<=a.length();j++){
                set.add(a.substring(i,j));
            }
        }
        System.out.println(set.size());
        Iterator<String> b = set.iterator();
        while(b.hasNext()){
            str = b.next();
            for(int i=0;i<str.length();i++){
               ch=str.charAt(i);
               if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')){
                   num++;
               }                 
            }
        }
        return num;
    } 
    static int findNumVowelSub(String a){
        int num = 0;
        char ch;
        int n= a.length();
        int[] b = new int[n];
        for(int i=0;i<a.length();i++){
            if(i==0){
                b[i]=n;
            }else{
                b[i]= (n-i)+b[i-1]-i;
            }
        }
        for(int i=0;i<n;i++){
            ch=a.charAt(i);
            if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')){
                num=num +b[i];
            }
        }
        return num;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a = sc.nextLine();
        //System.out.print(countSubstring(a));
        //findSubstrings(a);
        //System.out.println(differentSubstring(a));
        System.out.println(findVowelsInSubstring(a));
        System.out.println(findNumVowelSub(a));
    }
}