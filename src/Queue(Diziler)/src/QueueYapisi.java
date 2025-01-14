public class QueueYapisi {
    int [] dizi;
    int size;         //kapasite
    int front;        //dizinin baştaki elemanı , 0. indisi
    int rear;         //dizideki son elemanı tutar

    public QueueYapisi(int size) {
        this.size = size;
        dizi = new int[size];          //kuyruk yapım
        front = 0;                     //kuyruktan eleman silersem frontu çıkarırım, ancak front bir önceki elemana kendini güncelleyecek
        rear = -1;                     // kuyruğa ekleme işlemini sondan yaptığımız için her eklemede rear'ı güncelleyeceğim, silme işleminde de rear'ı eksilteceğim
    }
    void enQueue(int data){   //ekleme
        if (isFull()){
            System.out.println("Kuyruk dolu, ekleme yapılamaz!!");
        }
        else {
            rear++;
            dizi[rear] = data;       //sona eklediğim için rearı güncellemeliyim
            System.out.println(dizi[rear] + " kuyruga eklendi.");
        }
    }
    void deQueue(){   //silme
        if (isEmpty()){
            System.out.println("Kuyruk boş, silinecek eleman yoktur!!");
        }
        else {
            int sayi = dizi[front];

            for (int i = 1; i<= rear; i++){    //burada sondaki elemanı silerek bir öne kaydırma işlemi yaptım.
                dizi[i-1] = dizi[i];
            }
            rear--;
            System.out.println(sayi + " kuyruktan çıkartıldı.");
        }
    }
    private boolean isEmpty() {
        return rear == -1;
    }
    private boolean isFull() {
        return rear == size -1;    //size; kullanıcıdan aldığım eleman sayısı, rear da 0'dan başlıyor.
    }
    void elemanSayisi(){
        System.out.println("eleman sayısı: " +(rear+1));   //rear 0'dan başladığı için 1 arttırdım.
    }
    void yazdir(){   //sondan başa doğru yazdırıyorum
        int i = rear;
        System.out.print("son --> ");
        while (i >= 0){   //0'a kadar yani fronta kadar gidecek, rear'dan front'a

            System.out.print(dizi[i] + " -> ");
            i--;
        }
        System.out.println("bas");
    }
}
