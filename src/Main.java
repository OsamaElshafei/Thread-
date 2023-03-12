public class Main {
    public static void main(String[] args) {
        A a=new A();
        Thread T1= new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    a.work1();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread T2= new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    a.work2();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });
        T1.start();
        T2.start();
    }
}