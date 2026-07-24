package com.example.StackAndQueue;

public class DynamicStack extends CustomStack {
    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public boolean push(int item) {
        // if arr is full this runs
        if (this.isFull()) {
            // double the arr size
            int[] temp = new int[data.length * 2];

            // copy all prev items in new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            data = temp;
        }
        
        // else this run normally
        // insert item
        return super.push(item);
    }
}
