import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("1 ");
        System.out.println("2 ");
        System.out.println("enter a choice: " );
        int choice = in.nextInt();
       

        switch(choice){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("default");
        }
        System.out.println("enter a character");
        char c = in.next().charAt(0);
        in.close();
        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("The character is vowel");
                break;
        
            default:
                System.out.println("the character is consonent");
                break;  
        }

    }
}
