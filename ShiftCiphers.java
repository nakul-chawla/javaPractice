import java.util.*;

class cipher{
    
    public static String ceaserEncrypt(int pos,String text){
        String ciphertext="";
        char[] a = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        List<Character> al = new ArrayList<Character>();
        //List<Character> al = Arrays.asList(a);
        for(char c : a){
            al.add(c);
        }
        for(int i=0;i<text.length();i++){
            ciphertext = ciphertext + al.get((al.indexOf(text.charAt(i))+pos)%26);
        }
        System.out.println(ciphertext);
        return ciphertext;
    }
    public static void ceaserDecrypt(int pos,String ciphertext){
        String text="";
        char[] a = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        List<Character> al = new ArrayList<Character>();
        //List<Character> al = Arrays.asList(a);
        for(char c : a){
            al.add(c);
        }
        for(int i=0;i<ciphertext.length();i++){
            text = text + al.get((al.indexOf(ciphertext.charAt(i))+26-pos)%26);
        }
        System.out.println(text);
    }
    public static void main(String args[]){
        //ceaserEncrypt(2,"APPLE");
        ceaserDecrypt(2, ceaserEncrypt(2,"APPLE"));
    }
}