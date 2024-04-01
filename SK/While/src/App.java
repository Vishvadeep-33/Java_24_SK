import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int a = 1;
        while (a == 0) {
            a++;
            System.out.println(a);
        }
        Scanner in = new Scanner(System.in);
        // enter a value  =  1234 
        // 1234 find which digit are odd and find sum of them 
        // same but even
        int n, r, sum=0, sum1=0;
        System.out.println("enter a number");
        n = in.nextInt();
        in.close();
        while (n>0){
            r = n % 10 ;
            n = n/10;
            if (r%2==0){
            sum += r;
            }
            else{
            sum1 = sum1 + r;
            }
        }
        System.out.println(sum1);
        System.out.println(sum);

        // break
        // continue
        a = 1;
        while (a < 10) {
            if(a == 5){
                a++;
                continue;
            }
            System.out.println(a);
            a++;
        }
        a = 1;
        do{
            if(a == 5){
                a++;
                continue;
            }
            System.out.println(a);
            a++;
        }while(a<10);
        /*
         * 
         */
        //

    


    }

}
