import java.io.*;
import java.util.*;
class longestcommonsubstring{
    public static void calculatelength(String text1,String text2){
    Set<String> hs = new HashSet<String>();
        for(int i=0;i<text1.length();i++){
            for(int j=i+1;j<text2.length();j++){
                hs.add(text1.substring(i,j));
            }
        }
        String max="";
        String sub;
        for(int i=0;i<text2.length();i++){
            for(int j=i+1;j<text2.length();j++){
                sub=text2.substring(i,j);
                if(hs.contains(sub)){
                    if(sub.length()>max.length()){
                        max=sub;
                    }
                }
            }
        }
    }
}
