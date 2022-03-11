package test;

import java.io.*;
import java.util.*;

public class NumbersInFile {
    public static void main(String[] args) throws IOException {

        //
        // READING FROM A FILE
        //
        try {
            BufferedReader inputFile = new BufferedReader(
                    new FileReader("C:\\Users\\sherany\\downloads\\words.txt"));
            // inputFile.readLine();

            // Documentation about StringTokenizer:
            // http://docs.oracle.com/javase/7/docs/api/java/util/StringTokenizer.html
            StringTokenizer line = new StringTokenizer(inputFile.readLine()); // (to create the object)

            // What if a file doesn't have any info at the beginning?
            line.nextToken(); // (to read token by token)
            while (line.hasMoreTokens()) {
                System.out.println("There are more tokens");
                line.nextToken();
            }

            // Closing the input stream
            inputFile.close();

        } catch (FileNotFoundException e) {
            System.err.println("Some exception happened: " + e.getMessage());
        }


        //
        // WRITING TO A FILE
        //
        try {
            PrintWriter outputFile = new PrintWriter(
                    new BufferedWriter(
                            new FileWriter("C:\\Users\\sherany\\downloads\\words.txt")));
            // (true is used to append data to the file)
            // File myObj = new File("C:\\Users\\sherany\\downloads\\sherany8.10.txt");

            // outputFile.print();
            outputFile.println("This is a test");
            outputFile.println("For a file I have created");
            outputFile.println("on the past :)");

            // Closing the output stream enabling the reading of the file
            outputFile.close();

        } catch (IOException e) {
            System.err.println("Some IOException Happened: " + e.getMessage());
        }
    }
}