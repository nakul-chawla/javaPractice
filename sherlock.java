import java.util.*;
import java.io.*;

class sherlock{
    public static String check(String s){
        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
        HashMap<Integer,Integer> hmm=new HashMap<Integer,Integer>();
        int x;
        int max=1;
        for(int i=0;i<s.length();i++){
            if(!hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),1);
            }else{
                x=hm.get(s.charAt(i))+1;
                if(x>max){
                    max=x;
                }
                hm.put(s.charAt(i),x);
            }
        }
        max=hm.get(s.charAt(0));
        int y=0;
        int z=0;
        int b=0;
        for(Character c:hm.keySet()){
            if(hmm.containsKey(hm.get(c))){
                y=hmm.get(hm.get(c));
                hmm.put(hm.get(c),y+1);
            }else{
                hmm.put(hm.get(c),1);
            }
        }
        if(hmm.size()>2){
            System.out.println(hmm.size());
            System.out.println(hmm);
            System.out.println(hm);
            System.out.println("1");
            return "NO";
        }
        for(Integer t:hmm.keySet()){
            if(b==0){
                System.out.println("here maybe");
                z=t;
            }
            if(b==1){
                System.out.println("What about here");
                System.out.println(Math.abs(z-hmm.get(t)));
                if(Math.abs(z-t)==1&&(hmm.get(t)==1||hmm.get(z)==1)){
                    System.out.println("And here");
                    return "YES";
                }
            }
            if(t==1&&(hmm.get(t)==1||hmm.get(t)==hm.size())){
                System.out.println("2");
                return "YES";
            }
            b++;
        }
        return "NO";
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String a=check(s);
        System.out.println(a);
    }
}