package org.example;

import java.io.*;
import java.util.Scanner;
import java.util.regex.*;

public class Task1 {
    public static void test() {

        try {
            File file = new File("files/file.txt");
            Scanner scanner = new Scanner(file);
            String regex = "^\\(\\d{3}\\)\\s\\d{3}-\\d{4}$";
            String regex2 = "^\\d{3}-\\d{3}-\\d{4}$";

            File tempFile = new File("tempFile.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                Pattern pattern = Pattern.compile(regex);
                Pattern pattern2 = Pattern.compile(regex2);

                Matcher matcher = pattern.matcher(line);
                Matcher matcher2 = pattern2.matcher(line);

                if (matcher.matches() || matcher2.matches()) {
                    writer.write(line + "\n");
                }
            }
            writer.close();
            scanner.close();

            if (file.delete()) {
                if (!tempFile.renameTo(file)) {
                    System.out.println("An error with tempFile");
                }
            } else {
                System.out.println("An error with File");
            }


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}