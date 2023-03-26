import java.util.Scanner;

public class different {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        
        do {
            long num1 = scan.nextLong();
            long num2 = scan.nextLong();
            long diff = Math.abs(num1 - num2);
            System.out.println(diff);
        } while (scan.hasNext());
    }
}
