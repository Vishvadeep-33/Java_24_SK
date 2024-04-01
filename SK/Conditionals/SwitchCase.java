package Conditionals;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args){
/* 
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer");
        int n = in.nextInt();
        System.out.println("Enter a floating point number");
        float f = in.nextFloat();
        System.out.println("Enter a double");
        double d = in.nextDouble();
        System.out.println("Enter a character");
        char c = in.next().charAt(0);
        System.out.println("Enter a boolean");
        boolean b = in.nextBoolean();
        System.out.println("Enter a short");
        short s = in.nextShort();
        System.out.println("Enter a long");
        long l = in.nextLong();
        System.out.println("Enter a byte");
        byte b1 = in.nextByte();
        System.out.println("Enter a string");
        String s1 = in.next();
        in.close();

        System.out.println(n + " is an Integer.");
        System.out.println(f + " is a Float.");
        System.out.println(d + " is a Double.");
        System.out.println(c + " is a Character.");
        System.out.println(b + " is a Boolean.");
        System.out.println(s + " is a Short.");
        System.out.println(l + " is a Long.");
        System.out.println(b1 + " is a Byte.");
        System.out.println(s1 + " is a String.");

 */
       
    // switch case
        int x = 2;
        switch(x){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("default");
                break;
        }

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Character: ");
        char c = in.next().charAt(0);
        in.close();
        switch(c){
            // aeiou
            case 'a' : 
            case 'e' : 
            case 'i' : 
            case 'o' : 
            case 'u' : 
                System.out.println("The Character is a Vowel");
                break;
            default:
                System.out.println("The Character is a Consent");
        }
    }
}
