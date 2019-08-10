import java.util.Scanner;

class cocubes {
    public static void findNumber(int n1,int n2){
        int count=0;
        int x=0;
        int y=0;
        for(int i=n1;i<=n2;i++){
            y=i;
            while(y>0){
                x=y%10;
                if(x==1||x==4||x==9){
                    y=y/10;
                }else{
                    break;
                }
            }
            if(y==0){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args){
        int n1;
        int n2;
        Scanner sc=new Scanner(System.in);
        n1=sc.nextInt();
        n2=sc.nextInt();
        findNumber(n1,n2);

    }
}