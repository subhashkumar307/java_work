package com.company;

public class MaxHeap {
    // Max Heap ---> Using Array

    // Empty Array of Heap
    private static int[] Heap;
    private int size;
    private final int maxsize;

    // Constructor
    public MaxHeap(int maxsize) {
        this.maxsize = maxsize;
        this.size = 0;
        Heap = new int[this.maxsize + 1];
        Heap[0] = Integer.MAX_VALUE;
    }
    // To make the heap a complete tree
    private int parent(int index) {
        return index / 2;
    }
    private int leftChild(int index) {
        return index * 2;
    }
    private int rightChild(int index) {
        return (index * 2) + 1;
    }
    private void swap(int child, int parent) {
        int temp;
        temp = Heap[child];
        Heap[child] = Heap[parent];
        Heap[parent] = temp;
    }
    private boolean isLeaf(int pos) {
        if (pos > (size/2) && pos <= size) {
            return true;
        } else {
            return false;
        }
    }

    private void maxHeapify(int index) {
        if (isLeaf(index))
            return;
        if (Heap[index] < Heap[leftChild(index)] || Heap[index] < Heap[rightChild(index)]) {
            if (Heap[leftChild(index)] > Heap[rightChild(index)]) {
                swap(index, leftChild(index));
                maxHeapify(leftChild(index));
            } else {
                swap(index, rightChild(index));
                maxHeapify(rightChild(index));
            }
        }
    }
    public void print() {
        for (int i=1; i<=size/2; i++) {
            System.out.print("PARENT: " + Heap[i] +
                    "  LEFT CHILD : " + Heap[(2*i)] +
                    "  RIGHT CHILD : " + Heap[(2 * i) + 1]);
            System.out.println();
        }
    }
    public int getMax() {
        return Heap[1];
    }

    public void insert(int data) {
        // Do we have space left to insert or not
        if (this.size < this.maxsize) {
            // Insert
            Heap[++size] = data;

            // Heap properties can get violated
            int current = this.size;
            while (Heap[current] > Heap[parent(current)]) {
                swap(current, parent(current));
                current = parent(current);
            }
        }
    }
    public int extractMax() {
        int removed = Heap[1];
        int changed = Heap[size--];
        Heap[1] = changed;
        // Conserve the heap prop once the data is removed
        maxHeapify(1);
        return removed;
    }

    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(10);
        maxHeap.insert(10);
        maxHeap.insert(20);
        maxHeap.insert(30);
        maxHeap.insert(40);
        maxHeap.insert(50);
        maxHeap.insert(60);

        // Display
        System.out.println("The heap is as follows : ");
        maxHeap.print();

        // Get the max value
        System.out.println("The maximum value in the loop is: " + maxHeap.getMax());

        // Remove the max value
        System.out.println("Value removed from the Heap is : " + maxHeap.extractMax());

        // Display after extracting
        System.out.println("The Heap is as follows : ");
        maxHeap.print();
    }
}












