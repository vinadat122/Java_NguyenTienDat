package main.ass5;

public class SavingAccount extends BankAccount{
    public SavingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {

        if (amount > getBalance()){
            System.out.println("ko du tien rut");
            return;
        }
        double balance = getBalance() - amount*1.02;
        setBalance(balance);
    }
}
