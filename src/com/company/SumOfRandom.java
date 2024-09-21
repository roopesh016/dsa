package com.company;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SumOfRandom {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        RandomNumberGenerator randomNumberGenerator2 = new RandomNumberGenerator();

        Future<Integer> random1 = executorService.submit(randomNumberGenerator);
        Future<Integer> random2 = executorService.submit(randomNumberGenerator2);

        int randomValue1 = random1.get();
        int randomValue2 = random2.get();


        System.out.println("SUM OF TWO RANDOM VALUES: "+ (randomValue1+randomValue2));

    }
}
