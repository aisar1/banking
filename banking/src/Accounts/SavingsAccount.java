package Accounts;

public class SavingsAccount extends Account{
    private double fee;

    public SavingsAccount(double balance, double interest, double fee) {
        super(balance, interest);
        this.fee = fee;
    }

    @Override
    public boolean withdrawal(double amount) {
        amount += fee;
        return super.withdrawal(amount);
    }

}
