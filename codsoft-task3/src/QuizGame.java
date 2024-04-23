import java.util.Scanner;

public class QuizGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        int totalQuestions = 3;
        String[][] questions = {

            {"What is the capital of France? ", "Paris", "London", "Rome", "Berlin"},
            {"What is the largest planet in our solar system? ", "Jupiter", "Saturn", "Mars", "Earth"},
            {"What is the smallest country in the world? ", "Vatican City", "Monaco", "San Marino", "Liechtenstein"}
        };

        for (int i = 0; i < totalQuestions; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i][0]);
            String[] options = {questions[i][1], questions[i][2], questions[i][3], questions[i][4]};
            System.out.println("Select the correct option:");

            for (int j = 0; j < options.length; j++) {
                System.out.println((j + 1) + ". " + options[j]);
            }

            System.out.print("Enter your answer (1-" + options.length + "): ");
            int answer = scanner.nextInt();
            System.out.println("Starting timer...");
            
            try {
                Thread.sleep(10000); // 10 seconds timer

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (options[answer - 1].equals(questions[i][1])) {
                System.out.println("Correct answer!");
                score++;

            } else {
                System.out.println("Incorrect answer. The correct answer is: " + questions[i][1]);
            }

            System.out.println("Your current score is: " + score);
            System.out.println("-----------------------------------");
        }

        System.out.println("Your final score is: " + score + " out of " + totalQuestions);
        scanner.close();
    }

}