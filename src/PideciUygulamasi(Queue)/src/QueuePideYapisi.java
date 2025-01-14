import java.util.Scanner;

public class QueuePideYapisi {
    Scanner scanner = new Scanner(System.in);

    NodePide front;
    NodePide rear;
    int size;
    int counter;
    String isim;
    int adet;
    int toplamGelir=0;

    public QueuePideYapisi(int size) {
        this.size = size;
        counter = 0;
        front = null;
        rear = null;
    }
    void enQueue(){
        if (isFull()){
            System.out.println("Kuyruk sırası dolu !!");
        }
        else {
            System.out.print("Müşteri ismi: " ); isim = scanner.nextLine();
            System.out.print("Pide sayısı: "); adet = scanner.nextInt();
            scanner.nextLine();

            NodePide eleman = new NodePide(isim,adet);
            if (isEmpty()){
                front = eleman;
                rear = eleman;
                System.out.println("Kuyruk yapısı oluşturuldu, ilk musteri sıraya girdi.");
            }
            else {
                rear.next = eleman;
                rear = eleman;
                System.out.println(rear.isim + " sıraya girdi.");
            }
            counter++;
        }
    }
    void deQueue(){
        if (isEmpty()){
            System.out.println("Pide sırasında bekleyen müşteri yoktur!!");
        }
        else {
            toplamGelir += front.ucret;
            System.out.println(front.isim + " " + front.adet + " adet pidesini aldi, toplam borcu " + front.ucret + " TL ");
            front = front.next;      // boşta bıraktım ve garbage collector temizledi
        }
        counter--;
    }
    void print(){
        if (isEmpty()){
            System.out.println("Bekleyen müşteri yoktur ");
        }
        else {
            NodePide temp = front;
            System.out.print("bas <-");
            while (temp != null){
                System.out.print(temp.isim + " <- ");
                temp = temp.next;
            }
            System.out.print(" son ");
        }
    }
    boolean isEmpty(){
        return counter == 0;
    }
    boolean isFull(){
        return counter == size;
    }
}