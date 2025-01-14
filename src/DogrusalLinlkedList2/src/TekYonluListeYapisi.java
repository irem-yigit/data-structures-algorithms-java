public class TekYonluListeYapisi {

    Node head = null;
    Node tail = null;

    void basaEkle( int x){

        Node eleman = new Node();
        eleman.data=x;

        if (head == null){
            eleman.next = null;  // listede 1 düğüm varsa, onun göstericisi null'dur.
            head = eleman;
            tail = eleman;
            System.out.println("Liste yapisi oluşturuldu, ilk eleman eklendi.");
        }
        else{
            eleman.next = head;  // head'in önüne elemanı ekledim.
            head = eleman;
            System.out.println("Başa eleman eklendi.");
        }
    }
    void sonaEkle( int x){

        Node eleman = new Node();
        eleman.data=x;

        if (head == null){
            eleman.next = null;  // listede 1 düğüm varsa, onun göstericisi null'dur.
            head = eleman;
            tail = eleman;
            System.out.println("Liste yapisi oluşturuldu, ilk eleman eklendi.");
        }
        else{
            eleman.next = null;      // Eklenen elemanın devamı null u gösterir. (Bunu unutmamalıyım!   )
            tail.next = eleman;     // Son düğüme eleman ekledim.
            tail=eleman;            // son düğüm tailin ismini güncelledim.
            System.out.println("Sona eleman eklendi.");
        }
    }

    void arayaEkle( int indis, int x){

        Node eleman = new Node();
        eleman.data=x;

        if (head == null && indis == 0 ){
            eleman.next = null;  // listede 1 düğüm varsa, onun göstericisi null'dur.
            head = eleman;
            tail = eleman;
            System.out.println("Liste yapisi oluşturuldu, ilk eleman eklendi.");
        }
        else if (head != null && indis == 0 ){
            eleman.next = head;
            head = eleman;
            System.out.println(indis + "indisinci siraya yeni eleman eklendi.");
        }
        else{
            int n = 0;
            Node temp = head;
            Node temp2 = head;

            while ( temp.next != null){
                n++;                       //listede kaç eleman olduğunu bu şekilde bulabilirim.
                temp2 = temp;
                temp = temp.next;
            }
            if (n == indis){
                temp2.next=eleman;
                eleman.next=temp;  //aslında temp burada tail(son düğüm) oluyor. temp2 de ondan bir önceki düğüm
                System.out.println("Eleman eklendi.");
            }
            else {
                temp = head;
                temp2 = head;
                int i = 0;
                while (i != indis){
                    temp2 = temp;
                    temp = temp.next;
                    i++;
                }
                temp2.next = eleman;
                eleman.next=temp;
                System.out.println(indis + ".siraya yeni eleman eklendi.");
            }
        }
    }

    void bastanSil(){
        if (head == null){
            System.out.println("Liste boştur, silinecek nesne yok.");
        }
        else if (head.next == null){    //head'in next i null ise , listede tek eleman head var demektir. head = null diyerek silebiliriz.
            head = null;
            tail=null;
            System.out.println("Listede kalan son eleman da silindi.");
        }
        else {
            head = head.next;   //Burda head bir sonraki düğüme geçiyor,bu şekilde bir önceki düğüm boşta kalıyor, garbage collection denen yapı boşta kalan düğümleri temizliyor.
            System.out.println("Baştaki eleman silindi.");
        }
    }
    void sondanSil(){
        if (head == null){
            System.out.println("Liste boştur, silinecek nesne yok.");
        }
        else if (head.next == null){    //head'in next i null ise , listede tek eleman head var demektir. head = null diyerek silebiliriz.
            head = null;
            tail=null;
            System.out.println("Listede kalan son eleman da silindi.");
        }
        else {
            Node temp = head;
            Node temp2 = head;
            while (temp.next != null){
                temp2 = temp;
                temp = temp.next;
            }
            temp2.next=null;
            tail = temp2;
            System.out.println("Sondan eleman silindi.");
        }
    }

    void aradanSil(int indis){
        if (head == null){
            System.out.println("Liste bos, silinecek bir sey yok.");
        }
        else if (head.next == null && indis == 0){
            head=null;
            tail=null;
            System.out.println("Listede kalan son eleman da silindi.");
        }
        else if (head.next != null && indis == 0){   //Listede birden çok eleman var ama biz head'i 0. indexi silmek istiyoruz.
            head=head.next;
            System.out.println("Baştaki eleman silindi.");
        }
        else {
            int i = 0;
            Node temp = head;
            Node temp2 = head;
            while (temp != null){
                i++;
                temp2=temp;
                temp=temp.next;
            }
            if (i == indis){
                temp2.next = null;
                tail=temp2;
                System.out.println("Listedeki son siradaki eleman silindi.");

            }
            else {
                temp = head;
                temp2 = head;
                int j = 0;
                while (j != indis){
                    temp2 = temp;
                    temp= temp.next;
                    j++;
                }
                temp2.next=temp.next;  // temp in bağlantısını kopardık ve garbage collention ile bellekten silinecek.
                System.out.println("Aradaki nesne silindi.");
            }
        }
    }

    void yazdir(){

        if (head == null){
            System.out.println("liste yapisi bos !! ");
        }
        else{
            Node temp = head;

            System.out.print    ("bas -> ");

            while (temp != null){
                System.out.print(temp.data + " --> ");
                temp = temp.next;   //temp her döngüde bir sonraki düğüme geçiyor.

            }
            System.out.println("son. ");
        }
    }

}

