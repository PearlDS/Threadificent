public class BankAccount {

    private int amountOfEuros;



    public synchronized void addMoney(){

        amountOfEuros++;

    }

    public synchronized void removeMoney(){
        amountOfEuros--;
    }

    public int getAmountOfEuros() {
        return amountOfEuros;
    }
}
