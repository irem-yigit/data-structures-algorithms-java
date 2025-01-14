public class QueueYapisi {
    Node front;
    Node rear;
    int counter;
    int size;

    public QueueYapisi(int size) {
        this.size = size;
        counter = 0;
        front = null;
        rear = null;
    }
    void enQueue(char ch){
        if ( ! isFull()){

            Node eleman = new Node(ch);

            if (isEmpty()){
                front = eleman;
                rear = eleman;
            }
            else{
                rear.next = eleman;
                rear = eleman;
            }
            counter++;
        }
    }
    char deQueue(){
        if ( ! isEmpty()){
            char ch = front.harf;
            front = front.next;
            counter--;
            return ch;
        }
        else {
            return '+';
        }
    }
    boolean isEmpty(){
        return counter == 0;
    }
    boolean isFull(){
        return counter == size;
    }
}
