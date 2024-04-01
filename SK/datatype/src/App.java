public class App {
    public static void main(String[] args) throws Exception {
        int a = -130;              // 4 bytes
        byte b = 0;
        int i = (byte)a;             // 1 byte
        short s = 0;            // 2 bytes
        long l = 0L;            // 8 bytes
        float f = 0.0f;         // 4 bytes
        double d = 0.0d;        // 8 bytes
        char c = '\u0000';      // 2 bytes
        boolean boo = false;  // 1 bit 


        // byte data type (-128 to 127 )
        System.out.println("byte data type" + i);
        System.out.println("byte data type" + b);
        // short data type (- 32,768 to 32,767)
        // int data type (-2,147,483,648 to 2,147,483,647)
        // long data type (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
        // float data type (-3.4028235E38 to 3.4028235E38)
        // double data type (-1.7976931348623157E308 to 1.7976931348623157E308)
        // char data type (0 to 65,535)
        // boolean data type (false to true)
        System.out.println("short data type" + s);
        System.out.println("int data type" + i);
        System.out.println("long data type" + l);
        System.out.println("float data type" + f);
        System.out.println("double data type" + d);
        System.out.println("char data type" + c);
        System.out.println("boolean data type" + boo);
    }
}
