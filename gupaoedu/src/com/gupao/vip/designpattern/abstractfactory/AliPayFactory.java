package com.gupao.vip.designpattern.abstractfactory;

/**
 * @Author: zhaoyj
 * @Description:
 * @Data: Created in 00:10 2020/2/26 0026
 * @Modified By:
 */

public class AliPayFactory extends HomePayFactory {

    @Override
    protected IPayType creatHomePayType() {
        super.init();
        return new AliPayType();
    }
}
