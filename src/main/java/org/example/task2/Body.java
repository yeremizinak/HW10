package org.example.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Body {
    public static String[] createBodyArr() throws FileNotFoundException {
        File file = new File("files/file2.txt");
        Scanner scanner = new Scanner(file);
        int j = 0;
        int lineLength = 0;
        if (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] bodyArrTemp = line.split("\\s");
            lineLength = bodyArrTemp.length;
        }
        String[] bodyArr = new String[lineLength];
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] bodyArrTemp = line.split("\\s");
            lineLength = bodyArrTemp.length;
            for (int i = 0; i < bodyArrTemp.length; i++) {
                bodyArr[j] = bodyArrTemp[i];
                j++;
            }
            if (scanner.hasNext()) {
                bodyArr = Arrays.copyOf(bodyArr, bodyArr.length + lineLength);
            }
        }
        return bodyArr;
    }
}
