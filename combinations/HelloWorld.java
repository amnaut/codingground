import java.util.*;
public class HelloWorld{
    
    public static ArrayList<String>comb(String s){
        if(s==null)
            return null;
            ArrayList<String>permutations= new ArrayList<String>();
            if(s.length()==0){
            permutations.add("");
            return permutations;
            }
            Character pre= s.charAt(0);
            ArrayList<String> words= comb(s.substring(1));
            for( String word: words){
                for(int i=0;i<=word.length();i++){
               permutations.add(preaddedword(word,pre,i));
               
            }
            }
            return permutations;
    }
    
    public static String  preaddedword(String word, Character pre,int i){
        
        String first= word.substring(0,i);
        String last=word.substring(i);
        return first+pre+last;
    }

     public static void main(String []args){
        String cas= "ami";
        ArrayList<String>permutations= comb(cas);
        for(String a:permutations){
            System.out.println(a);
        }
     }
}
