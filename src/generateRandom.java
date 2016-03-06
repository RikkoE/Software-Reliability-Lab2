import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Random;

public class generateRandom {

	public static void main(String[] args) throws IOException {
		generateRandom generator = new generateRandom();
		generator.genRandom();

	}
	
	public void genRandom() throws IOException {
		int numberOftests = 300;
		Random rand = new Random();
		
		File fout = new File("random_output.txt");
		FileOutputStream fos = new FileOutputStream(fout);
	 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
	 
		
		for(int i = 0; i < numberOftests; i++) {
			int[] array = new int[20];

			for (int j = 0; j < array.length; j++) {
				array[j] = rand.nextInt(100);
			}
			
			String str = Arrays.toString(array);
			str = str.replace(",", "");
			str = str.replace("[", "");
			str = str.replace("]", "");
			
			bw.write(str);
			bw.newLine();
		}
		
		bw.close();
	}

}
