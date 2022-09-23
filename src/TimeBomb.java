public class TimeBomb implements Runnable{

    private int seconds;
    private Thread thread;

    public TimeBomb(int seconds) {
        this.seconds = seconds;
        thread = new Thread(this);
    }

    public void activate(){
        thread.setDaemon(true);
        thread.start();
    }

    public void disarm(){
        thread.interrupt();


    }

    @Override
    public void run() {
        for (int i = seconds; i>=0; i--){
            System.out.println(i + " seconds left.");
            if (i==0){
                System.out.println("BOOOOM!");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Bomb disarmed we're saved");
            }
        }

    }
}
