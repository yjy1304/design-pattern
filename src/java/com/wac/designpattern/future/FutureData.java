package com.wac.designpattern.future;

/**
 * Created by 健民 on 2016/9/8.
 */
public class FutureData implements Data{
    private Data realData;
    private boolean isReady = false;


    public synchronized void setRealData(Data realData){
        this.realData = realData;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<10; i++){
            sb.append(realData.getResult()).append(":").append(i).append(";");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.realData = new RealData(sb.toString());
        isReady = true;
        notifyAll();
    }

    // 获取最终结果
    // 若尚未setRealData()就执行该方法则此时isReady==false，直接wait()
    // 若已经执行setRealData()则该实例锁被占用而无法进入该方法，等待setRealData()完成则isReady置为true，此方法可立即返回
    public synchronized String getResult(){
        //
        while(!isReady){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return realData.getResult();
    }
}
