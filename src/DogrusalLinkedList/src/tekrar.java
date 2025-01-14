public class tekrar {

    Node head = null;
    Node tail = null;

    void ekle(int x){

        Node eleman = new Node();
        eleman.data = x;
        eleman.next = null;

        if (head == null){
            head = eleman;
            tail = eleman;
            System.out.println("Liste oluşturuldu, ilk eleman eklendi.");
        }
        else {
            tail.next = eleman;
            tail = eleman;
            System.out.println("Listenin sonuna yeni bir eleman eklendi.");
        }
    }
    void yazdir(){
        if (head == null){
            System.out.println("Lİste yapısı boştur");
        }
        else {
            Node temp = head;
            while (temp != null){
                System.out.println(temp.data);
                temp.next = temp;
            }

        }
    }
}
