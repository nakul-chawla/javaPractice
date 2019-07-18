//1.Find number of substrings of a string
//2.Find all the substrings
//3.Find all the uncommon substrings(We can use set to save them because it doesnt store duplicate value)
//4.Find the occurence of vowels in substrings
//5.Find no. of vowels in substring in other way(basically couting the number of substring for each alphabet then knowing is this a vowel and
//multiplying by the number found earlier)
//6.Sort the substrings(use Tree Set)
//7.Find all the subsequences with time complexity O(n^3)
//8.Subsequences with time complexity O(2^n)

import java.io.*;
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
            for(int j=i+1;j<=a.length();j++){
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
    //5. 
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
    //6.
    static void sortSubstrings(String a){
        int n=a.length();
        Set<String> tSet=new TreeSet<String>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                tSet.add(a.substring(i, j));
            }
        }
        System.out.println(tSet);
    }
    //7.
    static HashSet<String> hs = new HashSet<String>();

    static void findsubsequence(String s){
        for(int i=0;i<s.length();i++){

            for(int j=s.length();j>i;j--){
                String sub = s.substring(i,j);

                if(!hs.contains(sub)){
                    hs.add(sub);
                }

                for(int k =1;k<sub.length()-1;k++){
                    StringBuffer sb = new StringBuffer(sub);

                    sb.deleteCharAt(k);
                    
                    findsubsequence(sb.toString());
                }

            }
        }
    }
    //8.
    static int findAnagrams(String s){
        HashMap<String,Integer> h = new HashMap<String,Integer>();
        int n = s.length();
        int count =0;
        int y;
        int z;
        String a;
        char[] b;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                a = s.substring(i,j);
                b = a.toCharArray();
                Arrays.sort(b);
                String x = new String(b);
                if(h.containsKey(x)){
                    y=h.get(x);
                    z=y+1;   
                    count =count+((z*(z-1))/2)-((y*(y-1))/2);
                    h.put(x,z);
                }else{
                    h.put(x,1);
                }
                
            }
        }
        
    return count;}

    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a = sc.nextLine();
        // System.out.print(countSubstring(a));
        // findSubstrings(a);
        //System.out.println(differentSubstring(a));
        // System.out.println(findVowelsInSubstring(a));
        // System.out.println(findNumVowelSub(a));
        // sortSubstrings(a);
        //findsubsequence(a);
        //System.out.println(hs);
        System.out.println(findAnagrams(a));
    }
}