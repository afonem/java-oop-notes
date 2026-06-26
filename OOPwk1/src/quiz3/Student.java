package quiz3;

public class Student extends Course implements Evaluate{
	private String courseName;
	
	private double midtermScore;
	private double finalExamScore;
	private int absence;
	public Student(int id, String name ,String courseName , double midtermScore, double finalExamScore, int absence) {
		super(id, name);
		this.courseName = courseName;
		this.midtermScore = midtermScore;
		this.finalExamScore = finalExamScore;
		this.absence = absence;
	}
	@Override
	public void displayInfo() {
		System.out.println(name);
		System.out.println(id);
		System.out.println("Coursename "+courseName );
		System.out.println("midtermscore== " + midtermScore);
		System.out.println("finalExam score== " + finalExamScore);
		System.out.println("absence =  " + absence);
		
		
		
	}
	@Override
	public double calculateFinalScore() {
		double FinalScore =((midtermScore*40+finalExamScore*60)/100);
		return FinalScore;
		
	}
	@Override
	public boolean isPassed() {
		double FinalScore =((midtermScore*40+finalExamScore*60)/100);
		if(FinalScore<60) {
			return false;
			
		}
		
		
			
		return true;
		
	}
	

}
