package main.ass5;

public class VipAccount extends BankAccount{
    public VipAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0){
            System.out.println("So tien khong hop le");
            return;
        }
        setBalance(getBalance() + amount*1.01);
    }
}
