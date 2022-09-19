package homeworkBDGPrimitiveDataTypes;

public class GroupInteger {
    public static void main(String[] args) {
        byte a = 120;
        byte b = 8;
        System.out.println("a = " + a + "\nb = " + b);


        short c = 32568;
        short d = -30236;
        System.out.println("c = " + c + "\nd = " + d);


        int e = 889638786;
        int f = 78963465;
        System.out.println("e = " + e + "\nf = " + f);


        long g = 5698598544643546L;
        long h = 53258989746653L;
        System.out.println("g = " + g + "\nh = " + h);


        byte min = -128;
        byte max = 127;
        System.out.println("Byte min value is " + min + "\n max value is " + max);

        short min1 = -32768;
        short max1 = 32767;
        System.out.println("Short min value is " + min1 + "\n max value is " + max1);

        int min2 = -2_147_483_648;
        int max2 = 2_147_483_647;
        System.out.println("Int min value is " + min2 + "\n max value is " + max2);


        long min3 = -9_223_372_036_854_775_808L;
        long max3 = 9_223_372_036_854_775_807L;
        System.out.println("Long min value is " + min3 + "\n max value is " + max3);


        float j = 5.6963f;
        float k = 8.3f;
        System.out.println("j = " + j + "\nk = " + k);


        double l = 85.676533236548452963;
        double m = 84.98652446532468527523;
        System.out.println("l = " + l + "\nm = " + m);


        float min4 = Float.MIN_VALUE;
        float max4 = Float.MAX_VALUE;
        System.out.println("Float min value is " + min4 + "\n max value is " + max4);

        double min5 = Double.MIN_VALUE;
        double max5 = Double.MAX_VALUE;
        System.out.println("Double min value is " + min5 + "\n max value is " + max5);


        double myDouble = 34.567839023;
        float myFloat = 12.345f;
        float myFloat2 = 8923.1234857f;
        float myFloat3 = 3456.091f;

        char n = 'N';
        char o = 'O';
        System.out.println(n + " is n " + "\n" + o + " is o");


//        char s = 0x0037;
//        System.out.print("s = " + s);
//        System.out.println(s);
//
//        char w = 0x0031;
//        char w1 = 0x0030;
//        char w2 = 0x0039;
//        System.out.print("w = " + w);
//        System.out.print(w1);
//        System.out.println(w2);
//
//        char t = w2;
//        System.out.println("t = " + t);  panahjy lav chem haskanum, dra hamar 2 tarberakov em grum


        char s = 77;
        char w = 109;
        System.out.println("s = " + s);
        System.out.println("w = " + w);

        char t = 0x0039;
        System.out.println("t = " + t);

        boolean p = true;
        boolean q = false;
        System.out.println("p is " + p);
        System.out.println("q is " + q);

//        int year = 201l;
//        System.out.println(year);
//        java: incompatible types: possible lossy conversion from long to int,
//        qani vor int-in veragrum enq long tiv, casty sxal e linum

    }
}
