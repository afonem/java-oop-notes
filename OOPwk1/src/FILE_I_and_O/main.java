package FILE_I_and_O;
import java.io.*;

public class main {

    public static void main(String[] args) throws Exception {
    	FileWriter fw = new FileWriter("numbers.txt");
    	BufferedWriter bw= new BufferedWriter(fw);
    	int a= 10;
    	int b = 20;
    	int c = 30 ;
    	bw.write(String.valueOf(a));
    	bw.newLine();

    	bw.write(String.valueOf(b));
    	bw.newLine();

    	bw.write(String.valueOf(c));
    	bw.close();
    	

    	FileReader fr = new FileReader("numbers.txt");

    	BufferedReader br = new BufferedReader(fr);
        int sum = 0;

        String line;

        while((line = br.readLine()) != null)
        {
            sum += Integer.parseInt(line);
        }

        System.out.println(sum);

        br.close();
    }

	
		
	}
