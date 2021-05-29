package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FilewriterBufferedApp {

	public static void main(String[] args) {
		
		String[] lines = new String[] {
				"TV LED,1290.99,1\n"
				+"Video Game Chair,350.50,3\n" 
				+ "IphoneX,900.00,2\n" 
				+ "Samsung Galaxy9,850.00,2"
				};

		String path = "C:\\temp\\wsEclipse\\saida.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) //true é para acrescentar escrita no final arquivo de referencia
		{
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
