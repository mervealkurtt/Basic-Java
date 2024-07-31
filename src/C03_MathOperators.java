import java.util.Scanner;

public class MathOperators {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int girls, boys, people;
        /* girls = 6;
        boys = 3;
        people = boys + girls;
        System.out.println(people);
        */


        girls = 11;
        boys = 3;
        people = boys % girls;
        System.out.println(people);
    }
}
