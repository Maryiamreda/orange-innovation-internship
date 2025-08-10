package org.example;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
public class AnotherApproach {
    private static final ArrayList<String> lines = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(5); //create thread pool
        for (int i = 0; i < 5; i++) {
            final int fileIndex = i;
            executorService.execute( ()-> {
                try{
                  readFile(fileIndex);
                }catch(FileNotFoundException e){
                    System.out.println("The file does not exist.");
                }
            });
        }
        executorService.awaitTermination(5, TimeUnit.SECONDS);  //maximum wait time of 5 seconds.

        executorService.close();
        //The synchronized keyword is a modifier
        // that locks a method so that only one thread can use it at a time.
        synchronized (lines) {
            Collections.sort(lines);
            System.out.println(lines);
        }
    }
    public static ArrayList<String>  readFile(final int fileIndex) throws FileNotFoundException {
        File myObj = new File("F:\\"+fileIndex+".txt");
//        ArrayList<String>lines=new ArrayList<>();
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            //Synchronized Blocks Within Methods
            //Sometimes we don’t want to synchronize the entire method, only some instructions within it.
            //We can achieve this by applying synchronized to a block:
            synchronized (lines) {
                lines.add(data);
            }
            System.out.println(data);
        }
        myReader.close();
        return lines;



    }
}