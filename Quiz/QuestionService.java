import java.util.Scanner;

public class QuestionService {
    
    private final Question[] questions = new Question[5];
    private final String[] selection = new String[5];
    Scanner sc = new Scanner(System.in);

    public QuestionService() {
        questions[0] = new Question(1, "What is the size of int?", new String[]{"1", "4", "2", "8"}, "4");
        questions[1] = new Question(2, "What is the size of double?", new String[]{"1", "4", "2", "8"}, "8");
        questions[2] = new Question(3, "What is the size of char?", new String[]{"1", "4", "2", "8"}, "2");
        questions[3] = new Question(4, "What is the size of long?", new String[]{"1", "4", "2", "8"}, "8");
        questions[4] = new Question(5, "What is the size of boolean?", new String[]{"1", "4", "2", "8"}, "1");
    }
    
    public void playQuiz() {
        for (int i = 0; i < questions.length; i++) {
            Question q = questions[i];
            System.out.println("Question no: " + q.getId());
            System.out.println(q.getQuestion());

            String[] options = q.getOptions();
            for (int j = 0; j < options.length; j++) {
                System.out.println((j + 1) + ". " + options[j]);
            }

            String userAnswer;
            do {
                System.out.print("Enter your answer (1-4): ");
                userAnswer = sc.next();
            } while (!isValidAnswer(userAnswer));

            selection[i] = options[Integer.parseInt(userAnswer) - 1];
        }
    }

    private boolean isValidAnswer(String answer) {
        try {
            int num = Integer.parseInt(answer);
            return num >= 1 && num <= 4;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public void printScore() {
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            if (questions[i].getAnswer().equals(selection[i])) {
                score++;
            }
        }
        System.out.println("Your score is: " + score + "/" + questions.length);
        sc.close();
    }
}
