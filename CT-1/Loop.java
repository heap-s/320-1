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
            System.out.println(i);
            total += curr;
            if(curr <= min){
                min = curr;
            }
            if (curr >= max){
               max = curr;
            }
        }
        System.out.println(min);
        System.out.println(max);
        System.out.println(total);

    }
}

