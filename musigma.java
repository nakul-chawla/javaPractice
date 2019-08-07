import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class musigma {
    static String manipulate(String str){
//        char[] allc=new char[str.length()];
//        int[] arr=new int[str.length()];
        char c;
        List arr= new ArrayList<Integer>();
        List allc=new ArrayList<Character>();
        int k=0;
        for(int i=1)
        // Arrays.fill(arr,1);
        // for(int i=1;i<str.length();i++){
        //     if(str.charAt(i)!=str.charAt(i-1)&&str.charAt(i)!=str.charAt(i+1)){
        //         arr[k]=1;
        //         allc[k]=str.charAt(i);
        //     }
        //     else if(str.charAt(i)==str.charAt(i-1)){
        //         arr[k]=arr[k]+1;
        //         allc[k]=str.charAt(i);
        //     }else{
        //         k++;
        //     }
        // }
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]+" "+allc[i]);
        // }
        return str;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = new String();
        str = sc.next();
        str = manipulate(str);
        System.out.println(str);
    }
}