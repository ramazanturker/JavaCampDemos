public class Main {
    public static void main(String[] args) {

        // for
        for (int i = 1; i <= 10; i+=2) {
            System.out.println(i);
        }
        System.out.println("for döngüsü bitti");

        // while
        // infinite loop - sonsuz döngü
        int i = 2;
        while (i <= 10) {
            System.out.println(i);
            i += 2;
        }
        System.out.println("while döngüsü bitti");

        // do - while
        int j = 3;
        do {
            System.out.println(j);
            j += 3;
        } while (j < 10);
        System.out.println("do - while döngüsü bitti");
    }
}