package Week9_çalışma2task2;

import java.io.IOException;
import java.io.*;

public class main {

	public static void main(String[] args) {
		ScoreManager ab = new ScoreManager();
		ReportWriter hz= new ReportWriter();
		try {
		ab.addScore(85);
		ab.addScore(-5);
		ab.addScore(90);
		ab.addScore(70);
		} catch(ScoreException a) {
			System.out.println(a.getMessage());
		}
		 try {
		        hz.writeReport("Report.txt", ab);
		    } catch (IOException e) {
		        System.out.println("Dosya hatası: " + e.getMessage());
		    }
		}
		
		

	}


// ScoreManager ve ReportWriter nesnesi oluştur
//try-catch içinde:
//85, -5, 90, 110, 70 ekle
//writeReport() çağır
//catch: ScoreException ve IOException ayrı yakala