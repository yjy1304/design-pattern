package com.wac.designpattern.main;

import com.wac.designpattern.proxy.GiveGift;
import com.wac.designpattern.proxy.Proxy;
import com.wac.designpattern.proxy.Pursuit;
import com.wac.designpattern.singleton.StaticSingleton;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 健民 on 2016/4/13.
 */
public class MainClass {
    public static void main(String[] args){
        System.out.println(StaticSingleton.field);
        System.out.println(StaticSingleton.getInstance());
    }
}
