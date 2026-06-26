package Week9_1;

public class TestGradeValidator {

    public static void main(String[] args) {

        GradeValidator validator = new GradeValidator();

        try {
            validator.checkGrade(35);
            validator.checkGrade(-5);
            validator.checkGrade(60);
        } catch (InvalidGradeException e) {
            System.out.println(e.getMessage());
        }
    }
}