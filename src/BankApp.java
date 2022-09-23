public class BankApp {

    public static void main(String[] args) throws InterruptedException {

        BankAccount bankAccount = new BankAccount();
        Thread getMoney1 = new Thread(()->addMoney(bankAccount, 10000));
        Thread getMoney2 = new Thread(()->addMoney(bankAccount, 10000));
        getMoney1.start();
        getMoney2.start();

        getMoney1.join();
        getMoney2.join();

        System.out.println(bankAccount.getAmountOfEuros());


    }

    public static void addMoney(BankAccount bankAccount, int money){
        for(int i = 0; i<money; i++){
            bankAccount.addMoney();
        }
    }

    public static void removeMoney(BankAccount bankAccount, int money){
        for(int i = 0; i<money; i++){
            bankAccount.addMoney();
        }
    }



}
