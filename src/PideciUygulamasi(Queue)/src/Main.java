import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int secim = -1 , n;

        System.out.println("Kuyruk yapısının eleman sayısı: "); n =scanner.nextInt();

        QueuePideYapisi kuyruk = new QueuePideYapisi(n);
        while (secim != 0){
            System.out.println("1- Yeni musteri ekle");
            System.out.println("2- Satış yap");
            System.out.println("3- Bekleyen musteriler");
            System.out.println("4- Toplam gelir");
            System.out.println("0- Çıkış");
            System.out.print("seciminiz: ");
            secim = scanner.nextInt();


            switch (secim){
                case 1: kuyruk.enQueue(); break;
                case 2: kuyruk.deQueue(); break;
                case 3: kuyruk.print(); break;
                case 4: System.out.println("Toplam gelir: " + kuyruk.toplamGelir); break;
                case 0: System.out.println("Çıkış yaptınız..."); break;
                default: System.out.println("Hatalı islem [0-4]");
            }
        }
    }
}
