package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
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
			// agora vamos para o bloco try resources
			// é basicamente um bloco try que declara um ou mais recursos, e garante que esses recursos serão fechados ao final do bloco
			
			String path2 = "/home/user/in.txt";
			
			try (BufferedReader br2 = new BufferedReader(new FileReader(path2))){
				String line2 = br2.readLine();
				while(line2 != null) {
					System.out.println(line2);
					line2 = br2.readLine();
				}}
				catch(IOException e) {
					System.out.println("Error: " + e.getMessage());
				}
			// vamo ver agora o FileWritter (Stream de escrita de caracteres em arquivos)
			// Cria/Recria o arquivo: new FileWritter(path)
			// Acrescenta ao arquivo existente: new FileWritter(path, true)
			// BufferedWriter (mais rapido)
			String[] lines = new String[] { "Good mornning", "Good afternoon", "Good nigth"};
			String path3 = "/home/user/criado.txt";
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(path3))){
				for(String line : lines) {
					bw.write(line);
					bw.newLine();
				}
			} catch (IOException e2) {
				e2.printStackTrace();
			}
			
			
		}
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
}}
