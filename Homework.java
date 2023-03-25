import java.util.Scanner;

public class heimavinna {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        
        int counter = 0;
    
        String input = scan.next();
    
        String [] split_input = input.split(";");
    
        for (int i = 0; i < split_input.length; i++) {
            String [] split_char = split_input[i].split("-");
            if (split_char.length > 1) {
                Integer num1 = Integer.valueOf(split_char[0]); 
                Integer num2 = Integer.valueOf(split_char[1]);
                for (int j = num1; j <= num2; j++) {
                    counter++;
                }
            } else {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
