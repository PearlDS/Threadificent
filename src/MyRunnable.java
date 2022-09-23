public class MyRunnable implements Runnable{

    private int number;
    private char sign;

    public MyRunnable(int number, char sign) {
        this.number = number;
        this.sign = sign;
    }


    @Override
    public void run() {
        for(int i = number; i >0; i--){
            System.out.println(sign);
        }
    }
}
