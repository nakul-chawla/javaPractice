import java.util.*;
import java.io.*;

class Main
{
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
//System.out.print("Enter the string: );
String str = s.nextLine();
String key = s.nextLine();
ArrayList <Character> st = new ArrayList<Character>();
ArrayList <Character> ans = new ArrayList<Character>();
ArrayList <Character> ke = new ArrayList<Character>();
for(char temp : str.toCharArray())
{
st.add(temp);
}
for(char temp : key.toCharArray())
{
ke.add(temp);
}
System.out.print("Converted string: ");
for(int i=0;i<st.size();i++)
{
int x = ((int)st.get(i)+(int)ke.get(i))%26;
x = x+'A';
char ch = (char) x;
ans.add(ch);
}
for(int i=0;i<st.size();i++)
{
System.out.print(ans.get(i));
}
}
}
