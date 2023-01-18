package src.application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa22 {
	public static void main(String[] args) {
	// vamos manipular pastas agora 
	Scanner sc2= new Scanner(System.in);
//	System.out.println("Enter a folder path: ");
//	String strPath =  sc2.nextLine();
//	File path4 = new File(strPath);
//	File[] folders  = path4.listFiles(File::isDirectory);
//	for (File folder : folders) {
//		System.out.println(folder);
//	}
//	//agora só os arquivos 
//	File[] files = path4.listFiles(File::isFile);
//	for (File file : files) {
//		System.out.println(file);
//	}
//	// criando um subdiretório
//	boolean sucess = new File(strPath + "/subDir").mkdir();
//	System.out.println("Directory created sucessfully " + sucess);
	// exercicio
	
	List<Product> list2 = new ArrayList<>();
	
	System.out.println("Enter file path: ");
	String sourceFileStr = sc2.nextLine();
	
	File path6 = new File(sourceFileStr);
	String FolderStr = path6.getParent();
	boolean sucess = new File(FolderStr + "/out3").mkdir();
	System.out.println("Create:" + sucess);
	String targetFileStr = FolderStr + "/out3/summary.csv";
	try (BufferedReader bw = new BufferedReader(new FileReader(sourceFileStr))){
		String itemCsv = bw.readLine();
		while(itemCsv != null) {
			String[] fields = itemCsv.split(",");
			String name = fields[0];
			double price = Double.parseDouble(fields[1]);
			int qtd = Integer.parseInt(fields[2]);
			Product product = new Product(name, price, qtd);
			list2.add(product);
			itemCsv = bw.readLine();
		}
		
		try (BufferedWriter rb = new BufferedWriter(new FileWriter(targetFileStr))){
			for (Product product : list2) {
				rb.write(product.getName() + ',' + product.total());
				rb.newLine();
			}
		} catch (Exception e) {
			System.out.println("Error: writinng file: " + e.getMessage());
		}
		
	} catch (IOException e) {
		// TODO: handle exception
		System.out.println("Error: writinng file: " + e.getMessage());
	}
	
	sc2.close();
	}
}
