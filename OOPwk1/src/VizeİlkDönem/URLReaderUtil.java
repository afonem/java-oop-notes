package VizeİlkDönem;

import java.net.URL;
import java.util.Scanner;

import Week9_1.GradeManager;

public class URLReaderUtil {

    public void readGradesFromURL(String urlAddress, GradeManager manager) {
        try {
            URL url = new URL(urlAddress);
            Scanner scanner = new Scanner(url.openStream());

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                int grade = Integer.parseInt(line);
                manager.addGrade(grade);
            }

            scanner.close();
        } catch (Exception e) {
            System.out.println("Error reading URL: " + e.getMessage());
        }
    }
}