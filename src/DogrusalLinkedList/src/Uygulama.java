public class Uygulama {
    public static void main(String[] args) {

        ListeYapisi liste = new ListeYapisi();

        liste.ekle(11);   // Bu durumda head 11 i tutuyor, tail 44 ü tutuyor.
        liste.ekle(22);
        liste.ekle(33);
        liste.ekle(44);
        liste.ekle(394);


        System.out.println();

        liste.yazdir();



    }
}
