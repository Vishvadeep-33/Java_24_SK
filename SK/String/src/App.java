public class App {
    public static void main(String[] args) throws Exception {
        char s[] = {'a','d','d'};
        String s1 = new String(s);
        System.out.println("Original string: " + s1);
        String s2 = "add";
        System.out.println("Original string: " + s2);
        String s3 = new String("hello");
        System.out.println("Original string: " + s3);
        char c1 = 'a';
        System.out.println("Character value :" +c1);
        String s4 = new String("well %d");
        char c2 = s4.charAt(1);
        System.out.println("Character value :" +c2);
        int i = s4.length();
        System.out.println("Length of the string: " + i);
        String s5 = String.format(s4, i);
        System.out.println(s5);
        System.out.println(String.format(s4, i));
        String s6 = "this is string class";
        String s7 = s6.substring(0,s6.length());
        System.out.println(s7);

        String s8 = "this its string class";
        System.out.println(s8.contains("t"));
        Boolean b = s8.contains("t");
        if(s8.contains("t")){
            System.out.println(s8.indexOf("t"));
            System.out.println(s8.lastIndexOf("t"));
        }else{
            System.out.println("t not in s8");
        }
        String s9 = String.join( " ","hello", s8);
        System.out.println(s9);
        // "hello""-"" ""-" s8
        String s10 = "hello";
        String s11 = "hello";
        String s12 = "HELLO";
        System.out.println(s10.equals(s11));
        System.out.println(s10.equals(s12));
        System.out.println(s10.equalsIgnoreCase(s12));

        String s13 = "";
        char s14 = '\0';
        System.out.println(s13.isEmpty());
        System.out.println(s14);
        // System.out.println(s14.isEmpty());
        String s15 = s10.concat(s12);
        System.out.println(s15);
        String s16 = s10 + s12;
        System.out.println(s16);
        System.out.println(s16.replace("l", "I"));
        
        String[] sarr = s8.split("\\s",8);
        for(String ii:sarr)
            System.out.println(ii);
        
    }
    
}
