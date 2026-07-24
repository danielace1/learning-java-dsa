package com.example.OOP.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// here T should either be Number or its subclasses
public class WildCardExample<T extends Number> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // working as index val

    public WildCardExample() {
        data = new Object[DEFAULT_SIZE];
    }

    public void getList(List<? extends Number> list) {
        // do something
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

    public T remove() {
        T removed = (T) (data[--size]);
        return removed;
    }

    public T get(int index) {
        return (T) (data[index]);
    }

    public int size() {
        return size;
    }

    public void set(int idx, T val) {
        data[idx] = val;
    }

    @Override
    public String toString() {
        return "WildCardExampleList{" + "data=" + Arrays.toString(data) + ", size=" + size + '}';
    }

    public static void main(String[] args) {
        WildCardExample list = new WildCardExample();

        // list.add(3);
        // list.add(5);
        // list.add(9);

        // for (int i = 0; i < 14; i++) {
        // list.add(2 * i);
        // }

        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();

        WildCardExample<Number> list3 = new WildCardExample<>();
        for (int i = 0; i < 14; i++) {
            list3.add(2 * i);
        }

        System.out.println(list3);

    }
}
