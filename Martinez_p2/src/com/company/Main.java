package com.company;
import java.io.*;
public class Main {

    public static void main(String[] args) {
        DuplicateCounter dupecount = new DuplicateCounter();
        String dataFile = "problem2.txt";
        String outputFile = "unique_words.txt";
        try {
            dupecount.count(dataFile);

            dupecount.write(outputFile);

        }

        catch(IOException ex){
            System.out.println("Exception occurred");
        }
        System.out.println("Completed.");
    }
}
