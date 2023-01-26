import java.util.Scanner;

public class BagliListe {       // Tek yönlü dairesel Linkedlist
    Scanner scanner = new Scanner(System.in);

    OtoNode head = null;
    OtoNode tail = null;

    String plaka;
    String marka;
    String model;
    String renk;
    int alisFiyat;
    int satisFiyat;
    String aciklama;

    void ekle(){
        System.out.println("Galeriye eklenecek otomobilin bilgilerini giriniz: ");
        System.out.print("Plaka: "); plaka = scanner.nextLine();
        System.out.print("Marka: "); marka = scanner.nextLine();
        System.out.print("Model: "); model = scanner.nextLine();
        System.out.print("Renk: "); renk = scanner.nextLine();
        System.out.print("Alis fiyati: "); alisFiyat = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Aciklama: "); aciklama = scanner.nextLine();

        OtoNode arac = new OtoNode(plaka,marka,model,renk,alisFiyat,aciklama);

        if ( head == null) {
            head = arac;
            tail = arac;
            tail.next = head;
            System.out.println(plaka + " plakalı arac otogaleriye eklendi.");
        }
        else {                    //basa ekleme
            arac.next = head;
            head = arac;
            tail.next = head;
            System.out.println(plaka + " plakalı arac otogaleriye eklendi.");

        }
    }
    void sil(){
        if ( head == null){
            System.out.println("Otogaleride arac yok");
        }
        else {
            System.out.println("Satışını yaptığınız otomobilin plakası: "); plaka = scanner.nextLine();
            if ( head == tail && head.plaka.equals(plaka) ){           //ilk aracı satma durumu için , head= tail otogaleride 1 araç var demektir.
                System.out.println(plaka + " plakalı araç " + head.satisFiyat + " TL'ye satıldı.");
                head = null;
                tail = null;

            }
            else if ( head != tail && head.plaka.equals(plaka) ){           //ilk aracı satma durumu için , head= tail otogaleride 1 araç var demektir.
                System.out.println(plaka + " plakalı araç " + head.satisFiyat + " TL'ye satıldı.");
                head = head.next;
                tail = head;
            }
            else {
                OtoNode temp = head;
                OtoNode temp2 = temp;

                while (temp != tail){
                    if (temp.plaka.equals(plaka)){           //satmak istediğimiz araç budur.
                        System.out.println(plaka + " plakalı araç " + temp.satisFiyat + " TL'ye satıldı.");
                        temp2.next = temp.next;
                    }

                    temp2 = temp;
                    temp = temp.next;
                }
                if (temp.plaka.equals(plaka)){           //satmak istediğimiz araç buysa, bu listedeki son araçtır. o da tail anlamına gelir.
                    System.out.println(plaka + " plakalı araç " + temp.satisFiyat + " TL'ye satıldı.");
                    tail = temp2;
                    tail.next = head;
                }
            }
        }
    }
    void yazdir(){

        if (head == null){
            System.out.println("Otogaleride araç yoktur.");
        }
        else {
            System.out.println("Plaka\tMarka\tModel\tRenk\tAlisFiyati\tSatisFiyati\tAciklama ");

            OtoNode temp = head;
            while (temp != tail){
                System.out.println(temp.plaka + "\t" + temp.marka + "\t" + temp.model + "\t" + renk + "\t" + temp.alisFiyat + "\t" + temp.satisFiyat + "\t" +  temp.aciklama);
                temp = temp.next;
            }
            System.out.println(temp.plaka + "\t" + temp.marka + "\t" + temp.model + "\t" + renk + "\t" + temp.alisFiyat + "\t" + temp.satisFiyat + "\t" + temp.aciklama);
        }
    }
    void aracAra(){
        if (head == null ){
            System.out.println("Otogaleride araç yoktur.");
        }
        else {
            boolean sonuc = false;
            System.out.println("Aradığınız aracın plakası: "); plaka = scanner.nextLine();
            OtoNode temp = head;
            OtoNode temp2 = head;

            while (temp != tail ){
                if (temp.plaka.equals(plaka)){
                    temp2 = temp;
                    sonuc = true;
                }
                temp = temp.next;
            }
            if (temp.plaka.equals(plaka)){
                temp2 = temp;
                sonuc = true;
            }

            if (sonuc == false){
                System.out.println(plaka + " plakalı araç otogaleride yoktur. ");
            }
            else {
                System.out.println(plaka + " plakalı araç bilgileri: ");
                System.out.println("Marka: " + temp2.marka);
                System.out.println("Model: " + temp2.model);
                System.out.println("Renk: " + temp2.renk);
                System.out.println("Alış fiyatı: " + temp2.alisFiyat);
                System.out.println("Satış fiyatı: " + temp2.satisFiyat);
                System.out.println("Açıklama: " + temp2.aciklama);

            }
        }

    }











}
