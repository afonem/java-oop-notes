package Week9_1;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class URLReaderUtil {

    public void readGradesFromURL(String urlAddress, GradeManager manager) {
        try {
            URL url = new URL(urlAddress);
            Scanner scanner = new Scanner(url.openStream());

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
               if(!line.isEmpty()) {
            	   int grade = Integer.parseInt(line);
            	   manager.addGrade(grade);
               }
            }
        
            scanner.close();
        } catch (Exception e) {
            System.out.println("Error reading URL: " + e.getMessage());
        }
    }
}
   

    
