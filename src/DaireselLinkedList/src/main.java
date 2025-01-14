import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BagliListe liste = new BagliListe();

        int secim = -1;
        while ( secim != 0){
            System.out.println("1-Basa ekle");
            System.out.println("2-Sona ekle");
            System.out.println("3-Araya ekle");
            System.out.println("4-Bastan sil");
            System.out.println("5-Sondan sil");
            System.out.println("6-Aradan sil ");
            System.out.println("0-Cikis");
            System.out.println("seciminiz: ");
            secim = scanner.nextInt();
            scanner.nextLine();

            switch (secim){
                case 1: liste.basaEkle(); break;
                case 2: liste.sonaEkle(); break;
                case 3: liste.arayaEkle(); break;
                case 4: liste.bastanSil(); break;
                case 5: liste.sondanSil(); break;
                case 6: liste.aradanSil(); break;
                case 0: System.out.println("Çıkış yaptınız..."); break;
                default: System.out.println("Hatalı seçim yaptınız. [0 - 6] ");

            }
            liste.yazdir();

        }
    }
}
