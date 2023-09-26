import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("bir sayı giriniz : ");
        int number1 = scanner.nextInt();
        System.out.print("bir sayı daha giriniz : ");
        int number2 = scanner.nextInt();

        int total1 = 0;
        int total2 = 0;

        for (int i = 1; i < number1; i++) {
            if (number1 % i == 0) {
                total1 = total1 + i;
            }
        }

        for (int i = 1; i < number2; i++) {
            if (number2 % i == 0) {
                total2 = total2 + i;
            }
        }

        if (total1 == number2 && total2 == number1) {
            System.out.println(number1 + " ve " + number2 + " sayıları arkadaş sayılardır");
        } else {
            System.out.println(number1 + " ve " + number2 + " sayıları arkadaş sayı değildir");
        }

    }
}