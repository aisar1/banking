package Accounts;

public class GoldCheckingAccount extends checkingAccount{

    public GoldCheckingAccount(double balance, double interest, int rewardpoint) {
        super(balance, interest, rewardpoint);
    }

    @Override
    public int calculaterewardpoint(double cost) {
        return (int) cost * 50;
    }
}
