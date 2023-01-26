import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BagliListe {  // Çift Yönlü dairesel bağlı liste
    Scanner scanner = new Scanner(System.in);

    OtoNode head = null;
    OtoNode tail = null;
    OtoNode temp = head;
    OtoNode temp2 = temp;

    String plaka;
    String giris;
    String cikis;
    long dakika;
    long ucret;
    long toplamUcret = 0;

    void ekle(){
        System.out.print("Plaka: "); plaka = scanner.nextLine();
        System.out.print("Giris saati (ss:dd) : "); giris = scanner.nextLine();

        OtoNode arac = new OtoNode(plaka,giris);

        if (head == null){
            head = arac;
            tail = arac;
            head.next = tail;
            tail.prev = head;
            head.prev=tail;
            tail.next =head;
            System.out.println("Araç otoparka girdi.");
        }
        else{
            arac.next=head;
            head.prev = arac;
            head=arac;
            head.prev = tail;
            tail.next=head;
            System.out.println("Araç otoparka girdi.");
        }
    }
    void sil () throws ParseException {
        if (head == null){
            System.out.println("Otopark boştur!!");
        }
        else {
            System.out.print("Plaka: "); plaka = scanner.nextLine();
            System.out.print("Çıkış saati (ss:dd) : "); cikis = scanner.nextLine();

            if (head == tail && head.plaka.equals(plaka)){
                ucretHesapla(head, cikis);
                head =null;
                tail=null;
                System.out.println("Araç çıkışı yapıldı...");
            }
            else if (head != tail && head.plaka.equals(plaka)){
                ucretHesapla(head, cikis);
                head =head.next;
                head.prev = tail;
                tail.next = head;
                System.out.println("Araç çıkışı yapıldı...");
            }
            else {
                temp = head;
                while (temp != tail){
                    if (temp.plaka.equals(plaka)){     //tempin plakası , kullanıcıdan aldığım plakaya eşit mi ?
                        ucretHesapla(temp, cikis);
                        temp2.next = temp.next;
                        temp.next.prev = temp2;
                        System.out.println("Araç çıkışı yapıldı...");
                    }
                    temp2 = temp;
                    temp = temp.next;
                } //silmek istediğim düğüm tail olabilir, while döngüsünde taile gelince döngüden çıkacağı için, 1 defaya mahsus while'ın dışında if'i kullanıyorum.
                if (temp.plaka.equals(plaka)){     //tempin plakası , kullanıcıdan aldığım plakaya eşit mi ?
                    ucretHesapla(temp, cikis);
                    tail = temp2;
                    tail.next=head;        //dairesel olması nedeniyle son düğüm ile baş düğümün bağlantısını hiç koparmıyorum.
                    head.prev = tail;
                    System.out.println("Araç çıkışı yapıldı...");
                }
            }
        }
    }

    void ucretHesapla(OtoNode temp3, String cikis2) throws ParseException {

        giris = temp3.giris;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");    //Format dönüştürme fonksiyonu , saat ve dakika aldım. [dd.MM.yyyy gün ay saat böyle alınır]

        Date d1, d2;
        d1 = simpleDateFormat.parse(giris);
        d2 = simpleDateFormat.parse(cikis2);

        dakika = d2.getTime() - d1.getTime();  //Aracın giris saati ile çıkış saati arasındaki farkı aldım fakat salise cinsinden aldım.
        dakika = dakika / 60000;    // Bu şekilde dakikayı bulmuş oldum.
        ucret = dakika / 4;
        System.out.println("süre: " + dakika + " dk ");
        System.out.println("Ücret: " + ucret + " TL " );
        toplamUcret += ucret;

    }
    void yazdir(){
        if (head == null){
            System.out.println("Otoparkta araç yoktur!!");
        }
        else {
            System.out.println("PLAKA \t\tGİRİŞ SAAT");
            temp = head;
            while (temp != tail){
                System.out.println(temp.plaka + "\t\t" + temp.giris);
                temp=temp.next;
            }
            System.out.println(temp.plaka + "\t\t" + temp.giris + "\n");
        }
    }


}
