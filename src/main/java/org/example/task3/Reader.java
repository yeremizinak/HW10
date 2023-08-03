package org.example.task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Reader {
    public static String[] readFile() throws FileNotFoundException {
        File file = new File("files/words.txt");
        Scanner scanner = new Scanner(file);
        int j = 0;
        int lineLength = 0;
        String[] bodyArr = new String[lineLength];
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] bodyArrTemp = line.split("\\s");
            lineLength = bodyArrTemp.length;
            bodyArr = Arrays.copyOf(bodyArr, bodyArr.length + lineLength);
            for (int i = 0; i < bodyArrTemp.length; i++) {
                bodyArr[j] = bodyArrTemp[i];
                j++;
            }
        }
        return bodyArr;
    }

}
