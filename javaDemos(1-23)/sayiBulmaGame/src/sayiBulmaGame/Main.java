package sayiBulmaGame;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int number = random.nextInt(100) + 1;
		
		int remainingRight = 4;
		
		
		for (int i = remainingRight; i >= 0; i--) {
			
			System.out.print("(1 - 100) arasında bir sayı tuttum bil bakalım : ");
			int guess = scanner.nextInt();
			
			if (guess == number) {
				System.out.println("tebrikler doğru tahminde bulundunuz");
				break;
			}
			if (remainingRight == 0) {
				System.out.println("hakkınız kalmadı doğru cevap " + number);
				break;
			}
			if (guess < number) {
				remainingRight--;
				System.out.println("daha büyük bir sayı söyleyiniz (kalan hakkınız) : " + i);
			} 
			if (guess > number) {
				remainingRight--;
				System.out.println("daha küçük bir sayı söyleyiniz (kalan hakkınız) : " + i);
			}
			
			System.out.println();
		}

	}

}
