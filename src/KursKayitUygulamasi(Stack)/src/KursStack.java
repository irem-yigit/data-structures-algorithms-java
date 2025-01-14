import java.util.Scanner;

public class KursStack {

    Scanner scanner = new Scanner(System.in);

    KursNode top;
    int kontenjan;
    int sayac;

    public KursStack(int kontenjan) {
        this.kontenjan = kontenjan;
        sayac = 0;
        top = null;
    }

    String tc;
    String ad;
    String soyad;
    String mezunBolum;

    void ekle(){    // push()
        System.out.println("Kursa kayıt edilecek kişi bilgileri: ");
        System.out.println("tc no: "); tc=scanner.nextLine();
        System.out.println("Ad: "); ad=scanner.nextLine();
        System.out.println("soyad: "); soyad=scanner.nextLine();
        System.out.println("Mezun bölüm: "); mezunBolum=scanner.nextLine();

        KursNode eleman = new KursNode(tc,ad,soyad,mezunBolum);

        if (isFull()){
            System.out.println("Kurs kontenjanı dolu, yeni kayıt alamıyoruz !!");
        }
        else {
            if (isEmpty()){
                top = eleman;
                System.out.println(top.tc + "numaralı kişi kursa ilk kayıt olarak eklendi.");
            }
            else {  //stackte daha önceden kayıt varsa;
                eleman.next = top;
                top=eleman;
                System.out.println(top.tc + "numaralı kişi kursa eklendi.");
            }
            sayac++;
        }
    }
    void sil() {   // pop() --  burada hangi kişiyi sileceğim diye bir şey düşünemem zaten en üstteki düğümü yani top ı silmem gerekli
        if (isEmpty()){
            System.out.println("Kursta kayıtlı kimse yoktur !!");
        }
        else {
            System.out.println(top.tc + " numarali kişi silindi.");
            top = top.next;   //top 'ı boşa çıkarttım
            sayac--;
        }
    }
    void yazdir(){
        if (isEmpty()){
            System.out.println("Kursta kayıtlı kimse yoktur !! ");
        }
        else {
            KursNode temp = top;
            System.out.println("Kursa kayıtlı kişi listesi");
            System.out.println("TCNo\tAd\tSoyad\tMezun Bolum");
            while (temp != null){
                System.out.println(temp.tc + "\t" + temp.ad + "\t" + temp.soyad + "\t" + temp.mezunBolum);
                temp = temp.next;
            }
        }
    }
    void enSonKayitOlanKisi(){
        if (isEmpty()){
            System.out.println("Kursta kayıtlı kimse yoktur !!");
        }
        else {
            System.out.println("Kursa kayıtlı olan en son kisi \n");
            System.out.println(top.tc + "\t" + top.ad + "\t" + top.soyad + "\t" + top.mezunBolum);
        }
    }
    void kalanKontenjanSayisi(){    //kaç kişiyi daha kaydedebilirim, bunu burdan görebilirim.
        System.out.println("Toplam kayıtlı kişi sayısı: " + sayac);
        System.out.println("Kalan kontenjan sayısı: " + (kontenjan - sayac));
    }
    private boolean isEmpty() {
        return sayac == 0;
    }
    private boolean isFull() {
        return sayac == kontenjan;
    }
}
