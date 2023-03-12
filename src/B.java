import com.sun.source.tree.SynchronizedTree;

public class B implements Runnable{
    sync s = new sync();
    @Override
    public void run() {
        System.out.println("Ahmed");
        s.print(10);
        }
}
