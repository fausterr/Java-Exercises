package Lekcja;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

    public static void main(String[] args) {

        String fileName = "testFile.txt";
        try(
                var fileWriter = new FileWriter(fileName, true);
                var bufferedWriter = new BufferedWriter(fileWriter);
                ) {
            bufferedWriter.newLine();
            bufferedWriter.write("Bolek");
            bufferedWriter.newLine();
            bufferedWriter.write("Lolek");
            bufferedWriter.newLine();
            bufferedWriter.write("Karolek");
        } catch (IOException e) {
            System.err.println("Nie udało się zapisać pliku " + fileName);
        }
    }
}
