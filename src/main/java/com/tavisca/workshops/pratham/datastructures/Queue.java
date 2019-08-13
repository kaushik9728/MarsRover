package com.tavisca.workshops.pratham.datastructures;

public class Queue<T> {
    public static int defaultCapacity=1000;
    private static int front,rear,capacity;
    private T[] queue;
    public Queue()
   {
       front = 0;rear=0;
       this.capacity = defaultCapacity;
       queue = (T[])new Object[capacity];
   }
    public Queue(int capacity) {
        front = rear = 0;
        this.capacity = capacity;
        queue = (T[])new Object[capacity];
    }
    public int capacity() {
       return capacity;
    }
    public void add(T i) {
        if (capacity == rear) {
            throw new ArrayIndexOutOfBoundsException();
        }
        else {
            queue[rear] = i;
            rear++;
        }
        return;
    }
    public T remove() {
       T ans=queue[0];
        if (front == rear) {
            throw new ArrayIndexOutOfBoundsException();
        }
        else {
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }
            if (rear < capacity)
                queue[rear] = null;
            rear--;
        }
        return ans;
    }
}
