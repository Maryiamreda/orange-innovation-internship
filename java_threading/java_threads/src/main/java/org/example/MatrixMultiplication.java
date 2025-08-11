package org.example;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static org.example.AnotherApproach.readFile;
public class MatrixMultiplication {
    static int[][] matrixA;
    static int[][] matrixB;
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);  //create thread pool

        MatrixFileReader reader = new MatrixFileReader();


        executorService.execute(() -> {
            try {
                matrixA = reader.readMatrix("F:\\A.txt");
            } catch (FileNotFoundException e) {
                System.out.println("A not found");
            }
        });

        executorService.execute(() -> {
            try {
                matrixB = reader.readMatrix("F:\\B.txt");
            } catch (FileNotFoundException e) {
                System.out.println("B not found");
            }
        });
        executorService.shutdown();
        executorService.awaitTermination(5, TimeUnit.SECONDS);

    }
}