package eu.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OneTest {

    @Test
    void sayHello() {
        assertEquals("Hello", new One().sayHello());
    }
}
