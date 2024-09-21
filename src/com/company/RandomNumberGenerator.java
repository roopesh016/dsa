package com.company;

import java.util.Random;
import java.util.concurrent.Callable;

public class RandomNumberGenerator implements Callable {

    public Integer call(){
        Random random = new Random();
        Integer i = random.nextInt();
        System.out.println("Random Number Generated: "+ i + " ,Thread: "+Thread.currentThread().getName());
        return i;
    }






}
