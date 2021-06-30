package com.javarush.task.task15.task1502;

public class Dragon extends Solution.BigAnimal {
    @Override
    public String getSize() {
        return "Дракон большой, " + super.getSize();
    }
}
