package Week9_1;

public class Test {
    public static void main(String[] args) {

        String url = "https://raw.githubusercontent.com/TestTest010601/Test/main/grades.txt";
        String fileName = "Report.txt";

        GradeManager manager = new GradeManager();
        URLReaderUtil reader = new URLReaderUtil();
        ReportWriter writer = new ReportWriter();

        try {
            reader.readGradesFromURL(url, manager);
            writer.writeReport(fileName, manager);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}