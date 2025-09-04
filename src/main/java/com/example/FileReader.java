package com.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileReader {
    public static String readFile(String filePath) throws IOException {
        return Files.readString(Path.of(filePath));
    }

    public static List<String> readFileLines(String filePath) throws IOException {
        return Files.readAllLines(Path.of(filePath));
    }

    
}