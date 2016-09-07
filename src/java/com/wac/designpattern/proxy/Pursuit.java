package com.wac.designpattern.proxy;

/**
 * Created by 健民 on 2016/4/13.
 */
public class Pursuit implements GiveGift{
    public void giveDolls() {
        System.out.println("give dolls ..");
    }

    public void giveFlowers() {
        System.out.println("give flowers ..");
    }

    public void giveChocolate() {
        System.out.println("give chocolate ..");
    }
}
