package FILE_I_and_O;
import java.io.*;
import java.io.PrintWriter;
import java.util.Scanner;


public class Sos {

	public static void main(String[] args) throws Exception {
		PrintWriter pw = new PrintWriter("Students2");
		pw.println("Ahmet,100");
		pw.println("Zeynep,92");
		pw.println("Mehmet,45");
	pw.println("Ayşe,88");
		pw.println("Burak,60");
		pw.println("Elif,95");
		pw.close();
		Scanner sc = new Scanner(new File("Students2"));
		while(sc.hasNextLine()) {
			String Line = sc.nextLine();
			
			String[] parts = Line.split(",");
			String name = parts[0].trim();
			int grade = Integer.parseInt(parts[1].trim());
			System.out.println("name = " + name +"  ,  "+ "grade = "+grade);
			
			
		}
		sc.close();
		
		

	}

}
