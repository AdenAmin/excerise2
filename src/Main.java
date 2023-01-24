//Aden Amin 01/24
//CSCI 1660

public class Main {
    public static void main(String[] args) {
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "wednesday", "thursday", "friday", "saturday"};
        int[] highTemperatures = {45, 29, 10, 22, 41, 28, 33};
        int[] precipitationProbabilities = {95, 60, 25, 5, 0, 75, 90};

        for (int i = 0; i < highTemperatures.length; i++) {
            if (precipitationProbabilities[i] >= 50 && highTemperatures[i] < 32) {
                System.out.printf("It will snow on %s.%n", daysOfWeek[i]);
            }
        }
    }
}