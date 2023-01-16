import java.util.Scanner;

public class BagliListe {   // Cift Yönlü Dogrusal Baglı Liste Yapisi

    Scanner scanner = new Scanner(System.in);

    MusteriNode head = null;
    MusteriNode tail = null;

    int id;
    String ad;
    String soyad;
    String tel;
    String adres;
    String urun;

    void ekle(){

        System.out.println("Musterinin bilgilerini giriniz: ");
        System.out.print("numarasi: ");   id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("ad: ");       ad = scanner.nextLine();
        System.out.print("soyad: ");    soyad = scanner.nextLine();
        System.out.print("telefon: ");  tel = scanner.nextLine();
        System.out.print("adres: ");    adres = scanner.nextLine();
        System.out.print("urun: ");     urun = scanner.nextLine();

        MusteriNode eleman = new MusteriNode(id,ad,soyad,tel,adres,urun);

        if (head == null){
            head = eleman;
            tail = eleman;
            System.out.println("liste olusturuldu, ilk musteri kayıt edildi.");
        }
        else {
            eleman.next =head;
            head.prev = eleman;
            head = eleman;
            System.out.println(id + " numarali musteri kayit edildi.");
        }
    }

    void sil(){

        boolean sonuc = false;

        if (head == null){
            System.out.println("Liste bos !!");
        }
        else {
            System.out.print("Silinecek musteri numarasi: ");
            id = scanner.nextInt();
            scanner.nextLine();

            if (head.next == null && head.id == id){    //listede tek düğüm varsa ve headin içindeki id ile kullanıcıdan aldığım id eşitse
                head = null;
                tail = null;
                System.out.println(id + " numarali musteri silindi.");
                sonuc = true;
            }
            else if (head.next != null && head.id == id){  // listede birden fazla düğüm varsa ve silmek istediğim düğüm listenin en başındakiyse
                head = head.next;
                head.prev = null;
                System.out.println(id + " numarali musteri silindi.");
                sonuc = true;

            }
            else if (tail.id == id){   //silmek istediğim düğüm en sondaki düğümse, yani tail
                tail = tail.prev;
                tail.next = null;
                System.out.println(id + " numarali musteri silindi.");
                sonuc = true;

            }
            else{    //aradan eleman silme
                MusteriNode temp = head;

                while (temp != null){

                    if (temp.id == id){
                        temp.next.prev = temp.prev;
                        temp.prev.next = temp.next;
                        sonuc = true;
                        break;
                    }
                    temp = temp.next;
                }

            }
            if (!sonuc){  // sonuc false ise;
                System.out.println(id + " numarali musteri listede yok !!");
            }
        }
    }

    void guncelle(){

        boolean sonuc = false;

        if (head == null){
            System.out.println("Liste bos !!");
        }
        else {
            System.out.print("Guncellenecek musteri numarasi:  ");   id = scanner.nextInt();
            scanner.nextLine();

                MusteriNode temp = head;

                while (temp != null){

                    if (temp.id == id){

                        System.out.println(id + " numarali musteri bilgileri: ");
                        System.out.println("ad: "      + temp.ad );
                        System.out.println("soyad: "   + temp.soyad);
                        System.out.println("telefon: " + temp.tel);
                        System.out.println("adres: "   + temp.adres);
                        System.out.println("urun: "    + temp.urun);

                        System.out.println("Urun bilgisini guncelleyiniz: ");
                        temp.urun = scanner.nextLine();
                        System.out.println("Urun bilgisi guncellendi.");

                        sonuc = true;
                        break;
                    }
                    temp = temp.next;
                }

            if (!sonuc){  // sonuc false ise;
                System.out.println(id + " numarali musteri listede yok !!");
            }
        }
    }

    void musteriAra(){

        boolean sonuc = false;

        if (head == null){
            System.out.println("Liste bos !!");
        }
        else {
            System.out.print("Aradiginiz musteri numarasi:  ");   id = scanner.nextInt();
            scanner.nextLine();

                MusteriNode temp = head;
                while (temp != null){

                    if (temp.id == id){

                        System.out.println(id + " numarali musteri bilgileri: ");
                        System.out.println("ad: "      + temp.ad );
                        System.out.println("soyad: "   + temp.soyad);
                        System.out.println("telefon: " + temp.tel);
                        System.out.println("adres: "   + temp.adres);
                        System.out.println("urun: "    + temp.urun);


                        sonuc = true;
                        break;
                    }
                    temp = temp.next;
                }

            if (!sonuc){  // sonuc false ise;
                System.out.println(id + " numarali musteri listede yok !!");
            }
        }
    }

    void yazdir(){

        if (head == null){
            System.out.println("Liste bos !!");
        }
        else {
            System.out.println("Numara\tAd\tSoyad\tTelefon\tAdres\tUrun adi\n");

            MusteriNode temp = head;
            while (temp != null){

                    System.out.println(temp.id + "\t" + temp.ad + "\t" + temp.soyad + "\t" + temp.tel + "\t" + temp.adres + "\t" + temp.urun);

                temp = temp.next;
            }
        }
    }
}
