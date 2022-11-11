package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double xA, xB,xC, yA, yB, yC;
		System.out.println("Enter the measures of triangule X:");
		xA = sc.nextInt();
		xB = sc.nextInt();
		xC = sc.nextInt();
		System.out.println("Enter the measures of triangule Y:");
		yA = sc.nextInt();
		yB = sc.nextInt();
		yC = sc.nextInt();

		double p = (xA + xB + xC)/2.0;
		double areaX = Math.sqrt(p * (p -xA) * (p - xB) * (p-xB));
		p = (yA + yB + yC)/2.0;
		double areaY = Math.sqrt(p * (p -yA) * (p - yB) * (p-yB));


		System.out.println("Triangule X area: " + areaX);
		System.out.println("Triangule X area: " + areaY);

		if(areaX > areaY){
			System.out.println("maior" + areaX);
		}else{
			System.out.println("maior" + areaY);
		}


		sc.close();
	}
}
