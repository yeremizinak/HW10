package org.example.task2;

import java.io.*;
import java.util.Scanner;

public class Header {
    private static String h1 = "";
    private static String h2 = "";

    public static void headers() throws FileNotFoundException {

        File file = new File("files/file2.txt");
        Scanner scanner = new Scanner(file);
        String[] headerArr = new String[0];

        if (scanner.hasNext()) {
            String firstLine = scanner.nextLine();
            headerArr = firstLine.split("\\s");
        } else {
            System.out.println("Error!");
        }
        h1 = headerArr[0];
        h2 = headerArr[1];
    }

    public static String getH1() {
        return h1;
    }

    public static String getH2() {
        return h2;
    }
}
