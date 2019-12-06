package com.company;

import java.io.*;

public class DuplicateRemover {
    public static String remove(String dataFile)throws IOException {

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
                return lineInput;
            }

            lineInput = buffRead.readLine();

        }

        buffRead.close();
        System.out.println("File operation performed successfully");
        return notFound;
    }

    public static void write(String line, String outputFile) throws IOException {
        PrintWriter pw = new PrintWriter("unique_words.txt");
        pw.println(line);
        pw.flush();
        pw.close();
    }

}
