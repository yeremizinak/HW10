package org.example.task3;

import java.io.FileNotFoundException;

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
        for (String val : finalArr) {
            System.out.println(result + val);
        }
        ;
        return result;
    }

}
