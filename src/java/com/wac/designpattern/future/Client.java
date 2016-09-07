package com.wac.designpattern.future;

/**
 * Created by 健民 on 2016/9/8.
 */
public class Client {
    FutureData request(String request){
        FutureData futureData = new FutureData();
        new Thread(()->{
            RealData realData = new RealData(request);
            futureData.setRealData(realData);
        }).start();
        return futureData;
    }

    public static void main(String[] args){
        Client client = new Client();
        FutureData futureData = client.request("req");
        System.out.println("数据获取完成：" + futureData.getResult());
    }
}
