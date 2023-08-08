package org.example;

import org.example.task2.Task2;
import org.example.task3.Task3;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Task1.test();
        Task2.writeFile();
        Task3.task3();
    }
}