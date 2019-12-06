class factorial{
    static int x=1;
    static int find_fact(int a){
        if(a==0||a==1)
            return x;
        else{
            x=x*a;
            return find_fact(a-1);
        }    

    }
    public static void main(String args[]){
        int a=3;
        int ans=find_fact(a);
        System.out.println(ans);
    }
}