public class HelloWorld1{
    public static void separateNumber(String s){
    int len=s.length();
    StringBuilder sb= new StringBuilder();
    //if (len==1)
      //  sb.append(s.charAt(0));
      int start=0;
      int end=0;
    for(int i =0;i<len-1;i++){
        //sb.append(s.charAt(i));
        if (s.charAt(i+1)-s.charAt(i)!=1)
            sb.append(';');
            
    }
    sb.append(s.charAt(len-1));
    System.out.println(sb.toString());


}
     public static void main(String []args){
        System.out.println("Hello World");
        String s = "135";
        separateNumber(s);
     }
}
