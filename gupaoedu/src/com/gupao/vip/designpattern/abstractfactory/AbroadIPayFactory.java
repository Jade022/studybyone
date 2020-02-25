package com.gupao.vip.designpattern.abstractfactory;

/**
 * @Author: zhaoyj
 * @Description:
 * @Data: Created in 23:57 2020/2/25 0025
 * @Modified By:
 */

public abstract class AbroadIPayFactory {
    public void init() {
        System.out.println("进入国外支付界面。。。");
    }

    protected abstract IPayType creatAbroadPayType();

}
