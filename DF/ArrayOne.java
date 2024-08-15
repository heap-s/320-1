import java.util.HashMap;
public class ArrayOne {
   public static void main(String[] args) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        HashMap<String, String> dayMap = new HashMap<String, String>();
        dayMap.put(days[0], "Some Task");

        System.out.println(dayMap.get("Sunday"));
   } 
}
