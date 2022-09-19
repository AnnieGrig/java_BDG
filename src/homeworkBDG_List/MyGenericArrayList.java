package homeworkBDG_List;

import java.util.*;

@SuppressWarnings("unchecked")
public class MyGenericArrayList<E> implements List<E> {

    private static int DEFAULT_CAPACITY = 10;

    private E[] array;

    private int size;

    public MyGenericArrayList() {
        array = (E[]) new Object[DEFAULT_CAPACITY];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean add(E element) {
        if (size == DEFAULT_CAPACITY) {
            E[] temp = (E[]) new Object[2 * DEFAULT_CAPACITY];
            System.arraycopy(array, 0, temp, 0, DEFAULT_CAPACITY);
            array = temp;
        }
        array[size] = element;
        size++;
        return true;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return array[index];
    }

    @Override
    public E set(int index, E element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        } else {
            return array[index] = element;
        }
    }

    @Override
    public void add(int index, E element) {
        if (size == DEFAULT_CAPACITY) {
            E[] temp = (E[]) new Object[2 * DEFAULT_CAPACITY];
            System.arraycopy(array, 0, temp, 0, DEFAULT_CAPACITY);

            DEFAULT_CAPACITY *= 2;
            array = temp;
        }
        array[size] = element;
        size++;
    }

    @Override
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        E value = array[index];
        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];
        }
        array[size] = null;
        size--;
        return value;
    }

    @Override
    public String toString(){

        StringBuilder builder = new StringBuilder();

        for (E e : array) {
            if (e != null){
                builder.append(e);
                builder.append(" ");
            }
        }
        return builder.toString();
    }


    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }
}
