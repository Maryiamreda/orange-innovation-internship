package org.example;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ReadFiles {
    public static void main(String[] args) throws InterruptedException {
        ReadFile reader = new ReadFile();

        ExecutorService executorService = Executors.newFixedThreadPool(5);  //create thread pool

        for (int i = 0; i < 5; i++) {
            final int fileIndex = i;
            executorService.execute(() -> {
                try {
                    reader.readFile(fileIndex);
                } catch (FileNotFoundException e) {
                    System.out.println("The file does not exist ");
                }
            });
        }

        executorService.shutdown();
        executorService.awaitTermination(5, TimeUnit.SECONDS);


        ArrayList<String> names = reader.getNames();
        Collections.sort(names);

        System.out.println(names);
    }
}
