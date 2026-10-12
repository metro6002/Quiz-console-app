import java.util.Scanner;

/**
 * Service class responsible for handling question storage, taking user input, score calculation, and displaying results.
 */
public class QuestionService {

    // Predefined array holding quiz questions
    Question[] questions = new Question[5];

    // Array to store the user's answers for each question
    String[] selections = new String[5];

    /**
     * Initializes the service and populates questions with default trivia data.
     */
    public QuestionService() {
        questions[0] = new Question(1, "What language are we using now?", "Java", "C++", "Python", "Java");
        questions[1] = new Question(2, "int size?", "4bytes", "1byte", "3bytes", "4bytes");
        questions[2] = new Question(3, "double size?", "2bytes", "8bytes", "null", "8bytes");
        questions[3] = new Question(4, "default value of an empty String object?", "null", "empty", "null pointer", "null");
        questions[4] = new Question(5, "float size?", "20bytes", "4bytes", "6bytes", "4bytes");
    }

    /* public void displayQuestion() {
        for(Question q : questions) {
            //IO.println(q.getQuestion());
            IO.println(q.toString());
        }
    } */
    
    public void playQuiz() {
        
        IO.println("Choose the correct answer from the options given");

        int i = 0;
        // Prompt each question and collect the user's answer
        for(Question q : questions) {
            IO.println("Question No." + q.getId() + ": " + q.getQuestion());
            IO.println("Options");
            IO.println("1. " + q.getOpt1());
            IO.println("2. " + q.getOpt2());
            IO.println("3. " + q.getOpt3());
            IO.print("Your answer is: ");
            
            // Read the user's answer from standard input
            Scanner sc = new Scanner(System.in);
            selections[i] = sc.nextLine();
            IO.println();
            i++;
        }

        // Display a review of all selections entered by the user
        int x = 1;
        for (String s : selections) {
            IO.println(x + "." + s);
            x++;
        }
    }

    /**
     * Compares the user's recorded answers against the correct answers
     * and tallies the total score.
     *
     * @return Number of correctly answered questions
     */
    public int calculateScore() {
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            String ans = questions[i].getAnswer();
            String userAns = selections[i];

            if(userAns.equals(ans)) score++;  // Match user response directly against the correct answer text
        }
        return score;
    }

    public void printScore() {
        IO.println("Your score is: " + ((double) calculateScore() / questions.length) * 100 + "%");
    }

}