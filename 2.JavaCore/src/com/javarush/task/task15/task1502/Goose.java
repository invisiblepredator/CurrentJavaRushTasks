package com.javarush.task.task15.task1502;

public class Goose extends Solution.SmallAnimal {
    @Override
    public String getSize() {
        return "Гусь маленький, " + super.getSize();
    }
}
