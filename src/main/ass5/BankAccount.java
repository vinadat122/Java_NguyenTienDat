package main.ass5;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        if (amount <= 0){
            System.out.println("so tien nap phai >0");
            return;
        }
        balance += amount;
    }
    public void withdraw(double amount){
        if (amount > balance){
            System.out.println("so du khong du");
            return;
        }
        balance -= amount;
    }
    public void printBalance(){
        System.out.println("So du:"+balance);
    }
}
