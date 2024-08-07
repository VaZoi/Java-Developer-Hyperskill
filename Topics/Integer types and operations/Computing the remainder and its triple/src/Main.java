import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        // The first operation goes here
        int divide = input % 2;
        System.out.println(divide);
        // The second operation goes here
        int multiply = divide * 3;
        System.out.println(multiply);

        scanner.close();
    }
}