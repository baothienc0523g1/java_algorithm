package Coding.Day2No10;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteObjectToCSV {
    public static void writeObjectToCSV(List<String> objectList, String path, boolean append) {
        try (FileWriter fileWriter = new FileWriter(path, append);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            for (String str : objectList) {
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
