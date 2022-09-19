
package homeworkBDG_List;

import java.util.*;


public class MyCustomArrayList extends ArrayList<Integer> {
    private int arr[];
    private int capacity;
    private int current;

    public MyCustomArrayList() {
        arr = new int[1];
        capacity = 1;
        current = 0;
    }



    public void myAdd(int data) {
        if (current == capacity) {
            int temp[] = new int[2 * capacity];
            for (int i = 0; i < capacity; i++)
                temp[i] = arr[i];

            capacity *= 2;
            arr = temp;
        }

        arr[current] = data;
        current++;
    }

    void mySet(int data, int index) {
        if (index == capacity)
            myAdd(data);
        else
            arr[index] = data;
    }

    void myRemove() {
        current--;
    }

    int mySize() {
        return current;
    }


    int myGetcapacity() {
        return capacity;
    }

    int myGet(int index) {
        if (index < current)
            return arr[index];
        return -1;
    }

    void myPrint() {
        for (int i = 0; i < current; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        MyCustomArrayList test = new MyCustomArrayList();
        test.myAdd(5);
        test.myAdd(10);
        test.myAdd(15);
        test.myAdd(20);
        test.myAdd(25);

        System.out.println("ArrayList size is: " + test.mySize());
        System.out.println("ArrayList capacity is: " + test.myGetcapacity());
        System.out.println("ArrayList elements are: ");
        test.myPrint();

        test.mySet(30, 1);

        System.out.println("ArrayList elements are: ");
        test.myPrint();
        System.out.println("ArrayList first element is: " + test.myGet(0));

        test.myRemove();
        System.out.println("After deleting the last element: ");
        System.out.println("ArrayList size: " + test.mySize());
        System.out.println("ArrayList capacity is: " + test.myGetcapacity());
        System.out.println("ArrayList elements are: ");
        test.myPrint();


    }
}
