import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("bir sayı giriniz : ");
        int number = scanner.nextInt();

        boolean isPrime = true;

        if (number == 1) {
            System.out.println("sayı asal değildir");
            return;
        }

        if (number < 1) {
            System.out.println("geçersiz sayı");
            return;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime) { // isPrime == true ile aynı anlamı taşır
            System.out.println("sayı asaldır");
        } else {
            System.out.println("sayı asal değildir");
        }

        /*if (sayi == 2) {
            if (sayi % 2 == 0) {
                System.out.println("sayı asaldır");
            }
            return;
        }

        if (sayi % 2 == 1) {
            System.out.println("sayı asaldır");
        } else {
            System.out.println("sayı asal değildir");
        }*/
    }
}