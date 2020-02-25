package com.gupao.vip.designpattern.abstractfactory;

/**
 * @Author: zhaoyj
 * @Description:
 * @Data: Created in 00:16 2020/2/26 0026
 * @Modified By:
 */

public class AbstractTest {
    public static void main(String[] args) {
        AbroadIPayFactory abroadIPayFactory = new ApplePayFactory();
        abroadIPayFactory.creatAbroadPayType().payment();

        HomePayFactory homePayFactory = new AliPayFactory();
        homePayFactory.creatHomePayType().payment();
    }
}
