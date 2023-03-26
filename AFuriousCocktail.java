import java.util.Scanner;
import java.util.Arrays;

public class cocktail {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        
        int number_of_potions = scan.nextInt();
        int seconds = scan.nextInt();
        
        int [] array = new int [number_of_potions];
        
        for(int i = 0; i < number_of_potions; i++) {
            int potion_duration = scan.nextInt();
            array[i] = potion_duration;
        }
        Arrays.sort(array);
        
        if (array[number_of_potions -1] > (seconds * (array.length -1))) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
