import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService es = (ExecutorService) Executors.newFixedThreadPool(2);
        A a = new A();
        Thread T1 = new Thread(a);
        Thread T2 = new Thread(a);
        Thread T3 = new Thread(a);
        Thread T4 = new Thread(a);

        ArrayList<Thread> List = new ArrayList<>();
        List.add(T1);
        List.add(T2);
        List.add(T3);
        List.add(T4);
        for (Thread T:List){
            es.submit(T);
        }

    }
}