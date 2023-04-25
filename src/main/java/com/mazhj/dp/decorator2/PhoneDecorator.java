package com.mazhj.dp.decorator2;

public abstract class PhoneDecorator extends Cellphone{
    private Cellphone phone;

    public PhoneDecorator(Cellphone phone) {
        this.phone = phone;
    }

    @Override
    public void receiveCall() {
        this.phone.receiveCall();
    }
}
