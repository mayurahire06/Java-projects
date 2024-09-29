public class Question {
    private final int id;
    private final String question;
    private final String[] options;
    private final String answer;

    public Question(int id, String question, String[] options, String answer) {
        this.id = id;
        this.question = question;
        this.options = options;
        this.answer = answer;
    }

    public int getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getOptions() {
        return options;
    }

    public String getAnswer() {
        return answer;
    }

    @Override
    public String toString() {
        return "Question [id=" + id + ", question=" + question + ", options=" + String.join(", ", options) 
               + ", answer=" + answer + "]";
    }
}
