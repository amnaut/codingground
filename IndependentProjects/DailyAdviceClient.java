
import java.io.*;
import java.net.*;

public class DailyAdviceClient{

public void go(){
    try{
        Socket s= new Socket("190.165.1.103",4242);
        InputStreamReader streamReader =new InputStreamReader(s.getInputStream());
    BufferedReader reader =  new BufferedReader(streamReader);
     String advice= reader.readLine();
     System.out.println(advice);
     reader.close();
     
    }catch (IOException ex){
        ex.printStackTrace();
    }
}
    
    

     public static void main(String []args){
        DailyAdviceClient k = new DailyAdviceClient();
        k.go();
     }
}
