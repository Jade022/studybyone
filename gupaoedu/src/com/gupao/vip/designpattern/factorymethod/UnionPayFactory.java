package com.gupao.vip.designpattern.factorymethod;

/**
 * @Author: zhaoyj
 * @Description:
 * @Data: Created in 18:26 2020/2/24 0024
 * @Modified By:
 */

public class UnionPayFactory implements HomeFactory{

    @Override
    public HomePay creadPayType() {
        return new UnionPay();
    }
}
