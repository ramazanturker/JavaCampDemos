public class Main {
    public static void main(String[] args) {
        char grade = 'C';

        switch (grade) {
            case 'A':
                System.out.println("excellient");
                break;

            case 'B':
            case 'C':
                System.out.println("good");
                break;

            case 'D':
                System.out.println("no bad");
                break;

            case 'F':
                System.out.println("fail");
                break;

            default:
                System.out.println("invalid grade entry");
        }
    }
}