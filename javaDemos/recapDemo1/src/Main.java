import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. sayıyı giriniz : ");
        int sayi1 = scanner.nextInt();

        System.out.println("2. sayıyı giriniz : ");
        int sayi2 = scanner.nextInt();

        System.out.println("3. sayıyı giriniz : ");
        int sayi3 = scanner.nextInt();

        int enBuyuk = sayi1;

        if (sayi2 > enBuyuk) {
            enBuyuk = sayi2;
        }
        if (sayi3 > enBuyuk) {
            enBuyuk = sayi3;
        }

        System.out.println("En büyük sayı : " + enBuyuk + " sayısıdır.");
    }
}