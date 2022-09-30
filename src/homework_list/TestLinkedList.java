package homework_list;

public class TestLinkedList {
    public static void main(String[] args) {
        MyCustomLinkedList test = new MyCustomLinkedList();
        test.add(5);
        test.add(8);
        test.add(10);
        test.add(19);
        test.add(11);
        test.add(9);
        System.out.println(test.size());

        System.out.println(test.get(2));

        test.set(2, 3);
        System.out.println(test.get(2));

        System.out.println(test.remove(0));

    }
}
