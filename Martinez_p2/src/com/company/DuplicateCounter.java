package com.company;
import java.io.*;

public class DuplicateCounter {
    private int wordCounter;
    public void count(String dataFile) throws IOException {
        wordCounter = 0;
        BufferedReader buffRead = new BufferedReader(new FileReader(dataFile));

        String lineInput = buffRead.readLine();

        String notFound = " ";

        while(lineInput != null)
        {
            boolean flag = false;

            BufferedReader buffRead2 = new BufferedReader(new FileReader("unique_words.txt"));

            String lineOutput = buffRead2.readLine();

            while(lineOutput != null)
            {

                if(lineInput.equals(lineOutput))
                {
                    flag = true;
                    break;
                }

                lineOutput = buffRead2.readLine();

            }

            if(flag == false){
                wordCounter = wordCounter +1;
            }

            lineInput = buffRead.readLine();

        }

        buffRead.close();
        System.out.println("File operation performed successfully");

        return;

    }

    public void write(String outputFile) throws IOException {
        PrintWriter pw = new PrintWriter("unique_words.txt");
        pw.println(wordCounter);
        pw.flush();
        pw.close();
    }
}
