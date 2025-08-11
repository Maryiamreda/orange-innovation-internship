package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


interface MatrixReader {
    int[][] readMatrix(String fileIndex) throws FileNotFoundException;
}

class MatrixFileReader implements MatrixReader {

    public int[][] readMatrix(String fileIndex) throws FileNotFoundException {
        ArrayList<int[]> rows = new ArrayList<>();
        Scanner input  = new Scanner(new File(fileIndex));

        while (input .hasNextLine()) {
            String[] line = input .nextLine().trim().split("\\s+"); // scan it as a String
            int[] row = new int[line.length];
            for (int i = 0; i < line.length; i++) {
                row[i] = Integer.parseInt(line[i]); //converts that string into number
            }
            rows.add(row);
        }
        input .close();

        return rows.toArray(new int[0][]); //return an array containing all the elements in ArrayList in the correct order.
    }
}