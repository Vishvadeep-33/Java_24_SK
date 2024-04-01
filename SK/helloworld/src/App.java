public class App {
    static int b = 10;
    public static void main(String[] args) throws Exception{
        System.out.println("Hello, World!");
        System.out.print("hello");
        System.out.println("world");
        System.out.printf("hello");
        System.out.println("\tworld\n");

        int a =10;
        System.out.println("a = " + a);
        System.out.printf("a = %d",a);
        System.out.println("b = "+ b);
        printss();
        System.out.println( a);
    }
    static void printss(){
        int a = 20;
        System.out.println("hello" + b + a);
    }
}
