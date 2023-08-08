package org.example.task3;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Task3 {
    public static void task3() throws FileNotFoundException {
        List<String> stringsFromFile = Reader.readFile("files/words.txt");
        Map<String, Long> wordMap = MyMap.createWordMapCount(stringsFromFile);
        Long[] counts = (wordMap.values().toArray(new Long[0]));
        Arrays.sort(counts, Collections.reverseOrder());
        for (long count : counts) {
            for (String w : wordMap.keySet()) {
                Long value = wordMap.get(w);
                if (value == count) {
                    System.out.println(w + " - " + value);
                }
            }
        }
    }
}