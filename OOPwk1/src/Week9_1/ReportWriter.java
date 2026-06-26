package Week9_1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ReportWriter {

    public void writeReport(String fileName, GradeManager manager) throws IOException {

        try (PrintWriter output = new PrintWriter(new FileWriter(fileName))) {

            output.println("Grades: " + manager.getGrades());

            for (int g : manager.getGrades()) {
                output.print(g + " ");
            }
            output.println();

            output.println("Average: " + manager.calculateAverage());
            output.println("Max: " + manager.getMax());
            output.println("Min: " + manager.getMin());
        }
    }
}