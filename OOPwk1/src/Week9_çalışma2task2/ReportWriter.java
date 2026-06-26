package Week9_çalışma2task2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ReportWriter {
	public  void writeReport(String fileName,ScoreManager manager ) throws IOException {
		try(PrintWriter pw = new PrintWriter(new FileWriter(fileName))){
			pw.println("scores :  " + manager.getScores() );
			pw.println("scores :  " + manager.getMin());
			pw.println("scores :  " + manager.getMax() );
			pw.println("scores :  " + manager.calculateAverage());
		}
		
	}

}
