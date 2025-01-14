public class NodePide {
    int adet;
    String isim;
    int ucret;
    NodePide next;

    public NodePide(String isim,int adet) {
        this.isim = isim;
        this.adet = adet;
        ucret = adet * 4;
        next = null;
    }
}
