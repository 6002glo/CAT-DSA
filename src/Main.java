//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Print a welcome message
        System.out.printf("Hello and welcome!\n");

        int sum = 0; // Initialize a variable to hold the sum

        // Loop from 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
            sum += i; // Add the current value of i to sum
        }

        // Print the total sum
        System.out.println("The sum of numbers from 1 to 5 is: " + sum);
    }
}