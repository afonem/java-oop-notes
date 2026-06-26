package FILE_I_and_O;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Try1 {

	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter("students.txt");
		 pw.println("Ali 80");
	        pw.println("Ayşe 65");
	        pw.println("Veli 45");

	        pw.close();
		Scanner sc = new Scanner(new File("students.txt"));
		int sum = 0;
		int count = 0;
		int max=0;
		String bestStudent="";
		  while(sc.hasNext()) {

	            String name = sc.next();
	            int grade = sc.nextInt();

	            // Her öğrenciyi yazdır
	            System.out.println(name + " -> " + grade);

	            sum += grade;
	            count++;

	            if(grade > max) {
	                max = grade;
	                bestStudent = name;
	            }
	        }

	        System.out.println("----------------");
	        System.out.println("sum = " + sum);
	        System.out.println("average = " + (double)sum / count);
	        System.out.println("highest grade = " + max);
	        System.out.println("best student = " + bestStudent);

	        sc.close();
	    }
	}
		