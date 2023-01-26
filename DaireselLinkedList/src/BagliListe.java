import java.util.Scanner;

public class BagliListe {

    Scanner scanner = new Scanner(System.in);

    Node head = null;
    Node tail = null;

    void basaEkle(){
        int data;
        System.out.println("data: ");
        data = scanner.nextInt();

        Node eleman = new Node(data);

        if (head == null){
            head = eleman;
            tail = eleman;
            tail.next = head;          //*** tailin nexti her zaman headi gösterir.
        }
        else {
            eleman.next = head;
            head = eleman;
            tail.next = head;
        }
    }
    void sonaEkle(){
        int data;
        System.out.println("data: ");
        data = scanner.nextInt();

        Node eleman = new Node(data);

        if (head == null){
            head = eleman;
            tail = eleman;
            tail.next = head;          //*** tailin nexti her zaman headi gösterir.

        }
        else {
            tail.next = eleman;
            tail = eleman;
            tail.next = head;

        }
    }
    void arayaEkle(){
        int data, indis;

        System.out.println("indis: ");
        indis = scanner.nextInt();
        System.out.println("data: ");
        data = scanner.nextInt();


        Node eleman = new Node(data);

        if (head == null){
            head = eleman;
            tail = eleman;
            tail.next = head;          //*** tailin nexti her zaman headi gösterir.

        }
        else if (indis == 0){          // indis 0 a eşitse, basa ekleme
            eleman.next = head;
            head = eleman;
            tail.next = head;
        }
        else{
            int n= 0;
            Node temp = head;
            Node temp2 = head;
            while (temp != tail){         //Dairesel baglı liste oldugu için, düğümün sonunda null yerine tail var, o yüzden döngüyü taile kadar sürdürürüz.
                temp = temp.next;         //temp hep bir sonraki dügüme gecsin yani dügümlerde dolansın.
                n++;
            }
            n++;         //n'i bir daha arttırarak son dügümü de böyle saydırmıs oluyoruz.

            if (indis >= (n)){           //sona ekleme
                tail.next = eleman;
                tail = eleman;
                tail.next = head;
            }
            else {                          //araya ekleme
                temp=head;
                temp2 = temp;
                int i = 0;
                while (i < indis){
                    i++;
                    temp2 = temp;
                    temp = temp.next;
                }
                temp2.next = eleman;
                eleman.next = temp;
            }
        }
    }
    void bastanSil(){
        if (head == null){
            System.out.println("Liste bos !!");
        }
        else if (head == tail){  //listede tek düğüm varsa, bu hem head hem taildir.
            head = null;
            tail = null;
        }
        else {
            head = head.next;
            tail.next = head;
        }
    }
    void sondanSil(){
        if (head == null){
            System.out.println("Liste bos !!");
        }
        else if (head == tail){  //listede tek düğüm varsa, bu hem head hem taildir.
            head = null;
            tail = null;
        }
        else {
            Node temp = head;
            while (temp.next != tail){   //temp = tailden bir önceki düğümü tutar, son düğümün sonrasına geçmesi için temp in next i son düğüm olana kadar dedik
                temp = temp.next;
            }
            tail = temp;
            tail.next = head;

        }
    }
    void aradanSil(){
        if (head == null){
            System.out.println("Liste bos !!");
        }
        else if (head == tail){  //listede tek düğüm varsa, bu hem head hem taildir.
            head = null;
            tail = null;
        }
        else {
            int indis,n=0 ;
            System.out.println("indis: ");
            indis = scanner.nextInt();
            scanner.nextLine();

            Node temp = head;
            Node temp2 = temp;
            while (temp.next != tail){   //temp = tailden bir önceki düğümü tutar, son düğümün sonrasına geçmesi için temp in next i son düğüm olana kadar dedik
                temp = temp.next;
                n++;
            }
            n++;
            temp = head;
            int i =0;
            while (i < indis){
                temp2 = temp;
                temp = temp.next;
                i++;
            }
            temp2.next = temp.next;   //temp2, tempten bir önceki düğümdür, temp silinecek düğüm

        }
    }
    void yazdir(){
        if (head == null){
            System.out.println("Liste bostur !!");
        }
        else {
            Node temp = head;
            System.out.print("bas -->");
            while (temp != tail){
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println(temp.data + " --> son");  // while döngüsünden çıktığında son düğümün datası yazılı olmadığı için temp.datayı bir daha yazdırırız.
        }
    }



}
