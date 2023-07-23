
// import javax.xml.namespace.QName;

public class NewThread implements Runnable{
    String Name;
    Thread thread;
    NewThread(String name){
        this.Name=name;
        thread = new Thread (this, name);
        System.out.println("A new Thread : " + thread + "is Created \n");
        thread.start();

    }
    public void run(){
        try{
            for (int i = 5; i > 0 ; i--) {
                System.out.println(Name + " :" + i);
                Thread.sleep(1000);
            }

        }catch (InterruptedException e){
            System.out.println(Name + "thread Interrupted");
        }
        System.out.println(Name + "thread existing.");
    }
}
