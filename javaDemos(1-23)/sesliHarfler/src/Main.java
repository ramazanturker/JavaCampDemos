public class Main {
    public static void main(String[] args) {

        char harf = 'ü';

        switch (harf) {
            case 'A':
            case 'a':
            case 'E':
            case 'e':
            case 'I':
            case 'ı':
            case 'İ':
            case 'i':
            case 'O':
            case 'o':
            case 'Ö':
            case 'ö':
            case 'U':
            case 'u':
            case 'Ü':
            case 'ü':
                System.out.println(harf + " harfi sesli bir harftir");
                break;
            default:
                System.out.println("geçersiz karakter (!'^+%&/()=?_-*|@.,;:Ü~¨€₺`<>[]{}#$é´) veya sessiz bir harf girdiniz!");
        }

    }
}