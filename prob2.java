import java.util.Scanner;

public class SimpleWordCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Prompt user for input
        System.out.println("Enter a text:");

        // Step 2: Read the input text and store it in a string
        String input = scanner.nextLine();

        // Step 3: Split the string into an array of words
        String[] words = input.split("\\s+");

        // Step 4: Initialize a counter variable
        int wordCount = 0;

        // Step 5: Iterate through the array of words and increment the counter
        for (String word : words) {
            if (!word.isEmpty()) { // Ignore empty strings
                wordCount++;
            }
        }

        // Step 6: Display the total count of words
        System.out.println("Total words: " + wordCount);

        scanner.close();
    }
}

