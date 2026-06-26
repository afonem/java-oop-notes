package Week9_1;

public class InvalidGradeException extends Exception{
public InvalidGradeException(double grade){
	super("böyle not olmaz" + grade);
	
	
}
}
