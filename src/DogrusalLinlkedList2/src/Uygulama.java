import java.util.Scanner;

public class Uygulama {
    public static void main(String[] args) {

        TekYonluListeYapisi tekYonList = new TekYonluListeYapisi();

        int secim = 1;

        Scanner scan = new Scanner(System.in);
        int sayi, indis;

        while (secim != 0){
            System.out.println();
            System.out.println("1 basa ekle ");
            System.out.println("2 sona ekle ");
            System.out.println("3 araya ekle ");
            System.out.println("4 bastan sil");
            System.out.println("5 sondan sil ");
            System.out.println("6 aradan sil");
            System.out.println("0 cikis ");
            System.out.println("Seciminiz: ");
            secim=scan.nextInt();

            if (secim == 1){
                System.out.println("Sayi: ");
                sayi = scan.nextInt();
                tekYonList.basaEkle(sayi);
            }
            else if (secim == 2){
                System.out.println("Sayi: ");
                sayi = scan.nextInt();
                tekYonList.sonaEkle(sayi);
            }
            else if (secim == 3){
                System.out.println("Sayi: ");
                sayi = scan.nextInt();
                System.out.println("Indis: ");
                indis = scan.nextInt();
                tekYonList.arayaEkle(indis,sayi);
            }
            else if (secim == 4){
                tekYonList.bastanSil();
            }
            else if (secim == 5){
                tekYonList.sondanSil();
            }
            else if (secim == 6){
                System.out.println("Indis: ");
                indis = scan.nextInt();
                tekYonList.aradanSil(indis);
            }
            else if(secim == 0 ){
                System.out.println("Program sonlandirildi....");
            }
            else {
                System.out.println("Hatali secim yaptiniz.");
            }

            tekYonList.yazdir();

        }






    }
}




//System.out.println("Baştaki düğümün elemanı: " + tekYonList.head.data);
//System.out.println("Sondaki düğümün elemanı: " + tekYonList.tail.data);