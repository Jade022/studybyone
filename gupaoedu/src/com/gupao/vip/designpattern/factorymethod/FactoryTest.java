package com.gupao.vip.designpattern.factorymethod;

/**
 * @Author: zhaoyj
 * @Description:
 * @Data: Created in 19:22 2020/2/25 0025
 * @Modified By:
 */

public class FactoryTest {
    public static void main(String[] args) {
        AbroadIPayFactory abroadFactory = new ApplePayFactory();
        AbroadIPay abroadIPay = abroadFactory.creadPayType();
        abroadIPay.payType();

        HomeFactory homeFactory = new AliPayFactory();
        HomePay homePay = homeFactory.creadPayType();
        homePay.payType();

    }
}
