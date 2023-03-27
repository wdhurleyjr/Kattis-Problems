import java.util.Scanner;
import java.util.Arrays;

public class abc {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        
        int [] num = new int[3];
        
        for(int i = 0; i < 3; i++) {
            num[i] = scan.nextInt();
        }
        Arrays.sort(num);
        
        String abc = scan.next();
        
        String [] a = abc.split("");
        
        if (a[0].equals("A")) {
            System.out.print(num[0] + " ");
            if (a[1].equals("B")) {
                System.out.print(num[1] + " " + num[2]);
            } else {
                System.out.print(num[2] + " " + num[1]);
            }
        } else if (a[0].equals("B")) {
            System.out.print(num[1] + " ");
            if (a[1].equals("A")) {
                System.out.print(num[0] + " " + num[2]);
            } else {
                System.out.print(num[2] + " " + num[0]);
            }
        } else if (a[0].equals("C")) {
           System.out.print(num[2] + " ");
            if (a[1].equals("A")) {
                System.out.print(num[0] + " " + num[1]);
            } else {
                System.out.print(num[1] + " " + num[0]);
            } 
        }
    }
}
