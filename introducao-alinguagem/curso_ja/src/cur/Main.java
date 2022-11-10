package cur;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[]args) {
		int idade = 35; //só posso armazenar numeros inteiros, pode ser o long também
		double altura = 16.782325; //só posso armazenar numeros quebrados(float)
		char sexo = 'F'; //só posso armazenar apenas um caráctere
		
		
		System.out.println(altura);
		System.out.println(idade);
		System.out.println(sexo);
		System.out.printf("%.2f%n",altura);
		System.out.printf("%.4f%n",altura);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n",altura);

		// Concatenação 
		System.out.println("tenho" + " " + altura + " " + "metros");
		System.out.printf("RESULTADO =  %.2f metros%n", altura);
		//.2f é substituido pela variavel
		String nome = "Raphael";
		int idadee = 23;
		double renda = 4.000;
		System.out.printf("%s tem %d anos e ganha R$ %.3f reais %n", nome, idadee , renda);
		// uso de marcadores ===>> 
		//%f -> ponto flutuante
		// %d --> inteiros
		// %s --> texto
		// %n --> quebra de linha 

		// EXERCÌCIO DE FIXAÇÂO
		String product1 = "computer";
		String product2 = "Office desk";

		int age = 30;
		int code = 5290;
		char gender = 'F';
		

		double price1 = 2100.0;
		double price2 = 650.0;
		double mensure = 53.2345767;
		Locale.setDefault(Locale.UK);
		System.out.println("Products");
		System.out.printf("%s, which price is $ %.2f %n", product1, price1);
		System.out.printf("%s, which price is $ %.2f %n", product2, price2);
		System.out.printf("Record: %d years old, code %d and gender: %s %n", age, code, gender);
		System.out.printf("Measue wich eight decimal places: %f %n", mensure);
		System.out.printf("Rouded(three decimal places ): %.3f %n", mensure);
		System.out.printf("US decimal point:: %.3f %n", mensure);
		



		//PROCESSAMENTO DE DADOS 
		// comando de atribuição ==> 
		// Sintaxe = <variavel> = <expressão>;
		// esse "=" lê se ele como um "recebe-se"
		// a expressão é calculada
		// e o resultado é armazenado na variavel
		//exemplo
		int x, y;
		x= 7;
		y = x * 7;
		System.out.println(y);
//ou
		int r;
		double e;
		r= 7;
		e = x * 7;
		System.out.println(e);

		// agora com uma expressão maior 
		// área de um trapézio
		double b, B, h, area;
		b = 6;
		B = 8;
		h = 5;
		area = ((b + B) / 2)* h;
		System.out.println(area); 


		// Casting ou conversão de tipos de dados 

		int f, g;
		double result;
		f = 2;
		g = 5;
		result =  (double) f / g;
		System.out.println(result);
		// você acrscenta "(tipoEscolhido)" , como vemos acima , sem double iria dar 0.0
		// com double ele vira decimais == 0.4
		//ou dessa maneira quando queremos transformar uma variavel d um tipo em outro 
		double a;
		int i;
		a = 7;
		i = (int) a;
		System.out.println(i);




		//ENTRADA DE DADOS 
		// Scanner , criar um obj chamado Scanner
		//Lendo textos
		Scanner sc = new Scanner(System.in);

		String fala;
		fala = sc.next();
		
		System.out.println("você digitou: " + fala);

		//Lendo numeros inteiros

		int iidade;
		System.out.println("qual é sua idade?");
		iidade = sc.nextInt();
 		System.out.println("Sua idade é: " + iidade);

		//Lendo numero com ponto flutuante

		double aaltura;
		System.out.print("qual sua altura:");
		aaltura = sc.nextDouble();
		System.out.printf("sua altura é: %f %n", aaltura);
		// ponto importqante =  ele pega a localização do computador , portanto se quer muda tem q colocar o LOCALE


		//LENDO VARIALVEL TIPO CHAR

		char we ;
		System.out.print("qual seu sexo?");
		we = sc.next().charAt(0);
		System.out.printf("Sexo do tipo %s %n", we);

		//Lendo varios dados na mesma linha
		String po;
		double qw;
		int re;
		po = sc.next();
		qw = sc.nextDouble();
		re = sc.nextInt();
		System.out.printf("%s %f %d %n", po , qw, re);

		// Lendo o texto ate a quebra de linha (dar o enter)
		// toma cuidado com quebra de LINHA PENDENTE 
		// acionamos um inteiro ali em cima , assim fazemos um nextline() extra
		//para consumir a quebra de linha pendente 
		// antes do dados que queremos damos um nextline() extra  

		String name, country, tel;

		System.out.printf("seu nome? %n");
		sc.nextLine();
		name =  sc.nextLine();
		System.out.printf("nome é : %s %n", name);
		System.out.printf("seu estado? %n");
		country = sc.nextLine();
		System.out.printf("nome é : %s %n", country);
		System.out.printf("seu telefone? %n");
		tel = sc.nextLine();
		System.out.printf("nome é : %s %n", tel);
		System.out.printf(" Ficha de cadastro %n nome: %s %n estado: %s %n telefone: %s %n",name,country,tel);



		sc.close();

		//Funções matemáticas 

		// A = Math.sqrt(x); --> Variavel A recebe a raiz quadrada de X 
		// A = Math.pow(x,y); --> Variavel A recebe o resultado de X elevado a Y
		// A = Math.abs(x); --> variavel A recebe o valor absoluto de x

		//Exemplos na pratica
		double gw = 9;
		double ty = 3;
		double io = -9;
		double A,D,C;

		A = Math.sqrt(gw);
		System.out.println(A);
		D = Math.pow(gw, ty);
		System.out.println(D);
		C = Math.abs(io);
		System.out.println(C);
		//essas expressões podem participar de expressões maiores 
		// por exemplo x= Math.pow(b,2.0)-4*a*c
		


	}
}
//operações básicas 
//imprimir na tela ==> 
//System.out.println("bom"); gera uma quebra de linha ou 
//System.out.print(altura); não gera quebra de linha 
// System.out.printf("%.2f%n", x); --> %.2f%n o numero que esta entre porcentagem delimita casas decimais e
//exemplo "%.2f%n --> 2 casas %.4f%n --> 4 casas
// configurar a localização no nosso programa --> Locale.setDefault(Locale.US);