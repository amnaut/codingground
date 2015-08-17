public class replacestring{
    public static String replaceString(String sk){
String[] str = sk.split(" ");
StringBuilder sb = new StringBuilder();
int i;
for (String s:str){
    System.out.println(s);
if (s.equals("A")){
sb.append("ONE ");
continue;
}
if (s.equals("a")){
sb.append("one ");
continue;
}
else{
sb.append(s + " ");
}
}
//if (str[i].equals("A"))
//sb.append("ONE");
//if (str[i].equals("a"))
//sb.append("one");
//else
//sb.append(str[i]);
return sb.toString();
}
public static void main(String[] args){
String sk = "A boy playing in a garden a";
System.out.println(sk);
String r = replaceString(sk);
System.out.println(r);
}
}