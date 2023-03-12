public class Main {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();

        Thread T1= new Thread(a);
        Thread T2= new Thread(b);
        T1.start();
        T2.start();

    }
}