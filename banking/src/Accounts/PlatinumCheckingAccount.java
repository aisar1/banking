package Accounts;

public class PlatinumCheckingAccount extends checkingAccount{
    public PlatinumCheckingAccount(double balance, double interest, int rewardpoint) {
        super(balance, interest, rewardpoint);
    }

    @Override
    public int calculaterewardpoint(double cost) {
        return (int)cost * 75;
    }
}
