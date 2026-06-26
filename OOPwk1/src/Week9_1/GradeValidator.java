package Week9_1;

public class GradeValidator {
    
    
    public void checkGrade(double grade) throws InvalidGradeException {
        
        if (grade < 0 || grade > 100) {
          
            throw new InvalidGradeException(grade);
        }
        
        System.out.println("Grade " + grade + " is valid");
    }
}