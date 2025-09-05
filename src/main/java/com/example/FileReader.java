package com.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class FileReader {
    public static String readFile(String filePath) throws IOException {
        return Files.readString(Path.of(filePath));
    }

    public static void main(String[] args) {
        String filePath;
        if (args.length == 0) {
            System.err.println("Please provide a file path to read.");

            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter file path: ");

            filePath = myObj.nextLine();
        } else {
            filePath = args[0];
        }

        try {
            String content = readFile(filePath);
            System.out.println("File content:\n" + content);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}