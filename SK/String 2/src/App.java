public class App {
    public static void main(String[] args) throws Exception {
        String str = new String("hello this is java").intern();
        String str1 = new String("hello THIS is Java").intern();
        System.out.println(str == str1);
        // String str1 = new String();
        // str1 = str;
        // System.out.println(str == str1);
        String str2 = (str1.toLowerCase()).intern();
        System.out.println(str == str2);


        str2 = str2.toUpperCase().intern();
        System.out.println(str2);

        String s = new String("         helllo               ");
        System.out.println(s);
        // s = s.trim();
        System.out.println(s.trim());

        int a = 20;
        String s1 = String.valueOf(a);
        System.out.println(s1+100);
    }
}
// intern()