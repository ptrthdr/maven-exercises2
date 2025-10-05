package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    void testBookCreation() {
        Book b = new Book("Dune", "Frank Herbert");
        assertEquals("Dune", b.getTitle());
        assertEquals("Frank Herbert", b.getAuthor());
    }
}
