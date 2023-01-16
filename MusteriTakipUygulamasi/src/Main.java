import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BagliListe liste = new BagliListe();

        int secim = -1;
        while (secim != 0 ){
            System.out.println("1- ekle ");
            System.out.println("2- sil");
            System.out.println("3- güncelle");
            System.out.println("4- musteri ara");
            System.out.println("5- yazdir");
            System.out.println("0- cikis");
            System.out.println("Seciminiz: ");
            secim = scanner.nextInt();
            scanner.nextLine();

            switch (secim)
            {   case 1: liste.ekle(); break;
                case 2: liste.sil(); break;
                case 3: liste.guncelle(); break;
                case 4: liste.musteriAra(); break;
                case 5: liste.yazdir(); break;
                case 0: System.out.println("Cikis yaptiniz...."); break;
                default: System.out.println("Hatali secim yaptiniz [0-5] "); break;
            }
        }

    }
}
