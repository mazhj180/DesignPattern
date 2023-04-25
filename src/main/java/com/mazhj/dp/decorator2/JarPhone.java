package com.mazhj.dp.decorator2;

public class JarPhone extends PhoneDecorator{

    public JarPhone(Cellphone phone) {
        super(phone);
    }

    @Override
    public void receiveCall() {
        super.receiveCall();
        System.out.println("震动");
    }
}
