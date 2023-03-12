public class sync {
    public void print(int count) {
        Object O1 = new Object();
        synchronized (O1) {
            for (int i = 0; i < 10; i++) {
                System.out.println(count * i);
            }
        }
    }
}
