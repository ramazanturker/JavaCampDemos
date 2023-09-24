public class Main {
    public static void main(String[] args) {

        String mesaj = "   bugün hava çok güzel   ";
        System.out.println("ana mesaj " + mesaj);

        System.out.println("-------------------------");

        System.out.println(mesaj.trim());
        System.out.println("eleman sayısı : " + mesaj.length());
        System.out.println("5. harf : " + mesaj.charAt(4));
        System.out.println(mesaj.concat(" yupii!"));    // yeni değişken oluşturulup içine atılırsa kalıcı olur
        System.out.println(mesaj.startsWith("b"));
        System.out.println(mesaj.endsWith("!")); // false çünkü yupii! kelimesi tek kullanımlık
        System.out.println(mesaj.indexOf('a'));
        System.out.println(mesaj.lastIndexOf(" "));
        System.out.println(mesaj.substring(2, 5));
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.toLowerCase());
        char[] karakterler = new char[5];
        mesaj.getChars(0, 5, karakterler, 0);
        System.out.println(karakterler);

        String yeniMesaj = mesaj.replace(' ', '-');
        System.out.println(yeniMesaj);
        System.out.println(mesaj);

        for (String kelime : mesaj.split(" ")) {
            System.out.println(kelime);
        }
    }
}