import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[][] mockUpDb = {
                {"Eren Berik", "12345678900"},
                {"Ahmet Mehmet", "98765432111"},
                {"Ali Veli", "11223344556"},
                {"Ayşe Fatma", "99887766554"}
        };
        Scanner sc = new Scanner(System.in);
        String nameSurname;
        String lastThreeDigits;

        do {
            System.out.print("Lütfen isim soyisim giriniz (Çıkmak için q/Q): ");
            nameSurname = sc.nextLine().toLowerCase();

            if (nameSurname.equals("q")) {
                System.out.println("Programdan çıkılıyor...");
                break;
            }

            boolean isUserFound = false;

            for (String[] db : mockUpDb) {
                if (db[0].toLowerCase().equals(nameSurname)) {
                    isUserFound = true;
                    String idNumber = db[1];
                    String firstEightDigits = idNumber.substring(0, 8);
                    String hiddenLastThreeDigits = "***";

                    System.out.println("TC Kimlik Numarası: " + firstEightDigits + hiddenLastThreeDigits);

                    System.out.print("TC Kimlik numarasının son 3 rakamını giriniz: ");
                    lastThreeDigits = sc.nextLine();

                    if (lastThreeDigits.equals(idNumber.substring(8))) {
                        System.out.println("Correct");
                    } else {
                        System.out.println("Hata: TC Kimlik No yanlış girildi.");
                    }
                    break;
                }
            }
            int b = 4;
            String a = Integer.toString(b);
            if (!isUserFound) {
                System.out.println("Hata: İsim soyisim bulunamadı.");
            }
        } while (!nameSurname.equals("q"));
    }
}