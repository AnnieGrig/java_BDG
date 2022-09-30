package homework_enum;

import java.util.Arrays;

public class Main_Enum {
    public static void main(String[] args) {
        System.out.println(countries());

    }

    public static String[] countries() {
        String countries = Arrays.toString(Countries.values());

        return new String[]{countries};
    }
}
