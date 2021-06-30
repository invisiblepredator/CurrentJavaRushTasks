package com.javarush.task.task14.task1406;

/* 
Без ошибок
*/

import com.javarush.task.task14.task1406.Solution.Mouse;

public class Solution {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        GrayMouse grayMouse = new GrayMouse();
        grayMouse.mouseMet();
        Jerry jerry = new Jerry();

        Mouse m1 = new Jerry();
        m1.mouseMet();





//        Object obj = new Jerry();
//
//                Mouse mouse = (Mouse) obj;
//        GrayMouse grayMouse = (GrayMouse) mouse;
//        Jerry jerry = (Jerry) grayMouse;
//
//        printClasses(obj, mouse, grayMouse, jerry);

    }

//    public static void printClasses(Object obj, Mouse mouse, GrayMouse grayMouse, Jerry jerry) {
//        System.out.println(jerry.getClass().getSimpleName());
//        System.out.println(grayMouse.getClass().getSimpleName());
//        System.out.println(mouse.getClass().getSimpleName());
//        System.out.println(obj.getClass().getSimpleName());
//    }

    static class Mouse {
        public void mouseMet(){
            System.out.println("mouseMet");
        }
    }

    static class GrayMouse extends Mouse {
        public void grayMouseMet(){
            System.out.println("grayMouseMet");
        }
    }

    static class Jerry extends GrayMouse {
        public void jerryMet(){
            System.out.println("jerryMet");
        }
    }
}
