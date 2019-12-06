import java.math.BigInteger;

class cognizant1{
    static void weight(){
        //A=1
        //B=2*A+A
        //C=3*B+B
        long[] arr=new long[26];
        arr[0]=1;
        long weight = 20;
        System.out.println(arr[0]);
        int i=0;
        BigInteger[] bi = new BigInteger[26];
        bi[0]=BigInteger.valueOf(1);

        System.out.println(bi[0]);
        for(i=1;i<26;i++){
            bi[i]=BigInteger.valueOf(Math.abs(64-(65+i))).multiply(bi[i-1]).add(bi[i-1]);
            System.out.println(bi[i]);
        }
        for(i=1;i<26;i++){
            arr[i]=Math.abs(64-(65+i))*arr[i-1]+arr[i-1];
            if(arr[i]>weight){

                break;
            }
            System.out.println(arr[i]);
        }
        long y;
        while(i>=0 && weight>0){
            y=weight-arr[i];
            if(y>=0){
                weight=weight-arr[i];
                System.out.println((char)(i+65));
            }else{
                i--;
            }
        }
        // for(int j=i-1; j>=0;j--){
        //     while(weight>arrji]){
        //         weight=weight-arr[i];
        //         System.out.println(x);
        //     }
        // }
            
    }
    public static void main(String[] args){
        weight();
    } 
}