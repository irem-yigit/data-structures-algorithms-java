import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StackYapisi stack = new StackYapisi(100);
        QueueYapisi queue = new QueueYapisi(100);
        String kelime;
        System.out.println("Kelime girin: "); kelime = scanner.nextLine();
        int n = kelime.length();

        char[] harfler = kelime.toCharArray();
        int i = 0;
        while (i < n){
            stack.push(harfler[i]);
            queue.enQueue(harfler[i]);
            i++;
        }
        boolean sonuc =true;

        while ( ! stack.isEmpty()){
            if (stack.pop() != queue.deQueue()){
                sonuc = false;
                break;
            }
        }
        if (sonuc){
            System.out.println(kelime + " palindromdur.");
        }
        else {
            System.out.println(kelime + " palindrom degildir.");
        }
    }
}
