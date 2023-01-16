import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int secim = -1;
        OgrListe bilBolum = new OgrListe();

        Scanner scanner = new Scanner(System.in);

        while (secim != 0 ){
            System.out.println();
            System.out.println("Bilgisayar bölümü öğrenci kayıt uygulaması ");
            System.out.println("1- Yeni kayıt");
            System.out.println("2- Kayıt sil ");
            System.out.println("3- Kayıtları listele");
            System.out.println("4- En başarılı öğrenci bilgileri ");
            System.out.println("0- Çıkış");
            System.out.println("Seçiminiz: ");
            secim = scanner.nextInt();

            if (secim == 1 ){
                bilBolum.ekle();
            }
            else if (secim == 2){
                bilBolum.sil();
            }
            else if (secim == 3 ){
                bilBolum.yazdir();
            }
            else if (secim == 4){
                bilBolum.enBasariliOgrenci();
            }
            else if (secim == 0){
                System.out.println("Programi sonlandirdiniz...");
            }
            else {
                System.out.println("Hatalı seçim yaptınız [0 - 4]");
            }
        }
    }
}
