
import java.util.Scanner;




public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello\"s World!");
        System.out.println("Heyy\"y how\"s it going");
        System.out.println("Hey\"y how\"s going");

        System.out.println(3 + 10);
        System.out.println(3 - 10);
        System.out.println(3 / 10);
        System.out.println(3 % 10);
        System.out.println(3 ^ 10);


        System.out.println(3 > 10);
        System.out.println(3 < 10);
        System.out.println(3 <= 10);
        System.out.println(3 >= 10);
        System.out.println(3 == 10);
        System.out.println(3 != 10);

        //primitives(provides the basic data types used to store a value)
        //wrapper class: provides you the extra information
        //byte
        //short
        //int
        //float
        //double
        //long

        System.out.println(Integer.SIZE);
        System.out.println(Byte.SIZE);
        System.out.println(Float.SIZE);
        System.out.println(Long.SIZE);
        System.out.println(Integer.MAX_VALUE);

        //type conversion:
        int a = (int)9.8;

        double t = 9 / 2;
        System.out.println(t);


    //conditional statements

    Scanner mango = new Scanner(System.in);
    System.out.print("X: ");
    int x = mango.nextInt();
    System.out.print("Y: ");
    int y = mango.nextInt();

    if(x > y){
        System.out.println("x is greater than y");
    }
    else{
        System.out.println("y is greater than x");
    }


    }
}