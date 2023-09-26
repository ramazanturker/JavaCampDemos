import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        // kendinden başka pozitif tüm tam bölenlerin sayısı toplamı kendisine eşit olan sayılar mükemmel sayıdır.
        // 6 mükemmel sayıdır nedeni. 1,2,3'e tam bölünür. 6/3 = 2 # 6/2 = 3 # 6/6 = 1 --> sonuçları topla 1+2+3 = 6
        // 28 de aynı --> 1,2,7 ve 14'e bölünür

        Scanner scanner = new Scanner(System.in);
        System.out.print("bir sayı gir : ");
        int number = scanner.nextInt();

        int total =0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total = total + i;
            }
        }

        if (total == number ) {
            System.out.println(number + " sayısı mükemmel sayıdır");
        } else {
            System.out.println(number + " sayısı mükemmel sayı değildir");
        }

        /*
        // Mükemmel sayı formülü

        double forceDouble = Math.pow(2, number);
        int force = (int) forceDouble;
        double baseDouble = Math.pow(2, number - 1);
        int base = (int) baseDouble;

        int awesomeNumber =  base * (force - 1);

        System.out.println(awesomeNumber);
         */
    }
}