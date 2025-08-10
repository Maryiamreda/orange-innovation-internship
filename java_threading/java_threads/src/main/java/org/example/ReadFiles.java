package org.example;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
public class ReadFiles {

public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(5); //create thread pool
ArrayList<String> names=new ArrayList<String>();
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

    }
    public static ArrayList<String>  readFile(final int fileIndex) throws FileNotFoundException {
        File myObj = new File("F:\\"+fileIndex+".txt");
ArrayList<String>lines=new ArrayList<>();
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                lines.add(data);
                System.out.println(data);
            }
        myReader.close();
            return lines;



    }
    }
