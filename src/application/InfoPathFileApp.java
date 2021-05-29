package application;

import java.io.File;
import java.util.Scanner;

public class InfoPathFileApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("getName: " + path.getName()); //mostra o nome do file ignorando o caminho
		System.out.println("getParent: " + path.getParent()); //mostra o caminho ignorando o nome do file
		System.out.println("getPath: " + path.getPath()); //mostra todo o caminho 
		
		sc.close();
	}

}
