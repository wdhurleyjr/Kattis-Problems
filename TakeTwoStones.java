import java.util.Scanner;

public class twostones {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
    
        int n = scan.nextInt();
        
        if (n % 2 == 0) {
            System.out.println("Bob");
        } else {
            System.out.println("Alice");
        }
    }
}
