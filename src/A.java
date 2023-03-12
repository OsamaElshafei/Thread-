import javax.naming.Name;

public class A {
    Names names = new Names();
  public void work1() throws Exception{
      synchronized(names){
          System.out.println("Enter your name");
          names.wait();
          System.out.println(names.name);
      }
  }
    public void work2() throws Exception{
        synchronized(names){
            names.name=Thread.currentThread().getName();
            names.notify();
        }
    }
}
