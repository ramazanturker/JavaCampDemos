
public class Main {
    public static void main(String[] args) {

        String[][] sehirler = new String[3][3];

        sehirler[0][0] = "istanbul";
        sehirler[0][1] = "kocaeli";
        sehirler[0][2] = "bursa";

        sehirler[1][0] = "ankara";
        sehirler[1][1] = "çankırı";
        sehirler[1][2] = "konya";

        sehirler[2][0] = "izmir";
        sehirler[2][1] = "aydın";
        sehirler[2][2] = "muğla";

        for (int i = 0; i < 3; i++) {
            System.out.println("---------------------------------");
            for (int j = 0; j < 3; j++) {
                System.out.println(sehirler[i][j]);
            }
        }
    }
}