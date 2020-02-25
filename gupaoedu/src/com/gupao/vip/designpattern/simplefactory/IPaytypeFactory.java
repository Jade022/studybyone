package com.gupao.vip.designpattern.simplefactory;

/**
 * @Author: zhaoyj
 * @Description:
 * @Data: Created in 18:26 2020/2/24 0024
 * @Modified By:
 */

public class IPaytypeFactory {
    public IPayType create(Class<? extends IPayType> clazz) {
        try {
            IPayType payType = clazz.newInstance();
            return payType;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
