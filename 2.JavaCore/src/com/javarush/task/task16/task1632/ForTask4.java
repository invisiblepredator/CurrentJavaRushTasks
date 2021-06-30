package com.javarush.task.task16.task1632;

import sun.awt.windows.ThemeReader;

 class ForTask4 extends Thread implements Message {

    public void run() {
        while (!isInterrupted()) {
        }
    }


    @Override
     public void showWarning() {
         this.interrupt();
    }
}
