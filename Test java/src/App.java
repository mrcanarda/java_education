import java.util.Scanner; // Scanner sınıfını ekle

public class App {
    public static void main(String[] args) {
        // Scanner s = new Scanner(System.in); // Scanner nesnesi oluştur
        // System.out.print("Kilonuzu girin: ");
        // String isim = s.nextLine(); // Kullanıcıdan bir metin al
        // System.out.println("Merhaba, " + isim + "!");
        // s.close(); // Scanner nesnesini kapat

        Scanner s = new Scanner(System.in);
        
        int giris_hakki = 3;

        String sys_kullanici_adi = "Can Arda";
        String sys_parola = "12345";

        System.out.println("**************************");
        System.out.println("Kullanici Girisine Hosgeldiniz");
        System.out.println("**************************");
        
        while (true) {
            System.out.println("Kullanici adinizi Giriniz: ");
            String kullanici = s.nextLine();
            System.out.println("Parola Giriniz: ");
            String parola = s.nextLine();

            if (kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)) {
                System.out.println("Hosgeldinz " + sys_kullanici_adi);
                break;

            } 
            else if (kullanici.equals(sys_kullanici_adi) && !parola.equals(sys_parola)) {
                System.out.println("Parolaniz Yanlis" + giris_hakki );
                giris_hakki -= 1;
            }
            else if (!kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)) {
                System.out.println("Kullanici Adiniz Yanlis" + giris_hakki);
                giris_hakki -= 1;
            }

            else {
               
                System.out.println("giris_hakkiniz:" + giris_hakki);
                giris_hakki -=1;
            }

            if(giris_hakki  == 0 ) {
                System.out.print("Giris Hakkiniz Kalmadi Cikin disari!");
                break;
            }
        }
        

    }
}

// Tam sayı: nextInt()
// Ondalıklı sayı: nextDouble()
// Tek kelime/metin: next()
// Satır/metin: nextLine()

