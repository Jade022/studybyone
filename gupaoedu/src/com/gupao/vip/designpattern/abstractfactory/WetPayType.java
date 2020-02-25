package com.gupao.vip.designpattern.abstractfactory;

/**
 * @Author: zhaoyj
 * @Description:
 * @Data: Created in 00:04 2020/2/26 0026
 * @Modified By:
 */

public class WetPayType implements IPayType{
    @Override
    public void payment() {
        System.out.println("这里是WetPay支付");
    }
}
