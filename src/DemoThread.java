public class DemoThread implements Runnable{
    private String name;
    private int time ;

    public DemoThread(String name, int time) {
        this.name = name;
        this.time = time;
    }

    @Override
    public void run() {
        for (int i = 0; i < time; i++) {

            System.out.println(name + " " + i );
        }
    }
}
