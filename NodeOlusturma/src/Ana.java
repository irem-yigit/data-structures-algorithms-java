public class Ana {
    public static void main(String[] args) {
        //Sinif obj1;   null --> bellekte herhangi bir yer kaplamıyor.

        Sinif A = new Sinif();   //Bellekte; obj1, burada node(düğüm) oluşturdum. obj1 = nesne = node(düğüm)

        Sinif B = new Sinif();    // obj2, 2. düğümümü oluşturdum, bellekte 2. bir yer tahsis edildi.
        Sinif C = new Sinif();

        A.sayi = 10;  //Düğümlere değerlerini atadım.
        B.sayi = 20;
        C.sayi = 30;


        A.next = B;  //Düğümleri birbirine bağladım. A düğümü B düğümünü gösteriyor.
        B.next = C;
        C.next = null;

        Sinif temp = A;    // temp = temporary:geçici , temp adında geçici değişken oluşturdum.

        while (temp != null){   // travers işlemi yaptık, yani düğümlerin üzerinde dolaştık.
            System.out.println(temp.sayi);
            temp = temp.next;
        }





    }
}
