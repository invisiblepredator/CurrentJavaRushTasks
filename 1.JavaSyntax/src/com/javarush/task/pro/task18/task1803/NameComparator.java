package com.javarush.task.pro.task18.task1803;

import java.util.Comparator;

/* 
Наставники JavaRush
*/

public class NameComparator implements Comparator<JavaRushMentor> {
    @Override
    public int compare(JavaRushMentor o1, JavaRushMentor o2) {
        int value = o1.getName().length() < o2.getName().length() ? -1 : o1.getName().length() == o2.getName().length() ? 0 : 1;
        return value;
    }
    //напишите тут ваш код
}
