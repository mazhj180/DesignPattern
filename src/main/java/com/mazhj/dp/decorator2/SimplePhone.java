package com.mazhj.dp.decorator2;

public class SimplePhone extends Cellphone{
    @Override
    public void receiveCall() {
        System.out.println("发出声音");
    }
}
