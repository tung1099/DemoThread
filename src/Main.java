public class Main {
    public static void main(String[] args) {
        Runnable printA = new DemoThread("a",10);
        Runnable printB = new DemoThread("b",10);

        Thread thread = new Thread(printA);
        Thread thread1 = new Thread(printB);

        thread.start();
        thread1.start();
    }
}
