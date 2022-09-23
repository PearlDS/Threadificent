import java.util.Random;

public class VillainSpot {

    public static void main(String[] args) {

        Random random = new Random();
        TimeBomb timeBomb = new TimeBomb(10);//bomb has 10 seconds!
        timeBomb.activate();

        try {
            Thread.sleep(random.nextInt(30000));//it will take us between 0-30 secs do disarm the bomb
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        timeBomb.disarm();

    }


}
