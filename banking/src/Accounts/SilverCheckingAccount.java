package Accounts;

public class SilverCheckingAccount extends checkingAccount{

    public SilverCheckingAccount(double balance, double interest, int rewardpoint) {
        super(balance, interest, rewardpoint);
    }

    @Override
    public int calculaterewardpoint(double cost) {
        return (int) (cost * 25);
    }
}
