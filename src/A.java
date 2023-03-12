public class A implements Runnable{
    int count = 4;
    @Override
    public void run() {
        for (int i = 2; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + count * i);
        try {
                Thread.sleep(2500);

            }catch (Exception e){

        }

        }

    }
}
