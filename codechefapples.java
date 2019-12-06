
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void findapples(int apples,int boxes){
        if(apples/boxes==boxes||boxes==1){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		int apples=0;
		int boxes=0;
		for(int i=0;i<t;i++){
		     apples=sc.nextInt();
		     boxes=sc.nextInt();
		     findapples(apples,boxes);
		}
	}
}