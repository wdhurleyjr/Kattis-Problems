import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter your full name: ");
    String input = scan.nextLine();
    String [] name = input.split(" ");
    int i;
    
    for(i = 0; i < name.length; i++) {
        String [] char_name = name[i].split("");
        System.out.print(char_name[0]);
    }
  }
}
