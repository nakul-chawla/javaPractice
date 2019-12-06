class any{
    int abc=10;
    public String toString(){
        return "Hello";
    }
}
class edit{
    public static void main(String args[]){
        any a=new any();
        System.out.println(a.abc);
    }
}