package com.company;
import java.io.*;

public class Application {

    public static void main(String[] args) throws IOException{
        DuplicateRemover duperemover = new DuplicateRemover();
        String dataFile = "problem1.txt";
        String outputFile = "unique_words.txt";
        try {


          String dupeline = duperemover.remove(dataFile);



          duperemover.write(dupeline, outputFile);
        }

        catch(IOException ex){
            System.out.println("Exception occurred");
        }
        System.out.println("Completed.");
    }
}
