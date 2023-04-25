package com.mazhj.dp.decorator2;

public class TestMain {
    public static void main(String[] args) {
        Cellphone phone = new SimplePhone();
        System.out.println("==============simple==============");
        phone.receiveCall();
        System.out.println("==============jar==============");
        phone = new JarPhone(phone);
        phone.receiveCall();
        System.out.println("==============complex==============");
        phone = new ComplexPhone(phone);
        phone.receiveCall();
    }
}
