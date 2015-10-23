public class HelloWorld{ 
    public static void main(String[] args){
     String s= "ABCDE";
     perm(0,"",s);
    }
    public static void perm(int index,String temp, String original){
        int N= temp.length();
        if(N== original.length()){
            System.out.println(temp);
            
        }
        else
        for(int i=0;i<=N;i++){
            String t= temp.substring(0,i);
            String end=temp.substring(i);
            char ch=original.charAt(index);
            String ss= t+ch+end;
            perm(index+1,ss,original);
        }
    }
    
    
    
}