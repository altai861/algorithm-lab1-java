package com.example;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.NoSuchFileException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileReaderTest {

    @Test
    void testReadFileExists() throws IOException {
        String content = FileReader.readFile("src/test/resources/sample.txt");
        assertEquals("Hello World\nThis is a test file", content);
    }

    @Test
    void testFileNotFound() {
        assertThrows(NoSuchFileException.class, () -> {
            FileReader.readFile("src/test/resources/missing.txt");
        });
    }

    @Test
    void testAccessDenied() {
        assertThrows(AccessDeniedException.class, () -> {
            FileReader.readFile("/etc/sudoers");
        });
    }
}
