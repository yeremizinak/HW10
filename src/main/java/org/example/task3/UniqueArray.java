package org.example.task3;

import java.io.FileNotFoundException;
import java.util.*;

public class UniqueArray {
    public static List<String> uniqueOnly(List<String> reader) throws FileNotFoundException {
        Set<String> uniqueValues = new HashSet<>();
        List<String> result = new ArrayList<>();
        for (String val : reader) {
            uniqueValues.add(val);
        }
        for (String val : uniqueValues) {
            result.add(val);
        }
        return result;
    }
}