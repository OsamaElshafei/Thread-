public class A implements Runnable{
    sync s = new sync();
    @Override
    public void run() {
        System.out.println("Ahmed");
        s.print(10);
    }
}
