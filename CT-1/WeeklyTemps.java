import java.util.ArrayList;
import java.util.Scanner;

public class WeeklyTemps {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> days = new ArrayList<String>(
                java.util.Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));

        ArrayList<Integer> temps = new ArrayList<Integer>(
                java.util.Arrays.asList(77, 83, 62, 78, 92, 88, 79));

        int avg = 0;

        for (int temp : temps) {
            avg += temp;
        }

        avg = avg / temps.size();

        String dayOrWeek = scan.next();
        scan.close();

        if (dayOrWeek.equals("Monday")) {
            System.out.println(days.get(0) + " " + temps.get(0));
        } else if (dayOrWeek.equals("Tuesday")) {
            System.out.println(days.get(1) + " " + temps.get(1));
        } else if (dayOrWeek.equals("Wednesday")) {
            System.out.println(days.get(2) + " " + temps.get(2));
        } else if (dayOrWeek.equals("Thursday")) {
            System.out.println(days.get(3) + " " + temps.get(3));
        } else if (dayOrWeek.equals("Friday")) {
            System.out.println(days.get(4) + " " + temps.get(4));
        } else if (dayOrWeek.equals("Saturday")) {
            System.out.println(days.get(5) + " " + temps.get(5));
        } else if (dayOrWeek.equals("Sunday")) {
            System.out.println(days.get(6) + " " + temps.get(6));
        } else if (dayOrWeek.equals("week")) {
            for (int i = 0; i < temps.size(); i++) {
                System.out.println(days.get(i) + " " + temps.get(i));
            }
            System.out.println("Weekly average: " + avg);
        }else{
            throw new IllegalArgumentException("Invalid input: " + dayOrWeek);
        }
    }
}
