package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

interface Read {
    ArrayList<String> readFile(int fileIndex) throws FileNotFoundException;
}

class ReadFile implements Read {
    private ArrayList<String> names = new ArrayList<>();
    public ArrayList<String> getNames() {
        return names;
    }
    public ArrayList<String> readFile(final int fileIndex) throws FileNotFoundException {
        File myObj = new File("F:\\" + fileIndex + ".txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            names.add(data);
        }
        myReader.close();
        return new ArrayList<>(names);
    }


}
