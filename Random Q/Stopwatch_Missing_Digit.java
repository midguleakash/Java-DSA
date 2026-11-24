
import java.util.*;

public class Stopwatch_Missing_Digit {

    public static boolean isValidTime(String time) {

        int hours = Integer.parseInt(time.substring(0, 2));
        int minutes = Integer.parseInt(time.substring(3, 5));
        int seconds = Integer.parseInt(time.substring(6, 8));

        return hours >= 0 && hours <= 23
            && minutes >= 0 && minutes <= 59
            && seconds >= 0 && seconds <= 59;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String time = sc.nextLine();

        List<String> possibleTimes = new ArrayList<>();
        List<Integer> possibleDigits = new ArrayList<>();

        int index = time.indexOf('?');

        if (index == -1 || time.lastIndexOf('?') != index
                || time.length() != 8) {
            System.out.println("Invalid Input");
            return;
        }

        for (int digit = 0; digit <= 9; digit++) {

            StringBuilder sb = new StringBuilder(time);
            sb.setCharAt(index, (char) ('0' + digit));

            String candidate = sb.toString();

            try {
                if (isValidTime(candidate)) {
                    possibleDigits.add(digit);
                    possibleTimes.add(candidate);
                }
            } catch (NumberFormatException e) {
                // Ignore invalid input
            }
        }

        if (possibleTimes.isEmpty()) {
            System.out.println("No valid time");
            return;
        }

        System.out.println("Possible digits: " + possibleDigits);
        System.out.println("Minimum time: " + possibleTimes.get(0));
        System.out.println("Maximum time: "
                + possibleTimes.get(possibleTimes.size() - 1));
    }
}
