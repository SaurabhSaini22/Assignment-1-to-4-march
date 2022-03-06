package String;

public class StringReplace {
    public static void main(String[] args) {
        String str = "A batman with bat";
        String new_str = str.replaceAll("bat", "snow");
        System.out.println("Original string: " + str);
        System.out.println("New String: " + new_str);
    }
}
