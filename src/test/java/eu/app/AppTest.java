package eu.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void twoGreetings() {
        assertEquals("Howdy Hi", new App().twoGreetings());
    }
}
