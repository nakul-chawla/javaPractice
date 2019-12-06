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
class codeshef3{
    public static void main(String args[]){
        FastScanner fs = new FastScanner();
        int x = fs.readInt();
        String abc=fs.readLine();
        System.out.println(x);
        System.out.println(abc);
    }
}