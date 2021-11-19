package Accounts;

public class Account {

    protected double balance;
    protected double interest;

    public Account(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.printf("Your balance is %s\n",balance);
    }


    public boolean withdrawal(double amount){
        if(balance < amount) {
            return false;
        }balance -= amount;
        return true;
    }

    public void printStatus(){
        System.out.printf("Your balance is %s. \nYour interest rate is %s\n",balance,interest);
    }
}
