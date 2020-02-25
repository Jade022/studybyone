package com.gupao.vip.designpattern.abstractfactory;

/**
 * @Author: zhaoyj
 * @Description:
 * @Data: Created in 00:10 2020/2/26 0026
 * @Modified By:
 */

public class ApplePayFactory extends AbroadIPayFactory{
    @Override
    protected IPayType creatAbroadPayType() {
        super.init();
        return new ApplePayType();
    }
}
