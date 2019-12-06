import java.util.*;
import java.io.*;
import java.util.Collections; 

class main{
    public static void check(String k){
        int maxim=Integer.valueOf(k);
        String n;
        for(int i=0;i<k.length();i++){
            n = k.substring(0,i)+k.substring(i+1,k.length());
            int num = Integer.valueOf(n);
            maxim=Math.min(maxim,num);
        }
        System.out.println(maxim);
 }
    public static void main(String[] args){
    //     Scanner sc=new Scanner(System.in);
    //     int a=sc.nextInt();
    //     sc.nextLine();
    //     for(int i=0;i<a;i++){
    //         String b = sc.nextLine();
    //         check(b);
    //     }
    // }
    
    HashMap<String,Integer[]> hm = new HashMap<String,Integer[]>();
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    sc.nextLine();
    for(int i=0;i<a;i++){
        String b = sc.nextLine();
        sc.nextLine();

        int x = sc.nextInt();
        
        Integer[] arr=new Integer[2];    
        if(hm.containsKey(b)){
           arr=hm.get(b); 
           if(x==0){
               arr[0]=arr[0]+1;
                hm.put(b,arr);
           }else{
                arr[1]=arr[1]+1;
                hm.put(b,arr);   
           } 
        }else{
            if(x==0){
                arr[0]=0;
                arr[1]=0;
                hm.put(b,arr);
            }else{
                 arr[1]=0;
                 arr[0]=0;
                 hm.put(b,arr);   
            }
        }
    }
    for(Integer[] arr: hm.values()){
        System.out.println(Collections.max(Arrays.asList(arr)));
    }

    //System.out.println(ls.containsKey(atr));
    }
}