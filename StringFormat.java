package String;

public class StringFormat{
    public static String toggle(String str){
        String words[]=str.split(" ");
        String toggle="";
        for(String w:words){
            String first=w.substring(0,1);
            String afterfirst=w.substring(1);
            toggle+=first.toLowerCase()+afterfirst.toUpperCase()+" ";
        }
        return toggle.trim();
    }
    public static void main(String[] args) {
        System.out.println(StringFormat.toggle("my name is Shorabh"));
        System.out.println(StringFormat.toggle("I am a student"));
    }
}