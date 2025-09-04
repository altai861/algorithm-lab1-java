package com.example;

import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class FileReaderTest {
    @Test
    void testReadFileExists() throws IOException {
        String content = FileReader.readFile("src/test/resources/sample.txt");
        assertEquals("Hello World\r\nThis is a test file", content);
    }
}
