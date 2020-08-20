package QuizApp;

import java.util.Scanner;

import QuizApp.Question;

public class APP {

	public static void main(String[] args) {
		
		String q1 = "What color are apples?\n" 
					+ "(a)red/green\n(b)orange\n(c)Magenta\n"; 
		String q2 = "What color are bananas?" 
					+ "(a)red/green\n(b)yellow\n(c)blue\n"; 
		String q3 = "Who is the president of your country?\n" 
				+ "(a)red/Kenyatta\n(b)Magufuli\n(c)Trump\n"; 
		
		
	Question [] questions = {	
			new Question(q1, "a"),
			new Question(q2, "b"),
			new Question(q3, "b")
			};
			takeTest(questions);
	}
	
	
	public static void takeTest(Question[] questions) {
	int score = 0;
	
	Scanner userInput= new Scanner(System.in);
	
	for(int i = 0; i<questions.length; i++) {
		System.out.println(questions[i].prompt);
		String answer= userInput.nextLine();
		if (answer.equals(questions[i].answer)) {
			score++;
		}
		
	}System.out.println("You got "+ score + " / "+questions.length);
}
	
	
}
