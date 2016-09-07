package com.wac.designpattern.future;

/**
 * Created by 健民 on 2016/9/8.
 */
public class RealData implements Data{
    private String realData;
    public RealData(String realData){
        this.realData = realData;
    }
    public String getResult() {
        return realData;
    }
}
