import java.util.Scanner;

public class Loop {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        float curr;
        float min = Float.MAX_VALUE; // set this to max value so that initial current element will always be lower than it
        float max = Float.MIN_VALUE; // similar logic as above
        float total = 0;

        for (int i = 0; i < 10; i++){
            curr = scan.nextFloat();
            scan.close();
            total += curr;

            if (curr > 100.0 || curr < 0){
                System.out.println("Grades cannot be greater than 100.0");
                throw new IllegalArgumentException("Number out of range: " + curr);
            }
            else if(curr <= min){
                min = curr;
            }
            else if (curr >= max){
               max = curr;
            }
        }
        float average = total / 10;
        System.out.println("The average is: " + average);
        System.out.println("The minimum score is: " + min);
        System.out.println("The maximum score is: " + max);

    }
}

