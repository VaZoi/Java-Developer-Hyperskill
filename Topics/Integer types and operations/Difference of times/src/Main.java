import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();
        int four = scanner.nextInt();
        int five = scanner.nextInt();
        int six = scanner.nextInt();
        int hour = one * 60 * 60;
        int minutes = two * 60;
        int hour1 = four * 60 * 60;
        int  minute1 = five * 60;
        int time1 = hour + minutes + three;
        int time2 = hour1 + minute1 + six;
        int difference = time2 - time1;
        System.out.println(difference);

    }
}