package com.github.olegik1719.study.learnup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
        Assertions.assertDoesNotThrow(() -> Main.main(null));
    }

    @Test
    void mainConstructor() {
        Assertions.assertDoesNotThrow(() -> new Main());
    }
}