package com.example.OOP.generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class CustomArray<T> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // working as index val

    public CustomArray() {
        data = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        // copy curr items in new arr
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public int remove() {
        int removed = data[--size];   
        return removed;
    }

    public int get(int index) {
        return data[index];
    }

    public int size() {
        return size;
    }

    public void set(int idx, int val) {
        data[idx] = val;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" + "data=" + Arrays.toString(data) + ", size=" + size + '}';
    }

    public static void main(String[] args) {
        CustomArray list = new CustomArray();

        // list.add(3);
        // list.add(5);
        // list.add(9);

        for (int i = 0; i < 14; i++) {
            list.add(2 * i);
        }

        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();

    }
}
