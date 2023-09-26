public class Main {
    public static void main(String[] args) {

        double[] myList = { 1.3, 6.8, 4.3, 5.6 };
        double total = 0;
        double max = myList[0];

        for (double number : myList) {
            total = total + number;
            if (max < number) {
                max = number;
            }
            System.out.println(number);
        }

        System.out.println("toplam : " + total);
        System.out.println("en büyük : " + max);

    }
}