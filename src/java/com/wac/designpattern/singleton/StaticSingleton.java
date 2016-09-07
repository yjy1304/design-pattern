package com.wac.designpattern.singleton;

/**
 * Created by 健民 on 2016/9/8.
 */
public class StaticSingleton {
    public static  String field = "field";
    private StaticSingleton(){
        super();
        System.out.println("StaticSingleton is created!");
    }

    //单例的实例变量由一个内部类持有，**加载该类的时候并不加载其内部类**
    //若instance为一个StaticSingleton的变量，在加载任何变量时都会连带加载instance
    private static class SingletonHolder{
        private static StaticSingleton instance = new StaticSingleton();
    }

    public static StaticSingleton getInstance(){
        return SingletonHolder.instance;
    }

    public static void main(String[] args){
        System.out.println(StaticSingleton.field);
        System.out.println(StaticSingleton.getInstance());
    }
}
