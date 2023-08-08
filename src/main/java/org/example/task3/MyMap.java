package org.example.task3;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyMap {

    public static Map<String, Long> createWordMapCount(List<String> res) throws FileNotFoundException {
        Map<String, Long> result = new HashMap<>();
        List<String> uniqueArray = UniqueArray.uniqueOnly(res);
        for (String word : uniqueArray) {
            long count = 0L;
            for (String val : res) {
                if (val.equals(word)) {
                    count++;
                }
            }
            result.put(word, count);
        }
        return result;
    }
}
