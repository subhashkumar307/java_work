package com.company;

public class MinHeap {
    private int[] theHeap;
    private int capacity;
    private int pos;

    public MinHeap() {
        pos = 1;
        capacity = 10;
        theHeap = new int[capacity];
    }
    // Insert the value
    public void insert(int value) {
        if (pos == capacity) {
            // Increases the capacity
            capacity++;
        }
        else {
            theHeap[pos++] = value;
            int child = pos - 1;
            int parent = child / 2;

            while (theHeap[parent] > theHeap[child] && parent > 0) {
                int tmp = theHeap[parent];
                theHeap[parent] = theHeap[child];
                theHeap[child] = tmp;

                child = parent;
                parent = child / 2;
            }
        }
    }

    public void print() {
        for (int i = 1; i < pos; i++) {
            System.out.print(theHeap[i] + " ");
        }
    }

    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap();

        minHeap.insert(3);
        minHeap.insert(4);
        minHeap.insert(5);
        minHeap.insert(6);
        minHeap.insert(7);
        minHeap.insert(8);
        minHeap.insert(9);

        minHeap.print();
    }
}
