package lesson5;

public class Lesson5Ex3 {
    public static void main(String[] args) {
        String[] seasons = {"Winter", "Spring", "Summer", "Autumn"};
        String rain = "Rain";
        boolean isFound = false;
        for (int i = 0; i < seasons.length; i++) {
            if (rain == seasons[i]) {
                isFound = true;
            }
        }

        if (isFound == true) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found");
        }
    }
}

