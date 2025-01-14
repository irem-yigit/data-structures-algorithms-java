import java.util.Scanner;

public class BagliListe {            //Çift yönlü Dairesel Bağlı liste

    Scanner scanner = new Scanner(System.in);

    Node head = null;
    Node tail = null;
    Node temp = null;
    Node temp2 = null;
    int data;
    int indis;

    void  basaEkle(){
        System.out.println("data: "); data = scanner.nextInt();

        Node eleman = new Node(data);

        if (head == null){
            head = eleman;
            tail = eleman;

            head.next = tail;
            tail.prev = head;
            head.prev = tail;
            tail.next = head;
        }
        else{
            eleman.next = head;
            head.prev = eleman;
            head =eleman;
            tail.next = head;
            head.prev = tail;
        }
    }
    void  sonaEkle(){
        System.out.println("data: "); data = scanner.nextInt();

        Node eleman = new Node(data);

        if (head == null){
            head = eleman;
            tail = eleman;

            head.next = tail;
            tail.prev = head;
            head.prev = tail;
            tail.next = head;
        }
        else{
            tail.next = eleman;
            eleman.prev = tail;
            tail = eleman;
            tail.next = head;
            head.prev = tail;
        }
    }
    void  arayaEkle(){
        System.out.println("indis: "); indis = scanner.nextInt();
        System.out.println("data: "); data = scanner.nextInt();

        Node eleman = new Node(data);

        if (head == null){
            head = eleman;
            tail = eleman;

            head.next = tail;
            tail.prev = head;
            head.prev = tail;
            tail.next = head;
        }
        else if ( indis == 0){    //0. indise eklemek başa eklemek anlamına gelir.
            eleman.next = head;
            head.prev = eleman;
            head =eleman;
            tail.next = head;
            head.prev = tail;
        }
        else {
            temp = head;
            temp2 = head;
            int n=0;
            while (temp != tail){
                n++;
                temp = temp.next;
            }
            temp = head;
            int i=0;
            while (i < indis){
                temp2 = temp;
                temp = temp.next;
                i++;
            }    //while dan çıktıktan sonra, temp indisinci değerde olur, yani 5. düğümü ekleyeceksek, temp = 5 i tutar, temp2 = 4 ü tutar.
            if (n < indis){     //Kullanıcıdan aldığım indis, eleman sayısından büyükse , sona ekleme işlemi yapılır.
                tail.next = eleman;
                eleman.prev = tail;
                tail = eleman;
                tail.next = head;
                head.prev = tail;
            }
            else {      // araya ekleme
                temp2.next = eleman;
                eleman.prev = temp2;
                eleman.next = temp;
                temp.prev = eleman;

            }
        }
    }

    void yazdir(){
        if (head == null){
            System.out.println("Liste boştur !! ");
        }
        else {
            temp = head;
            System.out.print("bas -> ");
            while (temp != tail){
                System.out.print(temp.data + " -->");
                temp = temp.next;
            }
            System.out.print(temp.data + " -> son");
        }
    }
    void terstenYazdir(){
        if (head == null){
            System.out.println("Liste boştur !! ");
        }
        else {
            temp = tail;
            System.out.print("son -> ");
            while (temp != head){
                System.out.print(temp.data + " -->");
                temp = temp.prev;
            }
            System.out.println(temp.data + " -> bas");
        }
    }
    void bastanSil(){
        if (head == null){
            System.out.println("Liste boştur !! ");
        }
        else if (head == tail){    //listede tek eleman varsa;
            head= null;
            tail = null;
        }
        else {
            head = head.next;
            head.prev = tail;
            tail.next = head;
        }
    }
    void sondanSil(){
        if (head == null){
            System.out.println("Liste boştur !! ");
        }
        else if (head == tail){    //listede tek eleman varsa;
            head= null;
            tail = null;
        }
        else {
            temp = head;
            while (temp.next != tail){
                temp = temp.next;
            }
            tail = temp;
            tail.next = head;
            head.prev = tail;
        }
    }
    void aradanSil(){
        if (head == null){
            System.out.println("Liste boştur !! ");
        }
        else {
            System.out.println("İndis: "); indis = scanner.nextInt();

            if (indis == 0 && head == tail){       // listede 1 tane eleman var ve silmek istiyorum
                head = null;
                tail = null;
            }
            else if (indis == 0 && head != tail){    //listede birden çok eleman var fakat ben 0. indisi silmek istiyorsam baştansil yaparım
                head = head.next;
                head.prev = tail;
                tail.next = head;
            }
            else {
                int n = 0;
                temp = head;
                while (temp != tail){
                    n++;
                    temp = temp.next;
                }
                if (indis >= n ) {  //kullanıcıdan aldığım indis n ' e eşitse kullanıcı son düğümü silmek istiyor demektir.
                    tail = temp;
                    tail.next = head;
                    head.prev = tail;
                }
                else {  //aradan silme işlemi
                    temp = head;
                    temp2 = temp;
                    int i = 0;
                    while (i < indis ){    //i = eleman sayısı, kullanıcıdan aldığımız indisten küçük olduğu sürece
                        i++;
                        temp2 = temp;
                        temp = temp.next;
                    }
                    temp2.next = temp.next;
                    temp.next.prev = temp2;
                }
            }
        }
    }

}
