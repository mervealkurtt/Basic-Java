import java.util.Scanner;

public class MultipleClassMain {

    public static void main(String[] args) {

        /*
        MultipleClass multipleClassObj = new MultipleClass();
        multipleClassObj.simpleMessage();
         */

        Scanner input = new Scanner(System.in);
        UsingMethodsWithParameters metParObject = new UsingMethodsWithParameters();

        System.out.println("Enter your name here: ");
        String name = input.nextLine();

        metParObject.simpleMessage2(name);



    }
}
