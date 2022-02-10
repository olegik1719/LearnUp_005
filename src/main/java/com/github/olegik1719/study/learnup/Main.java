package com.github.olegik1719.study.learnup;

import java.util.Arrays;

/****************************************************************************************
 * Для примера использую решение первого задания
 ****************************************************************************************/
public class Main {
    private static final int ARRAY_SIZE = 10;

    public static void main(String[] args) {
        //Создайте массив длинною в 10
        int[] array = new int[ARRAY_SIZE];
        //В ячейки с чётными индексами положите значение индекса, с нечётными - значение минус индекс
        fillArray(array);
        //Выведите на экран
        printArray(array);
        IndexStorage indexStorage = new IndexStorage(ARRAY_SIZE);
        ArrayIndexStorage arrayIndexStorage = new ArrayIndexStorage(array);
        //Переверните массив слева направо без создания вспомогательных массивов
        revertArray(array);
        //Выведите на экран
        printArray(array);
        printArray(indexStorage.reverse());
        printArray(arrayIndexStorage.reverse());
        System.out.println(indexStorage.get(0));
    }

    private static void fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i % 2 == 0 ? i : -i;
        }
    }

    private static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    private static void revertArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int buf = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = buf;
        }
    }
}
