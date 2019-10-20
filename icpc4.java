import java.util.*;
import java.io.*;
class FastScanner {
    BufferedReader br;
    private String[] input;
    private int next;
    FastScanner() {
        br = new BufferedReader(new InputStreamReader(System.in));
        next = -1;
    }
    public String readLine() {
        try {
            return br.readLine();
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
        return null;
    }
    public int readInt() {
        if(next==-1) {
            try {
                input = br.readLine().split(" ");
                next = 0;
            }catch(IOException ioe) {
                ioe.printStackTrace();
            }
        }
        int val = Integer.parseInt(input[next++]);
        if(next==input.length) next = -1;
        return val;
    }
}
class main{
    public static void main(String args[]){
        FastScanner fs = new FastScanner();        
        HashMap<Character,Integer> hmi = new HashMap<Character,Integer>(); 
        //Scanner sc = new Scanner(System.in);
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        int t = fs.readInt();
        
        for(int x=0;x<t;x++){
            int len = fs.readInt();
            int cases = fs.readInt();
            //sc.nextLine();
            String ans = fs.readLine();
            for(int i=0;i<ans.length();i++){
                hm.put(ans.charAt(i),0);
            }
            for(int i=0;i<cases;i++){
                String a = fs.readLine();
                if(hm.size()>0){
                for(int j=0;j<a.length();j++){
                    if(hm.containsKey(a.charAt(j))){
                        hmi.put(a.charAt(j),i+1);
                        //System.out.println(i+1);
                        hm.remove(a.charAt(j));
                    }
                }
            }
        }
            for(int i=0;i<ans.length();i++){
                if(hmi.containsKey(ans.charAt(i))){
                    System.out.println(hmi.get(ans.charAt(i)));
                }
            }   
    }
}
}