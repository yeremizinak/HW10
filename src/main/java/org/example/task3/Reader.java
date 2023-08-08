package org.example.task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reader {
    public static List<String> readFile(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        List<String> result = new ArrayList<>();
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] bodyArrTemp = line.split("\\s+");
            for (int i = 0; i < bodyArrTemp.length; i++) {
                result.add(bodyArrTemp[i]);
            }
        }
        return result;
    }
}