package org.example.task3;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class Task3 {
    public static String task3() throws FileNotFoundException {
        String result = "";
        int index = 0;
        String[] finalArr = new String[UniqueArray.makeArray().length];
        for (int i = 0; i < UniqueArray.makeArray().length; i++) {
            index = 0;
            for (int j = 0; j < Reader.readFile().length; j++) {
                if (Reader.readFile()[j].equals(UniqueArray.makeArray()[i])) {
                    index++;
                }
            }
                finalArr[i] = UniqueArray.makeArray()[i] + " " + index;
        }
        for (int i = 0; i < finalArr.length - 1; i++) {
            for (int j = 0; j < finalArr.length - i - 1; j++) {
                int count1 = Integer.parseInt(finalArr[j].split("\\s+")[1]);
                int count2 = Integer.parseInt(finalArr[j + 1].split("\\s+")[1]);
                if (count1 < count2) {
                    String temp = finalArr[j];
                    finalArr[j] = finalArr[j + 1];
                    finalArr[j + 1] = temp;
                }
            }
        }
        for (String val : finalArr) {
            result = result + val + "\n";
        }
        return result.strip();
    }

}