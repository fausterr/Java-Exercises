package Lekcja;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileTesterTry {

    public static void main(String[] args) throws FileNotFoundException {

        String fileName = "testFile.txt";
        var fileReader = new FileReader(fileName);
        var bufferedReader = new BufferedReader(fileReader);
        try (
             fileReader;
             bufferedReader;
        ){
               String nextLine = null;
               int lines = 0;
               while((nextLine = bufferedReader.readLine()) != null) {
                    System.out.println(nextLine);
                    lines++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
