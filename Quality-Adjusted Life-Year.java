import java.util.Scanner;

public class qaly {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        
        int periods = scan.nextInt();
        int count = periods;
        
        double avgsumofinput = 0;
        
        while(count > 0) {
            
            double input1 = scan.nextDouble();
            double input2 = scan.nextDouble();
            
            double math = input2 * input1;
            
            avgsumofinput += math;
            
            count--;
        }
        System.out.println(avgsumofinput);
    }
}
