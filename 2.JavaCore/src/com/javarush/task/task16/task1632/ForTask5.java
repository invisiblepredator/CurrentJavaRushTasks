package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForTask5  extends Thread {

    @Override
    public void run() {
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){

            int value = 0;
            while(true){
                String in = bufferedReader.readLine();
                if (in.equals("N")){
                    System.out.println(value);
                    break;
                }else{
                    value += Integer.parseInt(in);
                }
            }
        }catch (IOException e){

        }
    }
}
