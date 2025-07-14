package arrays;

import java.util.Arrays;

public class DynamicArray {
    private int[] data;
    private int size;
    private int capacity;

    public DynamicArray() {
        capacity = 2;
        data = new int[capacity];
        size = 0;
    }

    public void add(int value) {
        if (size == capacity) {
            resize();
        }
        data[size++] = value;
    }

    private void resize() {
        capacity *= 2;
        data = Arrays.copyOf(data, capacity);
    }

    public int get(int index) {
        if (index >= size) throw new IndexOutOfBoundsException();
        return data[index];
    }

    public int size() {
        return size;
    }
}
