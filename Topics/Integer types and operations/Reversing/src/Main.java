import java.sql.SQLOutput;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int hundreds = number / 100;
        int tens = (number % 100) / 10;
        int units = number % 10;
        System.out.println(units * 100 + tens * 10 + hundreds);
    }
}