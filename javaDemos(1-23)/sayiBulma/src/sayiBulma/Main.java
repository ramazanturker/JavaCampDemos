package sayiBulma;

public class Main {

	public static void main(String[] args) {
		
		int[] numbers = new int[] { 45, 1, 2, 8, 18, 47, 56, 23 };
		
		int dialedNumber = 1456;
		boolean isThere = false;
		
		for (int number : numbers) {
			if (number == dialedNumber) {
				isThere = true;
			}
		}
		
		if (isThere) {
			System.out.println("number is available");
		} else {
			System.out.println("number is not available");
		}
		
		/* 
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };

		int aranacak = 77;
		
		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				System.out.println("aranan " + aranacak + " sayısı dizide mevcut");
				return;
			} else {
				System.out.println("aranan " + aranacak + " sayısı dizide mevcut değildir");
				return;
			}
		}
		*/
	}

}
