package com.github.olegik1719.study.learnup;

/***********************************************************************
 * Создайте `ArrayIndexStorage` наследника `IndexStorage`
 * В конструкторе один параметр - массив интов, в котором хранит бы все данные.
 * `get(int index)` должен возвращать значение ячейки массива под номером этого индекса.
 * Обеспечьте корректную работоспособность всех методов
 */
public class ArrayIndexStorage extends IndexStorage {

    private final int[] arrayHidden;

    public ArrayIndexStorage(int[] initial) {
        super(initial.length);
        arrayHidden = new int[size()];
        System.arraycopy(initial, 0, arrayHidden, 0, size());
    }

    @Override
    public int get(int i) {
        if (i > arrayHidden.length - 1 || i < 0) {
            throw new IndexOutOfBoundsException("Значение индекса: " + i + " выходит за границы хранилища.");
        }
        return arrayHidden[i];
    }
}
