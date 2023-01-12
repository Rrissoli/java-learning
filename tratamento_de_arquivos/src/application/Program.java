package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Program {
		public static void main(String[] args) {
			
			File file = new File("/home/user/in.txt");
			Scanner sc = null;
			try {
				sc = new Scanner(file);
				while(sc.hasNextLine()) {
					System.out.println(sc.nextLine());
				}
			}catch( IOException e) {
				System.out.println("Error: " + e.getMessage());
		}finally {
			if(sc != null) {
				sc.close();
			}
		}
			// agora vamos para o Filereader e buffereader
		String path = "/home/user/in.txt";
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(path);
			br =  new BufferedReader(fr);
			
			String line = br.readLine();
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}finally {
			try {
				if(br != null) {
					br.close();
				}	
				if(fr != null) {
					fr.close();
				}
			} catch (IOException e2) {
				e2.printStackTrace();
			}
			
		}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
}}
