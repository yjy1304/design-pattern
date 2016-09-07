package com.wac.designpattern.proxy;

/**
 * Created by 健民 on 2016/4/13.
 */
public class Proxy implements GiveGift{
    GiveGift gg;

    public Proxy(GiveGift gg){
        this.gg = gg;
    }

    public void giveDolls() {
        System.out.println("do before");
        gg.giveDolls();
        System.out.println("do after");
    }

    public void giveFlowers() {

    }

    public void giveChocolate() {

    }
}
