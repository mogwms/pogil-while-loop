import java.util.Scanner;

public class WhileLoop {
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        int userInput = 1;
        int numCount = 0;

        while (userInput > 0) {
            System.out.println("Enter A Positive Or Negative Integer");
        userInput = input.nextInt();
        
        if (userInput > 0) {
            numCount++;
        } else {
            System.out.println("There are " + numCount + " positive numbers.");
        }
        }
    }
}