public class ListeYapisi {
    Node head = null;       //head = ilk düğüm
    Node tail= null;        //tail = son düğüm

    void ekle(int x){

        Node eleman = new Node();  //Eklenecek olan düğüm
        eleman.data=x;
        eleman.next=null;

        if( head == null){   // Liste yapısı oluşturulmuş mu? head == null ise listede eleman yok demektir, ilk liste böyle oluşturulur.

            head=eleman;      //İlk eleman null ise ekleyeceğim düğüm head'tir. Burada head elemanını ekledim.
            tail=eleman;         //Head ve tail burada aynı elemanı tutarlar.
            System.out.println("Liste oluşturuldu ve ilk düğüm eklendi.");
        }
        else{
            tail.next = eleman;    //Son elemanın devamına yeni düğümü ekledim
            tail=eleman;               // tail ( son düğümü) güncelledim.
            System.out.println("Listenin sonuna yeni bir eleman eklendi.");
        }
    }

    void yazdir(){
        if ( head == null){
            System.out.println("Liste yapisi boştur !!");
        }
        else{
            Node temp = head;  //temp geçici düğümü, tüm düğümler üzerinde gezecek, gezinirken de datalarını yazdırıcam.
            System.out.print("bas -->");
            while ( temp != null){
                System.out.print(temp.data + " --> " );
                temp = temp.next;
            }
            System.out.println("son.");

        }
    }
}
