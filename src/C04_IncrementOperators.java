import java.util.Scanner;

public class IncrementOperators {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int tuna = 5;
        int bass = 18;

        tuna = tuna + 5;
        tuna += 8;
        bass *= 8;

        System.out.println(tuna++);
        System.out.println(bass);
    }
}