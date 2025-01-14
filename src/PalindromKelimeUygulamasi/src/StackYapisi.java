public class StackYapisi {

    Node top;
    int size;
    int counter;

    public StackYapisi(int size) {
        this.size = size;
        top = null;
        counter = 0;
    }
    void push(char ch){
        if ( ! isFull()){              //full değilse, yani stackte eklenecek en az 1 karakterlik bir yer varsa,
            Node eleman = new Node(ch);
            if (isEmpty()){
                top = eleman;
            }
            else {
                eleman.next = top;
                top = eleman;
            }
            counter++;
        }
    }
    char pop(){
        if ( ! isEmpty()){   //stack boş değilse,yani doluysa çıkartma yap
            char harf = top.harf;
            top = top.next;
            counter--;
            return harf;
        }
        else {
            return '-';      //geri dönüş değeri eklemek gerektiği için, hatayı kaldırmak için - döndürdüm.
        }
    }
    boolean isEmpty(){
        return counter == 0;

    }
    boolean isFull(){
        return counter == size;
    }
}
