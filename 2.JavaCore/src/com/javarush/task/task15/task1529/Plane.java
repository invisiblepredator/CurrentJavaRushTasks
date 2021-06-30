package com.javarush.task.task15.task1529;

public class Plane implements CanFly {
    int countPas;
    @Override
    public void fly() {

    }
    public Plane(int countPas){
        this.countPas = countPas;
    }
}
