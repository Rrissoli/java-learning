package application;

import java.io.File;
import java.util.Scanner;

public class Programa22 {
	public static void main(String[] args) {
	// vamos manipular pastas agora 
	Scanner sc2= new Scanner(System.in);
	System.out.println("Enter a folder path: ");
	String strPath =  sc2.nextLine();
	File path4 = new File(strPath);
	File[] folders  = path4.listFiles(File::isDirectory);
	for (File folder : folders) {
		System.out.println(folder);
	}
	
	
	
	
	sc2.close();
	}
}
