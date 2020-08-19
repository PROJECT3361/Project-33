# Project-33
a simple Quiz system
public class App {

	public static void main(String[] args) {
		
		String q1 = "What color are apples?\n" 
					+ "(a)red/green\n(b)orange\n(a)Magenta\n"; 
		String q2 = "What color are bananas?\n" 
					+ "(a)red/green\n(b)yellow\n(a)blue\n"; 

		
		
	Question [] questions = {	
			new Question(q1, "a"),
			new Question(q2, "b")
			
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
