public class CiftYonluListeYapisi {           // Çift Yönlü Doğrusal Bağlı Liste Yapisi
    Node head = null;
    Node tail = null;

    void basaEkle(int data){

        Node eleman = new Node(data);

        if (head == null){
            head = eleman;
            tail = eleman;
        }
        else{
            eleman.next = head;
            head.prev = eleman;
            head = eleman;
        }
    }
    void soneEkle(int data){

        Node eleman = new Node(data);

        if (head == null){
            head = eleman;
            tail = eleman;
        }
        else {
            tail.next = eleman;
            eleman.prev = tail;
            tail = eleman;
        }
    }
    void arayaEkle(int indis, int data){

        Node eleman = new Node(data);

        if (head == null){
            head = eleman;
            tail = eleman;
        }
        else if(head != null && indis == 0) {

            eleman.next = head;
            head.prev = eleman;
            head= eleman;
        }
        else {           //Kullanıcı taile eklemek isteyebilir, ya da tailden sonrasına eklemek isteyebilir
            int n=0;           //Önce eleman sayısını buluruz
            Node temp = head;
            while (temp != null){
                temp = temp.next;
                n++;
            }
            temp=head;

            if (indis > n){   // tailin önüne ekleyeceğim,yani kullanıcıdan aldığım indis eleman sayısından büyükse o zaman taili güncelleriz.
                tail.next = eleman;
                eleman.prev = tail;
                tail = eleman;
            }
            else {          //burada araya ekleme yaparız
                int i=0;
                while (i != indis){
                    temp = temp.next;    // burada temp eklenecek düğümün üzerinde anlamına gelir
                    i++;
                }
                //*** araya ekleme işlemi ***
                eleman.prev = temp.prev;
                temp.prev.next = eleman;

                temp.prev = eleman;
                eleman.next = temp;
            }
        }
    }
    void bastanSil(){
        if (head != null){   // liste boş olmadığı sürece,
            if (head.next == null){  // headin nexti nullsa listede 1 düğüm vardır.
                head = null;
                tail = null;
            }
            else {               //listede birden çok düğüm varsa,
                head = head.next;
                head.prev = null;
            }
        }
    }
    void sondanSil(){
        if (head != null){   // liste boş olmadığı sürece,
            if (head.next == null){  // headin nexti nullsa listede 1 düğüm vardır.
                head = null;
                tail = null;
            }
            else {               //listede birden çok düğüm varsa,
                tail = tail.prev;
                tail.next = null;
            }
        }
    }
    void aradanSil(int indis){
        if (head != null){   // liste boş olmadığı sürece,
            if (head.next == null && indis <= 0 ){  // headin nexti nullsa listede 1 düğüm vardır.
                head = null;
                tail = null;
            }
            else if (head.next != null && indis <= 0 ){  // Listede birden fazla düğüm var ve headi silmek istiyorsa, bastanSil fonksiyonu kullanılır.
                head = head.next;
                head.prev = null;
            }
            else {               //listede birden çok düğüm varsa,
                int n = 0;
                Node temp = head;
                while ( temp != null ){
                    n++;
                    temp = temp.next;

                }
                if (indis >= (n-1)){   // son düğüm taili silmek istiyorsak, bu sebeple sondanSil fonksiyonu kodlarını kullandık.
                    tail = tail.prev;
                    tail.next = null;
                }
                else {                  //aradan silmek istiyorsak
                    temp = head;
                    int i =0;               // i = eleman sayısı
                    while (i < indis){    // kullanıcıdan aldığım indise kadar i yi saydırıcam
                        i++;
                        temp = temp.next;
                    }          //whiledan çıkdığı zaman temp, silinmek istenen düğümün üzerinde demektir. tempi silicez anlamına gelir.

                    temp.next.prev = temp.prev;
                    temp.prev.next = temp.next;
                }
            }
        }
    }
    void yazdir(){

        Node temp=head;
        System.out.print("bas ->");
        while (temp!=null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;

        }
        System.out.print("son");
    }
    void sondanYazdir(){               //sondan başa doğru yazdırabilmek için bu fonksiyonu kullandım.

        Node temp=tail;
        System.out.print("son ->");
        while (temp!=null){
            System.out.print(temp.data + " --> ");
            temp = temp.prev;

        }
        System.out.println("bas1");
    }
}
