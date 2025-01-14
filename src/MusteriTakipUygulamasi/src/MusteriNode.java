public class MusteriNode {

    int id;
    String ad;
    String soyad;
    String tel;
    String adres;
    String urun;

    MusteriNode next;
    MusteriNode prev;

    //Bu sınıftan nesne oluşturabilmek için constructora ihtiyacım var.
    public MusteriNode(int id, String ad, String soyad, String tel, String adres, String urun) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.tel = tel;
        this.adres = adres;
        this.urun = urun;
        next = null;
        prev = null;

    }
}
