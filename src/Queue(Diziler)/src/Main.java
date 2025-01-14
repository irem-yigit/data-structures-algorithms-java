public class Main {
    public static void main(String[] args) {

        QueueYapisi kuyruk = new QueueYapisi(5);

        kuyruk.enQueue(10);
        kuyruk.enQueue(20);
        kuyruk.enQueue(30);

        kuyruk.elemanSayisi();

        kuyruk.yazdir();

        System.out.println("kuyruğun başındaki eleman: " + kuyruk.dizi[kuyruk.front]);
        System.out.println("kuyruğun sonundaki eleman: " + kuyruk.dizi[kuyruk.rear]);





    }
}
