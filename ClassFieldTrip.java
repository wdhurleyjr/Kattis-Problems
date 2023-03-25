import java.util.Scanner;
import java.util.Arrays;

public class classfieldtrip {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        
        String input1 = scan.next();
        String input2 = scan.next();
        
        String combined = input1 + input2;
        
        String [] array = combined.split("");
        
        Arrays.sort(array);
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}
