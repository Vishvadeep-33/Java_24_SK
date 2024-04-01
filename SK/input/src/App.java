import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number: " );
        int i = in.nextInt();
        // System.out.println("enter another number: ");
        // float f = in.nextFloat();
        // System.out.println("enter a double: ");
        // double d = in.nextDouble();
        // System.out.println("enter a boolean: ");
        // boolean b = in.nextBoolean();
        // System.out.println("enter a character: ");
        // char c = in.next().charAt(0);
        // System.out.println("enter a short: ");
        // short s = in.nextShort();
        // System.out.println("enter a long: ");
        // long l = in.nextLong();
        // System.out.println("enter a byte: ");
        // byte b1 = in.nextByte();

        // System.out.println("enter a string: ");
        // String s1 = in.next();

        in.close();
        System.out.println(i);
    }
}