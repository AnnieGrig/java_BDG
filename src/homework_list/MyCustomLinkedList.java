package homework_list;

import java.util.*;

public class MyCustomLinkedList implements List<Integer> {
    private int size = 0;
    MyNode head;
    MyNode last;

    private static class MyNode {
        Integer data;
        MyNode next;
        MyNode prev;

        MyNode(MyNode prev, Integer element, MyNode next) {
            this.data = element;
            this.next = next;
            this.prev = prev;
        }

        MyNode(Integer data) {
            this.data = data;
        }
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
    public Integer get(int index) {
        MyNode x = head;
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        } else {
            for (int i = 0; i < index; i++) {
                x = x.next;
            }
        }
        return x.data;
    }

    @Override
    public Integer set(int index, Integer data) {
        MyNode current = head;
        Integer oldValue;
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        } else {
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            oldValue = current.data;
            current.data = data;
        }
        return oldValue;
    }

    @Override
    public boolean add(Integer data) {
        MyNode newNode = new MyNode(data);

        if (head == null) {
            head = last = newNode;
            head.prev = null;
            last.next = null;
        } else {
            last.next = newNode;
            newNode.prev = last;
            last = newNode;
            last.next = null;
        }
        size++;

        return true;
    }

    @Override
    public Integer remove(int index) {
        Integer data;
        MyNode current = head;
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        if(index == 0) {
            data = head.data;
            head = head.next;
            head.prev = null;
        } else if(index == size - 1) {
            data = last.data;
            last = last.prev;
            last.next = null;
        } else {
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
            data = current.data;
            current = null;
        }
        size--;

        return data;
    }

    @Override
    public void add(int index, Integer element) {

    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Integer> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

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
    public ListIterator<Integer> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Integer> listIterator(int index) {
        return null;
    }

    @Override
    public List<Integer> subList(int fromIndex, int toIndex) {
        return null;
    }

}
