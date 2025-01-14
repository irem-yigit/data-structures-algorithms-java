import java.util.Scanner;

public class OgrListe {

    OgrNode head = null;
    OgrNode tail = null;
    OgrNode temp = null;
    OgrNode temp2 = null;

    int numara;
    String ad;
    String soyad;
    int vizenotu;
    int finalnotu;
    double ortalama;
    String durum;

    Scanner scanner = new Scanner(System.in);


    void ekle(){

        System.out.println("Bilgisayar bölümüne kayıt olacak öğrenci bilgilerini giriniz: ");
        System.out.println("numara: ");     numara = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ad: ");         ad = scanner.nextLine();
        System.out.println("Soyad: ");      soyad = scanner.nextLine();
        System.out.println("Vize notu: ");  vizenotu = scanner.nextInt();
        System.out.println("Final notu: "); finalnotu = scanner.nextInt();

        OgrNode eleman = new OgrNode(numara,ad,soyad,vizenotu,finalnotu);

        if (head == null){
            head = eleman;
            tail = eleman;
            System.out.println("Bilgisayar bölümüne kayıt olacak öğrencilerin liste yapısı oluşturuldu, ilk öğrenci kayıt edildi.");
        }
        else {
            eleman.next = head;
            head = eleman;
            System.out.println(numara + " numaralı öğrenci kayıt edildi.");
        }
    }

    void sil(){

        if (head == null){
            System.out.println("Liste boş, silinecek öğrenci kaydı yok!!");
        }
        else{
            System.out.println("Silmek istediğiniz öğrencinin numarasını giriniz: ");
            numara = scanner.nextInt();

            if (numara == head.numara && head.next == null ){  //silmek istediğim tek öğrenci var o da head
                head = null;
                tail = null;
                System.out.println(numara + " numaralı öğrenci silindi, listede kayıtlı öğrenci kalmadı. ");
            }
            else if (numara == head.numara && head.next != null){  //listede birden fazla öğrenci var ama ben head'i silmek istiyorum
                head = head.next;   //headin göstericisini bir sonraki düğüme aktararak headi boşa çıkardım.
                System.out.println(numara + " numaralı öğrenci silindi.");

            }
            else {   //taili silmek istersem

                temp = head;
                temp2 = head;
                while (temp.next != null){

                    if (numara == temp.numara){

                        temp2.next = temp.next;
                        System.out.println(numara + " numaralı öğrenci silindi.");

                    }
                    temp2 = temp;
                    temp = temp.next;              // temp bir sonraki düğüme geçsin, yoksa sonsuz döngüye girer.
                }

                if (numara == temp.numara){

                    temp2.next = null;
                    tail = temp2;
                    System.out.println(numara + " numaralı öğrenci silindi.");
                }
            }
        }
    }

    void yazdir(){

        if (head == null){
            System.out.println("Liste bos !!");
        }
        else {
            temp = head;
            while (temp != null){
                System.out.println(temp.numara + " numaralı öğrenci bilgileri");
                System.out.println("*******************************");
                System.out.println("Ad: "           +temp.ad);
                System.out.println("Soyad: "        +temp.soyad);
                System.out.println("Vize notu: "    +temp.vizenotu);
                System.out.println("Fianl notu: "   +temp.finalnotu);
                System.out.println("Ortalama: "     +temp.ortalama);
                System.out.println("Durum: "        +temp.durum);
                System.out.println("*******************************");

                temp = temp.next;
            }
        }
    }

    void enBasariliOgrenci(){

        if (head == null){
            System.out.println("Liste bos !!");
        }
        else {
            temp = head;
            double  buyuk = temp.ortalama;

            while (temp != null){

                if (buyuk < temp.ortalama){

                    buyuk = temp.ortalama;

                    numara = temp.numara;
                    ad = temp.ad;
                    soyad = temp.soyad;
                    vizenotu = temp.vizenotu;
                    finalnotu = temp.finalnotu;
                    ortalama = temp.ortalama;
                    durum = temp.durum;
                }

                temp = temp.next;
            }

            System.out.println("En başarılı öğrenci öğrenci bilgileri");
            System.out.println("*******************************");
            System.out.println("Ad: "           +ad);
            System.out.println("Soyad: "        +soyad);
            System.out.println("Vize notu: "    +vizenotu);
            System.out.println("Fianl notu: "   +finalnotu);
            System.out.println("Ortalama: "     +ortalama);
            System.out.println("Durum: "        +durum);
            System.out.println("*******************************");
        }
    }


}
