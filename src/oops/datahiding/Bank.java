package oops.datahiding;

public class Bank {

    public float getBalance() {
        //Logic of Authentication
        System.out.println("Authentication successful in getter");
        return balance;
    }

    public void setBalance(float balance) {
        //Logic of Authentication
        System.out.println("Authentication successful in Set Method");
        this.balance = balance;
    }

    private float balance;
}
