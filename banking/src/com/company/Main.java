package com.company;

import Accounts.*;

public class Main {

    public static void main(String[] args) {
        SilverCheckingAccount silvercheckingaccount = new SilverCheckingAccount (10,30,14);
        GoldCheckingAccount goldcheckingaccount = new GoldCheckingAccount (10,30,14);
        PlatinumCheckingAccount platinumcheckingaccount = new PlatinumCheckingAccount (10,30,14);
        if(silvercheckingaccount.purchase(10)){
            System.out.println("Silver account. Purchase successfull");
            silvercheckingaccount.printStatus();
            silvercheckingaccount.getRewardpoint();
        }else{
            System.out.println("Silver account. Purchase fail, insufficient balance");
        }
        if(goldcheckingaccount.purchase(11)){
            System.out.println("Gold account. Purchase successfull");
            goldcheckingaccount.printStatus();
            goldcheckingaccount.getRewardpoint();
        }else{
            System.out.println("Gold account. Purchase fail, insufficient balance");
        }
        if(platinumcheckingaccount.purchase(10)){
            System.out.println("Platinum account. Purchase successfull");
            platinumcheckingaccount.printStatus();
            platinumcheckingaccount.getRewardpoint();
        }else{
            System.out.println("Platinum account. Purchase fail, insufficient balance");
        }

    }
}
