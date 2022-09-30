package homework_list;

public class TestGenericArrayList {
    public static void main(String[] args) {
        MyGenericArrayList<String> strings = new MyGenericArrayList<>();
        MyGenericArrayList<Integer> integers = new MyGenericArrayList<>();

        strings.add("Ani");
        strings.add("Gohar");
        strings.add("Lilit");

        System.out.println(strings.get(0));
        System.out.println(strings.remove(0));
        System.out.println(strings.get(0));
        System.out.println(strings.size());
        System.out.println(strings);


        integers.add(5);
        integers.add(10);
        integers.add(2,15);
        integers.add(3, 20);
        System.out.println(integers.size());
        System.out.println(integers);

    }
}
