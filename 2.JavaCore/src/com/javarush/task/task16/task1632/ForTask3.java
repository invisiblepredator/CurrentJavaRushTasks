package com.javarush.task.task16.task1632;

public class ForTask3  extends Thread {

    @Override
    public void run() {
        while(true){
            System.out.println("Ура");
            try{
                Thread.sleep(500);

            }catch (InterruptedException e){

            }
        }
    }
}
