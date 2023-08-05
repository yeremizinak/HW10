package org.example.task2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;

public class Task2 {
    public static void writeFile() throws FileNotFoundException {
        File file = new File("files/user.json");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write("[\n");
            for (int i = 0; i < Body.createBodyArr().length; i += 2) {
                writer.write("\t{\n");
                Header.headers();
                writer.write("\t\"" + Header.getH1() + "\" : \"" + Body.createBodyArr()[i] + "\",\n" + "\t\"" + Header.getH2() + "\" : " + Integer.parseInt(Body.createBodyArr()[i + 1]) + "\n");
                if (i + 2 < Body.createBodyArr().length) {
                    writer.write("\t},");
                } else {
                    writer.write("\t}");
                }
                writer.write(System.lineSeparator());
            }
            writer.write("]");
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}