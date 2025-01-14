public class QueueYapisi {
    Node front;            //head
    Node rear;             //tail
    int counter;           //Kuyruğa kaç eleman ekleneceğini tutan bir sayaca ihtiyacım var.
    int size;              //kaç elemanlı olacağını tutacak

    public QueueYapisi(int size) {
        this.size = size;
        counter = 0;
        front = null;
        rear = null;

    }
    void enQueue(int data){
        if (isFull()){
            System.out.println("Kuyruk dolu, ekleme yapılamaz!!");
        }
        else {
            Node eleman = new Node(data);
            if (isEmpty()){
                front = eleman;
                rear = eleman;
                System.out.println(data + " kuyruga ilk eleman olarak eklendi.");
            }
            else {
                rear.next = eleman;
                rear=rear.next;       //rear'ı güncelledim.
                System.out.println(data + " kuyruga eklendi.");
            }
            counter ++;
        }
    }
    void deQueue(){
        if (isEmpty()){
            System.out.println("Kuyruk boş, silinecek eleman yoktur!!");
        }
        else {
            System.out.println(front.data + " silindi.");
            front = front.next;       //baştaki düğümü boşa çıkardım.
            counter--;
        }
    }
    private boolean isEmpty() {
        return counter == 0;
    }
    private boolean isFull() {
        return  counter == size;
    }
    void print(){
        if (isEmpty()){
            System.out.println("Kuyruk boştur, yazdırılacak eleman yoktur!!");
        }
        else {
            Node temp=front;
            System.out.print("bas <-");
            while (temp!=null){
                System.out.print(temp.data + "<-");
                temp = temp.next;
            }
            System.out.println(" son");
        }
    }
}
