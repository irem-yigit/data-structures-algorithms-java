public class OgrNode {

    int numara;
    String ad;
    String soyad;
    int vizenotu;
    int finalnotu;
    double ortalama;
    String durum;

    OgrNode next;

    public OgrNode(int numara, String ad, String soyad, int vizenotu, int finalnotu) {
        this.numara = numara;
        this.ad = ad;
        this.soyad = soyad;
        this.vizenotu = vizenotu;
        this.finalnotu = finalnotu;

        ortalama = vizenotu * 0.4 + finalnotu * 0.6;

        if (ortalama >= 50){
            durum = "Geçti..";
        }
        else {
            durum = "Kaldi..";
        }
        next = null;

    }
}
