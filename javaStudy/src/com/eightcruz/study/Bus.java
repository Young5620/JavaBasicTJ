package com.eightcruz.study;

public class Bus extends Car {
    int fee;
    public Bus(String name, int number, int fee) {
        // super를 이용해 Car 클래스의 생성자를 이용하세요.
        super(name, number);
        this.fee = fee;
    }
}
