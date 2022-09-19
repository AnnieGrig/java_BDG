package homeworkBDG_String_StringBuilder;

import javax.print.DocFlavor;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Objects;

public class String_StringBuilder {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        concatHelloWorldString(str1, str2);
        StringBuilder str3 = new StringBuilder("Hello");
        StringBuilder str4 = new StringBuilder(" World");
        concatHelloWorldStringBuilder(str3, str4);


        String sentence = "We are living in";
        System.out.println(apartedSenense(sentence));

        StringBuilder rev = new StringBuilder("sample");
        System.out.println(reverseString(rev));

        String line = "We are living in an yellow submarine. We don't have anything";
        String token = "in";

        System.out.println(countSubString(line, token));

        String stringToUpperCase = "hello world";
        stringToUpper(stringToUpperCase);


        StringBuilder builder = new StringBuilder("hello world");
        toUpperCase(builder);
        System.out.println(builder);


        StringBuilder k = new StringBuilder(20);
        k = new StringBuilder("A r m e n i a ");
        printSimbols(k);

        String line2 = "We are living in an yellow submarine. We don't have anything";
        String line3 = "";
        deleteA(line2);

        StringBuilder line4 = new StringBuilder();
        line4 = new StringBuilder("We are living in an yellow submarine. We don't have anything");
        String strings = "";
        deleteAStringBuilder(line4);

        String sentence2 = "We are living in an yellow submarine. We don't have anything";
        System.out.println(repleceA(sentence2));

        String sentence3 = "We are living in an yellow submarine. We don't have anything";
        System.out.println(theLongestWord(sentence3));

        StringBuilder sentence4 = new StringBuilder("We are living in an yellow submarine. We don't have anything");
        System.out.println(firstMeet(sentence4));

        String myString = "We don't have anything";
        int number = 6;
        printPartOfString(myString, number);

        StringBuilder myString2 = new StringBuilder("We don't have anything");
        int number2 = 5;
        printPartOfStringBuilder(myString2, number2);

        String emptyOrNull = "Is not empty or null!!!";
        isEmptyOrNull(emptyOrNull);

        String sentence5 = "We, are, living, in an, yellow, submarine. We, don't, have_anything";
        System.out.println(theLongestWord2(sentence5));

    }


    /**
     * @param str1
     * @param str2
     * @author Ani
     */
    public static void concatHelloWorldString(String str1, String str2) {
        System.out.println(str1 + " " + str2);
        System.out.println(1 + 2 + " " + str1);
        System.out.println("1" + " " + 2 + " " + str1);
        System.out.println(str1 + " " + 1 + 2 + " " + str2);
    }

    /**
     * @param str3
     * @param str4
     * @author Ani
     */
    public static void concatHelloWorldStringBuilder(StringBuilder str3, StringBuilder str4) {
        System.out.println(str3.append(str4));
        System.out.println(1 + 2 + " " + str3);
        System.out.println("1" + " " + 2 + " " + str3);
        System.out.println(str3 + " " + 1 + 2 + " " + str4);
    }

    /**
     * @param sentence
     * @author Ani
     */
    public static String apartedSenense(String sentence) {
        return (sentence.replace(' ', '\n'));
    }


    public static StringBuilder reverseString(StringBuilder rev) {
        StringBuilder result = rev.reverse();
        return result;
    }

    /**
     * @param line
     * @param token
     * @return count
     * @author Ani
     */
    public static int countSubString(String line, String token) {
        int count = 0;
        String[] str = line.split(" ");
        for (int i = 0; i < str.length; i++) {
            if (str[i].contains(token)) {
                count++;
            }
        }
        return count;
    }

    public static void stringToUpper(String line) {
        System.out.println(line.toUpperCase());
    }


    public static void toUpperCase(StringBuilder builder) {
        for (int i = 0; i < builder.length(); i++) {
            if (Character.isLowerCase(builder.charAt(i))) {
                builder.setCharAt(i, Character.toUpperCase(builder.charAt(i)));
            }
        }
    }


    /**
     * @param k
     * @author Ani
     */
    public static void printSimbols(StringBuilder k) {

        for (int i = 0; i < k.length(); i++) {
            if (k.length() < 20) {
                k.append("*");
            }
        }
        System.out.println(k);
    }


    /**
     * @param line2
     * @author Ani
     */
    public static void deleteA(String line2) {
        String line3 = "";
        for (int i = 0; i < line2.length(); i++) {
            if (line2.charAt(i) != 'a') {
                line3 += line2.charAt(i);
            }
        }
        System.out.println(line3);
    }


    /**
     * @param line4
     * @author Ani
     */
    public static void deleteAStringBuilder(StringBuilder line4) {
        String strings = "";
        for (int i = 0; i < line4.length(); i++) {
            if (line4.charAt(i) != 'a') {
                strings += line4.charAt(i);
            }
        }
        System.out.println(strings);
    }


    /**
     * @param sentence
     * @return repleceA
     * @author Ani
     */
    public static String repleceA(String sentence) {
        return (sentence.replace('a', '*'));
    }


    /**
     * @param sentence3
     * @return the Longest word
     * @author Ani
     */
    public static String theLongestWord(String sentence3) {
        String[] words = sentence3.split(" ");
        String max = words[0];
        for (int i = 0; i < words.length - 1; i++) {
            if (words[i].length() > max.length()) {
                max = words[i];
            }
        }
        return max;
    }

    /**
     * @param sentence4
     * @return firtsMeet indexOf("a")
     * @author Ani
     */
    public static int firstMeet(StringBuilder sentence4) {
        return sentence4.indexOf("a");
    }

    /**
     * @param myString
     * @param number
     * @author Ani
     */
    public static void printPartOfString(String myString, int number) {
        System.out.println(myString.substring(0, number));
    }

    /**
     * @param myString2
     * @param number2
     * @author Ani
     */
    public static void printPartOfStringBuilder(StringBuilder myString2, int number2) {
        System.out.println(myString2.substring(0, number2));
    }

    /**
     * @param emptyOrNull
     * @author Ani
     */
    public static void isEmptyOrNull(String emptyOrNull) {
        if (Objects.equals(emptyOrNull, "")) {
            System.out.println("String is empty");
        } else if (emptyOrNull == null) {
            System.out.println("String is null");
        } else {
            System.out.println("String is not empty or null");
        }
    }


    /**
     * @param sentence5
     * @return
     * @author Ani
     */
    public static String theLongestWord2(String sentence5) {
        String[] words = sentence5.split(" ");
        String max = words[0];
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > max.length()) {
                max = words[i];
            }
        }
        return max;
    }

}


