package com.github.olegik1719.study.learnup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayIndexStorageTest {
    static int[] EXPECTED_ARRAY_SIZE_5 = {0, -1, 2, -3, 4};
    static int[] EXPECTED_ARRAY_SIZE_5_REV = {4, -3, 2, -1, 0};
    static int[] EXPECTED_ARRAY_SIZE_10 = {0, -1, 2, -3, 4, -5, 6, -7, 8, -9};
    static int[] EXPECTED_ARRAY_SIZE_10_REV = {-9, 8, -7, 6, -5, 4, -3, 2, -1, 0};
    static int[] EXPECTED_ARRAY_SIZE_15 = {0, -1, 2, -3, 4, -5, 6, -7, 8, -9, 10, -11, 12, -13, 14};
    static int[] EXPECTED_ARRAY_SIZE_15_REV = {14, -13, 12, -11, 10, -9, 8, -7, 6, -5, 4, -3, 2, -1, 0};

    static ArrayIndexStorage AIS_5 = new ArrayIndexStorage(EXPECTED_ARRAY_SIZE_5);
    static ArrayIndexStorage AIS_10 = new ArrayIndexStorage(EXPECTED_ARRAY_SIZE_10);
    static ArrayIndexStorage AIS_15 = new ArrayIndexStorage(EXPECTED_ARRAY_SIZE_15);

    @Test
    void checkGet5() {
        for (int i = 0; i < 5; i++) {
            Assertions.assertEquals(EXPECTED_ARRAY_SIZE_5[i], AIS_5.get(i));
        }
    }

    @Test
    void checkSize5() {
        Assertions.assertEquals(EXPECTED_ARRAY_SIZE_5.length, AIS_5.size());
    }

    @Test
    void checkReverse5() {
        Assertions.assertArrayEquals(EXPECTED_ARRAY_SIZE_5_REV, AIS_5.reverse());
    }

    @Test
    void checkGet10() {
        for (int i = 0; i < 5; i++) {
            Assertions.assertEquals(EXPECTED_ARRAY_SIZE_10[i], AIS_10.get(i));
        }
    }

    @Test
    void checkSize10() {
        Assertions.assertEquals(EXPECTED_ARRAY_SIZE_10.length, AIS_10.size());
    }

    @Test
    void checkReverse10() {
        Assertions.assertArrayEquals(EXPECTED_ARRAY_SIZE_10_REV, AIS_10.reverse());
    }

    @Test
    void checkGet15() {
        for (int i = 0; i < 5; i++) {
            Assertions.assertEquals(EXPECTED_ARRAY_SIZE_15[i], AIS_15.get(i));
        }
    }

    @Test
    void checkGet15Except() {
        IndexOutOfBoundsException exception_minus = Assertions.assertThrows(IndexOutOfBoundsException.class,() -> AIS_15.get(-1));
        Assertions.assertEquals("Значение индекса: " + -1 + " выходит за границы хранилища.", exception_minus.getMessage());
        IndexOutOfBoundsException exception_out = Assertions.assertThrows(IndexOutOfBoundsException.class,() -> AIS_15.get(100));
        Assertions.assertEquals("Значение индекса: " + 100 + " выходит за границы хранилища.", exception_out.getMessage());
        IndexOutOfBoundsException exception_border = Assertions.assertThrows(IndexOutOfBoundsException.class,() -> AIS_15.get(15));
        Assertions.assertEquals("Значение индекса: " + 15 + " выходит за границы хранилища.", exception_border.getMessage());
    }

    @Test
    void checkSize15() {
        Assertions.assertEquals(EXPECTED_ARRAY_SIZE_15.length, AIS_15.size());
    }

    @Test
    void checkReverse15() {
        Assertions.assertArrayEquals(EXPECTED_ARRAY_SIZE_15_REV, AIS_15.reverse());
    }
}
