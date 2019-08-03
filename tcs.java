//1. A number with base 17 has to be converted into decimals. Twist is A-10,B-11,C-12 till G-16
//convert 1A into 27.

class tcs{
    static void convert(){
        String a = "23FG";
        int total = 0;
        int num = 1;
        for(int i=a.length()-1;i>=0;i--){
            if(a.charAt(i)=='A'){
                total = total + (num*10);
            }else if(a.charAt(i)=='B'){
                total = total + (num*11);
            }else if(a.charAt(i)=='C'){
                total = total + (num*12);
            }else if(a.charAt(i)=='D'){
                total = total + (num*13);
            }else if(a.charAt(i)=='E'){
                total = total + (num*14);
            }else if(a.charAt(i)=='F'){
                total = total + (num*15);
            }else if(a.charAt(i)=='G'){
                total = total + (num*16);
            }else{
                System.out.println(a.charAt(i));
                int y = (int)(a.charAt(i))-48;
                System.out.println(y);
                total = total + (num*y);
            }
            num = num * 17;
        }
        System.out.print(total);
    }
    public static void main(String args[]){
        convert();
    }
}
