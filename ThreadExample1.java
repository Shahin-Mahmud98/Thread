public class ThreadExample1 implements Runnable{
    String Name ;
    Thread thread;

    ThreadExample1(String name ){
        this.Name = name;
        thread = new Thread(this, name );
        System.out.println("A new Thread :" + thread + "is Created \n");
        thread.start();
    }
    public void run (){
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(Name = " " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println( Name + "Thread Existing");
        }
    }
}
