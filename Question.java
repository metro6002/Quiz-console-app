/**
 * Represents an individual quiz question.
 * Encapsulates the question identifier, question text, answer choices, and the correct answer.
 */
public class Question {
    private String opt1, opt2, opt3;
    private String question, answer;
    private int id;

    /**
     * Constructs a Question instance with the specified attributes.
     *
     * @param id       Unique ID of the question
     * @param question The question text
     * @param opt1     Option 1
     * @param opt2     Option 2
     * @param opt3     Option 3
     * @param answer   The exact text of the correct answer
     */
    public Question(int id, String question, String opt1, String opt2, String opt3, String answer) {
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.question = question;
        this.answer = answer;
        this.id = id;
    }



    public String getOpt1() {
        return opt1;
    }


    public void setOpt1(String opt1) {
        this.opt1 = opt1;
    }


    public String getOpt2() {
        return opt2;
    }


    public void setOpt2(String opt2) {
        this.opt2 = opt2;
    }


    public String getOpt3() {
        return opt3;
    }


    public void setOpt3(String opt3) {
        this.opt3 = opt3;
    }


    public String getQuestion() {
        return question;
    }


    public void setQuestion(String question) {
        this.question = question;
    }


    public String getAnswer() {
        return answer;
    }


    public void setAnswer(String answer) {
        this.answer = answer;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Question [Question=" + question + ", id=" + id + ", opt1=" + opt1 + ", opt2=" + opt2 + ", opt3="
                + opt3 + ", answer=" + answer + "]";
    }
    

}
