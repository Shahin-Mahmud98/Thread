
    public class ThreadExample {
        public static void main(String[] args) {
            new NewThread("1st");
            new NewThread("2nd");
            new NewThread("3rd");
            try{ 
                Thread.sleep(8000);
            }catch (InterruptedException exception){
                System.out.println("Interruption occurs in Main Thread");
            }
            System.out.println("We are exciting from Main Thread");
        }
    }

