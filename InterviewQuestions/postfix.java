import java.util.*;
public class postfix{

  public static void main(String[] args){
     String s= "423+*";
     int l= s.length();
     Stack q= new Stack();
     
     for(int i=0;i<l;i++){
         char ch= s.charAt(i);
         if(Character.isDigit(ch))
            q.push(ch-'0');
          else{
              int k= (int)q.pop();
              int j= (int)q.pop();
              if(ch=='*')
                q.push(k*j);
                 if(ch=='+')
                q.push(k+j);
                 if(ch=='/')
                q.push(k/j);
                 if(ch=='-')
                q.push(k-j);
          }
     }
    System.out.println((int)q.pop());
  }
}