package oops.datahiding;

public class BankImpl {

    public static void main(String[] args) {
        Bank bank= new Bank();
       float balance= bank.getBalance();
        System.out.println("Balance of the customer is:"+balance);
        bank.setBalance(25.5f);
        System.out.println("Balance of customer after initilization:"+bank.getBalance());
    }
}
