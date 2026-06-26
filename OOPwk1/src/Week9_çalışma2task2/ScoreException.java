package Week9_çalışma2task2;

public class ScoreException extends Exception{
	public ScoreException(double score) {
		super("score cannot be "+ score);
		
	}
	

}
