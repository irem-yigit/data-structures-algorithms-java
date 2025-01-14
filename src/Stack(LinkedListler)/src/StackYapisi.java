public class StackYapisi {
    int size;           // stackin kapasitesini tutan değişken
    int counter;        // counter = sayaç; stacke ekleme yaptıkça artacak, silme yaptıkça eksilecek
    Node top;           //top ; en üst düğümü tutan göstericidir. (head gibi düşünebilirim)

    public StackYapisi(int size) {
        this.size = size;
        counter = 0;
        top = null;
    }

    void push(int data){    //ekleme
        Node eleman = new Node(data);
        if (isFull()){      //true gelirse , yani stack dolu derse,
            System.out.println("Stack dolu, ekleme yapılamadı !!");
        }
        else {
            if (isEmpty()){   //true gelirse, yani stack boşsa,
                top = eleman;
                System.out.println(top.data + " stack'e ilk eleman olarak eklendi.");
            }
            else {   //stackte daha önceden eleman varsa,
                eleman.next = top;
                top = eleman;
                System.out.println(top.data + " stack'e eklendi.");
            }
            counter++;
        }
    }
    void pop(){    //çıkartma

        if (isEmpty()){
            System.out.println("Stack boş, çıkartacak bir şey yok !!");
        }
        else {
            System.out.println(top.data + " çıkartıldı...");
            top = top.next;    //en üstteki elemanı boşa çıkartmış oldum.
            counter--;
        }
    }
    void print(){
        if (isEmpty()){
            System.out.println("Stack boş, yazdırılacak bir şey yok...");
        }
        else {
            Node temp = top;
            System.out.println("Stack'teki veriler \n");
            while (temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
            System.out.println("\n");
        }
    }
    void topGoster(){     //En üstteki düğümü gösteren fonksiyon
        if (isEmpty()){
            System.out.println("Stack boş !!");
        }
        else {
            System.out.println("En üstteki düğümün datası: " + top.data);
        }
    }
    boolean isFull(){   //stack dolu mu?

        return counter == size;      // kapasite 10 ise, counter 10 a gelince dolar gibi düşün
    }

    boolean isEmpty(){   //stack boş mu?
        return counter == 0;

    }
}
