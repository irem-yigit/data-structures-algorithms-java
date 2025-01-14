public class Stack {

    int dizi[];    //stack
    int size;     //dizinin boyutu
    int indis;    //dizinin indisi

    public Stack(int size) {
        this.size = size;
        dizi = new int[size];
        indis = -1;          //-1 diziye eleman eklediğim zaman artacak, çıkarttığım zaman eksilecek
    }

    void push(int data){      // push, diziye ekleme işlemi yapar
        if (isFull()){
            System.out.println("Stack dolu! ");
        }
        else {
            indis++;
            dizi[indis] =data;
            System.out.println("Eklenen () :" + dizi[indis]);
        }
    }

    int pop(){      //popta bir geri dönüş değeri var, eleman çıkartıyorum bu yüzden
        if ( ! isEmpty()){
            return dizi[indis--];   // indisi eksiltmem dizideki değerin eksilmesi anlamına gelir.
        }
        else {
            System.out.println("Dizi boştur.");
            return -1;
        }
    }

    boolean isFull(){           //dizi boş mu dolu mu onu kontrol ediyorum
        return (indis == size - 1);   //indis 0'dan başladığı için size - 1 yazdım.
    }
    boolean isEmpty(){
        return (indis == - 1);      //dizi boş

        // kodu tek satırda yazmak için return' ü kullandım
        /*if (indis == -1){
            return true;
        }
        else {
            return false;
        }*/
    }



}
