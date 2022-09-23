public class ThreadsGalore {
    public static void main(String[] args) {


       // MyRunnable myRunnable1 = new MyRunnable(100, '+');

        Thread camera = new Thread(()->aMethod(100, "Take picture"));
        Thread printer = new Thread(()->aMethod(100, "Print picture"));
        camera.setDaemon(true);
        camera.setName("T");
        printer.setName("T1");
        System.out.println(camera.getName() +" is "+ camera.getState());
        System.out.println(printer.getName() +" is "+ printer.getState());
        try {
        camera.start();
        camera.join(2000);
        printer.start();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }



    }

    public static void aMethod(int number, String sign){
        for(int i = number; i >0; i--){
            System.out.println(i+": "+sign);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
