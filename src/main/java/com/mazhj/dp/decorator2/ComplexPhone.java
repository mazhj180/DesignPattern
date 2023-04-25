package com.mazhj.dp.decorator2;

public class ComplexPhone extends PhoneDecorator{
    public ComplexPhone(Cellphone phone) {
        super(phone);
    }

    @Override
    public void receiveCall() {
        super.receiveCall();
        System.out.println("灯光闪烁");
    }
}
