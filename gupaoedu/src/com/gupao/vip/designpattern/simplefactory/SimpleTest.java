package com.gupao.vip.designpattern.simplefactory;

/**
 * @Author: zhaoyj
 * @Description:
 * @Data: Created in 18:15 2020/2/24 0024
 * @Modified By:
 */


public class SimpleTest {
    public static void main(String[] args) {
        IPaytypeFactory iPaytypeFactory = new IPaytypeFactory();
        IPayType payType = iPaytypeFactory.create(ApplePay.class);
        payType.payTye();

        IPayType iPayType = iPaytypeFactory.create(AliPay.class);
        iPayType.payTye();
    }
}
