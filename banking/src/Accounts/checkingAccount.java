package Accounts;

public class checkingAccount extends Account {
    protected int rewardpoint;

    public checkingAccount(double balance, double interest, int rewardpoint) {
        super(balance, interest);
        this.rewardpoint = rewardpoint;
    }

    public boolean purchase(double cost){
        if(balance < cost) {
            return false;
        }balance -= cost;
        rewardpoint += calculaterewardpoint(cost);
        return true;
    }

    public int calculaterewardpoint(double cost){
        return (int) (cost * 10);
    }

    public int getRewardpoint() {
        System.out.printf("Your reward point is %s \n",rewardpoint);
        return rewardpoint;
    }
}
