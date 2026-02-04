package main.ass5;

public class CheckingAccount extends BankAccount{
    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > getBalance() + 5000000){
            System.out.println("vuot qua so tien co the rut");
            return;
        }
        double balance = getBalance() - amount;
        setBalance(balance);
    }
}
