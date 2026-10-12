/**
 * Main application class and entry point.
 * Utilizes Java 25 features such as instance main methods and implicitly declared classes.
 */
class Main {

    // Instance main method serving as the application entry point
    void main() {
        IO.println();

        // Instantiate the service that manages quiz questions and flow
        QuestionService service = new QuestionService();

        // Start the interactive quiz session
        service.playQuiz();

        // Calculate and display the final score to the console
        service.printScore();
    }
}