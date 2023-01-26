import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        /*Bir otopark işletmecisinin, otoparka giren araçların plakasını ve giriş saatini alan,
        daha sonra otoparktan ayrılan aracın çıkış saatini giren, ücreti hesaplatan bir uygulama */

        Scanner scanner = new Scanner(System.in);

        BagliListe liste = new BagliListe();

        int secim = -1;
        while (secim != 0){
            System.out.println("1- Otoparka araç girişi ");
            System.out.println("2- Otoparktan araç çıkışı ");
            System.out.println("3- Otoparktaki araçları listele ");
            System.out.println("4- Toplam gelir ( TL ) ");
            System.out.println("0- Çıkış ");
            System.out.println("Seciminiz: "); secim = scanner.nextInt();

            switch (secim){
                case 1: liste.ekle(); break;
                case 2: liste.sil(); break;
                case 3: liste.yazdir(); break;
                case 4: System.out.println("Toplam ücret: " + liste.toplamUcret); break;
                case 0: System.out.println("Çıkış yaptınız...."); break;
                default: System.out.println("Hatalı seçim yaptınız. [ 0 - 4 ]"); break;

            }


        }

    }
}
