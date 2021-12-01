package eu.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TwoTest {

    @Test
    void sayHello() {
        assertEquals("Hi", new Two().sayHello());
    }
}
