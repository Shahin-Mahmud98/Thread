public class FinalExample {
    public static void main(String[] args) {
        new ThreadExample1("1st");
        new ThreadExample1("2nd");
        new ThreadExample1("3rd");
        try {
            Thread.sleep(1000   );
        } catch (InterruptedException e ) {
            System.out.println("Hello Thread ");
        }
        System.out.println("Hello MultiThread");
    }
}
