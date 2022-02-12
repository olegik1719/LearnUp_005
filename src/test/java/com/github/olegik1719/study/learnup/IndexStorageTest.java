package com.github.olegik1719.study.learnup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IndexStorageTest {

    static int[] EXPECTED_ARRAY_SIZE_5 = {0, -1, 2, -3, 4};
    static int[] EXPECTED_ARRAY_SIZE_5_REV = {4, -3, 2, -1, 0};
    static int[] EXPECTED_ARRAY_SIZE_10 = {0, -1, 2, -3, 4, -5, 6, -7, 8, -9};
    static int[] EXPECTED_ARRAY_SIZE_10_REV = {-9, 8, -7, 6, -5, 4, -3, 2, -1, 0};
    static int[] EXPECTED_ARRAY_SIZE_15 = {0, -1, 2, -3, 4, -5, 6, -7, 8, -9, 10, -11, 12, -13, 14};
    static int[] EXPECTED_ARRAY_SIZE_15_REV = {14, -13, 12, -11, 10, -9, 8, -7, 6, -5, 4, -3, 2, -1, 0};

    static IndexStorage IS_5 = new IndexStorage(5);
    static IndexStorage IS_10 = new IndexStorage(10);
    static IndexStorage IS_15 = new IndexStorage(15);

    @Test
    void checkGet5() {
        for (int i = 0; i < 5; i++) {
            Assertions.assertEquals(EXPECTED_ARRAY_SIZE_5[i], IS_5.get(i));
        }
    }

    @Test
    void checkSize5() {
        Assertions.assertEquals(EXPECTED_ARRAY_SIZE_5.length, IS_5.size());
    }

    @Test
    void checkReverse5() {
        Assertions.assertArrayEquals(EXPECTED_ARRAY_SIZE_5_REV, IS_5.reverse());
    }

    @Test
    void checkGet10() {
        for (int i = 0; i < 5; i++) {
            Assertions.assertEquals(EXPECTED_ARRAY_SIZE_10[i], IS_10.get(i));
        }
    }

    @Test
    void checkSize10() {
        Assertions.assertEquals(EXPECTED_ARRAY_SIZE_10.length, IS_10.size());
    }

    @Test
    void checkReverse10() {
        Assertions.assertArrayEquals(EXPECTED_ARRAY_SIZE_10_REV, IS_10.reverse());
    }

    @Test
    void checkGet15() {
        for (int i = 0; i < 5; i++) {
            Assertions.assertEquals(EXPECTED_ARRAY_SIZE_15[i], IS_15.get(i));
        }
    }

    @Test
    void checkGet15Except() {
        IndexOutOfBoundsException exception_minus = Assertions.assertThrows(IndexOutOfBoundsException.class,() -> IS_15.get(-1));
        Assertions.assertEquals("Значение индекса " + -1 + " выходит за границы хранилища.", exception_minus.getMessage());
        IndexOutOfBoundsException exception_out = Assertions.assertThrows(IndexOutOfBoundsException.class,() -> IS_15.get(100));
        Assertions.assertEquals("Значение индекса " + 100 + " выходит за границы хранилища.", exception_out.getMessage());
        IndexOutOfBoundsException exception_border = Assertions.assertThrows(IndexOutOfBoundsException.class,() -> IS_15.get(15));
        Assertions.assertEquals("Значение индекса " + 15 + " выходит за границы хранилища.", exception_border.getMessage());
    }

    @Test
    void checkSize15() {
        Assertions.assertEquals(EXPECTED_ARRAY_SIZE_15.length, IS_15.size());
    }

    @Test
    void checkReverse15() {
        Assertions.assertArrayEquals(EXPECTED_ARRAY_SIZE_15_REV, IS_15.reverse());
    }

    @Test
    void checkConstructorException(){
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class,() -> new IndexStorage(0));
        Assertions.assertEquals("Размер хранилища должен быть натуральным числом!", exception.getMessage());
    }
}