package org.example.task3;

import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Set;

public class UniqueArray {
    public static String[] makeArray() throws FileNotFoundException {
        Set<String> uniqueValues = new HashSet<>();
        for (String val : Reader.readFile()) {
            uniqueValues.add(val);
        }
        String[] tempArr = new String[uniqueValues.size()];
        int i = 0;
        for (String val : uniqueValues) {
            tempArr[i++] = val;
        }
        return tempArr;
    }
}