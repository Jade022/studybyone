package com.gupao.vip.designpattern.factorymethod;

/**
 * @Author: zhaoyj
 * @Description:
 * @Data: Created in 18:03 2020/2/24 0024
 * @Modified By:
 */

public class AbroadUnionPay implements AbroadIPay {
    @Override
    public void payType() {
        System.out.println("这是国外银联支付");

    }

    @Override
    public void payTye() {
        System.out.println("这是国外银联支付");
    }
}
