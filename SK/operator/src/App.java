public class App{
    public static void main(String[] args) throws Exception {
        /*
         * 
         // int a = 1;
         // int b  = 3;
         // b = ++a;
         // System.out.println(b);
         // b = a++;
         // System.err.println("b = "+b + " a = "+ a);
         // b = --a;
         // System.out.println(b);
         // b = a--;
         // System.out.println(b+"\n"+a);
         // b = ~a;
         // System.out.println(b);
         // boolean bool = true;
         // System.out.println(!bool);
         
         
         // int a = 1;
         // int b  = 3;
         // System.out.println(a + b);
         // System.out.println(a - b);
         // System.out.println(a * b);
         // System.out.println(((float)a / b));
         // System.out.println(a % b);
         
         // int a = 10;
         // int b  = 2;
         
         // System.out.println(a>>b); //  10/2^2 10/4 = 2
         // a = 20;
         // b =3;
         // System.out.println(a>>b); //  10/2^3 10/8 = 2
         // a = -20;
         // System.out.println(a>>>b); 
         
         // a = 10;
         // b =2;
         // System.out.println(a<<b);//10*2^2=40
         // b = 20;
         // System.out.println(a<<b); // 10 *2^20 = 10485760
         
         // boolean a = true, b =false;
         // System.out.println(a && b);
         // System.out.println(a || b);
         
         // int a = 10, b = 10;
         // System.out.println(a<b);
         // System.out.println(a>b);
         // System.out.println(a<=b);
         // System.out.println(a>=b);
         
         // System.out.println(a==b);
         // System.out.println(a!=b);
         
         // App app = new App();
         // App s1 = (App)new student();
         // System.out.println(s1 instanceof student); 
         
         // System.out.println(app instanceof student);
         
         // System.out.println(a<b & a>b);
         // System.out.println(a<b | a>b);
         // System.out.println(a<b ^ a>=b);
         
         // int a = 20, b = 10;
         // if(a == b){
        //     System.out.println("Equal");
        // }else if(a> b){
            //     System.out.println("a is big = "+ a);
            // }
            // else{
                //     System.out.println("b is big = " + b);
                // }
                // // String z = (a>=b)? ((a == b)? ("Equals") : ("A is big =" + a) ):("B is big =" + b);
                // String z = (a>b)? ("A is big =" + a):((a == b)? ("Equals") :  ("B is big =" + b));
                
                // System.err.println(z );
                
                // int k = a | b;
                // System.err.println(k);
                
                // k = a & b;
                // System.out.println(k);
                
                // k = a ^ b;
                // System.out.println(k);
        */

        // ternary operator
        // (condition)? true : false;
        int a = 10, b = 0;
        String a1 = a>b? "a is big = "+ a : "b is big = " + b; 
        System.out.println(a1);
        System.out.println(a>b? "a is big = "+ a : "b is big = " + b);
        String s1 = (a>b)? "A is big " + a: (a == b)? "A and B are equal" :"B is big"; 
        System.out.println(s1);

        // Assignment operator
        // bitwise=
        // Arithmetic=
        // shift=
        a >>= b; 
        a = a>>b;

        // bitwise 
        int i = 10, j = 20;
        int k = i | j ;
        System.out.println(k);
        
        /*
         * |i| =   10   convert to binary -   01010
         * |j| =   20   convert to binary - | 10100
         *                                    11110 = 30
         * 
         * 
         */
        
    }
}
                
                
                /*
                * 8 type of operators
                * 
 * 1 unary operator
 *   -++a : prefix increment operator (before value
 *   -a++ : postfix  increment operator (after value)
 *   --a : prefix decrement operator
 *   a-- : postfix  decrement operator
 *   ~a : (5) (-1 to -6)  bitwise complement operator
 *   !a : logical negation operator (true) -> false
 * 
 * 2 arithmetic operator
 *   - +, -, *, /, % : addition, subtraction, multiplication, division, modulus
 * 
 * 3 shift operator
 *      >> and >>>
 *      <<
 * 4 logical operator
 *    -  logical AND (&&)
 *    -  logical OR (||)
 * 
 * logical AND
 * 1 = true
 * 0 = false
 * truth table
 * |0|0|  0
 * |1|0|  0
 * |0|1|  0
 * |1|1|  1
 * 
 * Logical OR
 * truth table
 * |0|0|  0
 * |1|0|  1
 * |0|1|  1
 * |1|1|  1
 * 
 * 
 * 5 relational operator 
 * comparison operator  
 *      < > <= >= instanceof
 * equality  operator    
 *      == !=
 * 
 * 6 bitwise operator
 *     &: bitwise AND
 *     |: bitwise inclusive OR
 *     ^: bitwise XOR(exclusive or)
 * 7 ternary operator
 *  (condition)? true : false
 * 8 assignment operator
 * bitwise=
 * arithmetic=
 * shift=
 * a  = a bitwise b    ->    a bitwise=  b
 * a = a arithmetic b  ->    a arithmetic= b
 * a = a shift b        ->   a shift= b
 */