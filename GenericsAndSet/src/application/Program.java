package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.time.Instant;
import java.time.LocalDate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import model.entities.Circle;
import model.entities.Client;
import model.entities.Log;
import model.entities.Product;
import model.entities.Rectangule;
import model.entities.Shape;
import model.service.PrintService;

public class Program {

	public static void main(String[] args) {
		//Generics
		// permitem que classes, interfaces e métodos possam ser parametrizados por tipo.
		// Seus benefícios são:
		// REUSO + TYPE SAFETY + PERFORMANCE
		// eu pude criar um tipo especifico generico em printservice
		//Uso comum dele:
		// List <String > list = new ArrayList<>();
		// list.add("MAria");
		// String name = list.get(0);
		// System.out.println(name);
		// Scanner sc = new Scanner(System.in);

		// // PrintService ps = new PrintService();
		// // System.out.println("How many values ?");
		// // int n = sc.nextInt();
		// // String pessoa = sc.next();
		// // ps.addValue(pessoa);
		// // for (int i = 0; i < n; i++) {
		// // 	int value = sc.nextInt();
		// // 	ps.addValue(value);
		// // }
		// // ps.print();
		// // System.out.println("First: " + ps.first());

		// // agora vamos ver os genericos parametrizados
		
		// // TIPOS CORINGA
		// //-> Generics são variantes 
		// // -> List<Object> não é o supertipo de qualquer tipo de lista 
		// // -> O supertipo para qualquer tipo de lista pe List<?> este é um tipo coringa
		// // exemplo 
		// List<?> myObjs = new ArrayList<Object>();
		// List<Integer> myNumbers = new ArrayList<Integer>();
		// myObjs = myNumbers;
		
		// Object obj;
		// Integer x = 10;
		// obj = x;
		// porem eu não posso adicionar dados a esta lista


		//CORINGAS DELIMITADOS
		// List<Shape> myShapes = new ArrayList<>();
		// myShapes.add(new Rectangule(3.0, 2.0));
		// myShapes.add(new Circle(2.0));
		

		// //agora uma lista especifica de circulos
		// List<Circle> myCircles = new ArrayList<>();
		// myCircles.add(new Circle(2.00));
		// myCircles.add(new Circle(3.00));
		// System.out.println("Total area " + totalArea(myCircles));
			
		// // 2 Problema 
		// // Elementos get/put
		// //Contravariancia
		// List<Object> myObjs = new ArrayList<Object>();
		// myObjs.add("Maria");
		// myObjs.add("Alex");
		// List<? super Number> myNums = myObjs;
		// myNums.add(10);
		// myNums.add( 3.14);
		// System.out.println(myObjs);
		// Client c1 = new Client("maria", "MAria");
		// Client c2 = new Client("Alex", "akkk");
		// System.out.println(c1.hashCode());
		// System.out.println(c2.hashCode());
		// System.out.println(c2.equals(c1));
		// System.out.println(c1 == c2);
	

		// /// Hashcode e equals 
		// // são operações da classe Object utilizadas para comparar se um objeto é igual a outro
		// // equals: 100% igual 
		// // hashcode : Rapido, poren resposta positiva não é 100%

		// // tipos comuns (String , Date, Integer, Double, etc) já possuem implementação
		// // Classes personalizadas precisam sobrepô-las.
		// // exemplo
		// String a = "Maria";
		// String b = "Jorge";

		// System.out.println(a.equals(b));
		// 	// a funcao hashcode ela gera um numero e com esse numero podemos comparar
		// System.out.println(a.hashCode());
		// System.out.println(b.hashCode());
		// o hashcode é muito bom para testarmos os objetos dos hashcode sao diferentes
		

		//Set <T>
		// Representa um conjunto de elementos (Similar ao da Álgebra)
		// -> Não admitie repetições 
		// -> Elementos não possuem posição
		// -> Acesso, inserção e remoção de elementos são rápidos
		// -> Oferece operações eficiente sde conjunto: interseção, união , diferença

		// Principais implementações:
		//                 -> Hashset: mais rápido (Operações O(1) em tabela hash) e não ordenado
	  	//               -> Treeset: mais lento (operações O(log(n))em arvore rubro-negra)e ordenado pelo compareTo do objeto
		//               -> LinkedHashSet: velocidade intermediaria e eleemntos na ordem em que são acionados 
		
		// // exemplo 
		// 	Set<String> set = new HashSet<>();
		// 	set.add("Tv");
		// 	set.add("Notebook");
		// 	set.add("Tablet");
		// 	System.out.println(set.contains("Notebook"));
		// 	for (String string : set) {
		// 		System.out.println(string);
		// 	}

		// 	//removeIF()
		// 	set.removeIf(x -> x.length() >= 3);
		// 	System.out.println(set);


		// 	Set <Integer> a = new TreeSet<>(Arrays.asList(0,2,4,6,8,9,12,14,16,21));
		// 	Set <Integer> b = new TreeSet<>(Arrays.asList(0,4,7,89,887,45,1234,565,676,651));

		// 	//Union 
		// 	Set<Integer> c = new TreeSet<>(a);
		// 	c.addAll(b);
		// 	System.out.println(c);

		// 	//Intersection
		// 	Set<Integer> d = new TreeSet<>(a);
		// 	d.retainAll(b);
		// 	System.out.println(d);

		// 	//difference
		// 	Set<Integer> e = new TreeSet<>(a);
		// 	e.removeAll(b);
		// 	System.out.println(e);

		// 	// Como as coleções Hash testam igualdade
		// 	// Se hashCode e equals estiverem implementados:
		// 	// Primeiro hashCode, se der igual, usa equals para confirmar.
		// 	// lembre-se: String, Integer, Double, etc. já possuem equeals e hashCode.

		// 	// Se hashCode e equals NÂO estiverem implementados:
		// 	//compara as referencias (ponteiros) dos objetos

		// 	Set<Product> set2 = new HashSet<>();

		// 	set2.add(new Product("TV", 900.00));
		// 	set2.add(new Product("TV", 900.00));
		// 	set2.add(new Product("TV", 900.00));

		// 	Product prod = new Product("TV", 900.00);
		// 	System.out.println(set2.contains(prod));
		// String path2 = "/home/user/in.txt";
		
			
		// try (BufferedReader br2 = new BufferedReader(new FileReader(path2))){
		// 	Set<Log> set = new HashSet<>();
			
		// 	String line = br2.readLine();
		// 	while (line != null) {
		// 		String[] field = line.split(" ");
		// 		String name = field[0];
		// 		Date moment = Date.from(Instant.parse(field[1]));
		// 		Log log = new Log(name, moment);
		// 		set.add(log);
		// 		br2.readLine();
		// 	}
		// 	System.out.println(set);
		// }
			
		// 	catch(IOException e) {
		// 		System.out.println("Error: " + e.getMessage());
		// 	}
		


		//Map <K,M>
		// É uma coleção de pares chave/valor 
			// não admite repetições do objeto chave
			// Os elementos são indexados pelo objeto chave (não possuem posição)
			// Acesso, inserção e remoção de elementos são rapidos
		
		// Uso comum : cookies, Local Storage , qualquer modelo chave-valor

		// principais implementações
			// hashmap: mais rapido e nao ordenado
			//treemap: mais lento e ordenado pelo compareTo do objeto (ou Comparador)
			// LinkedHashMap : velocidade intermediaria e elementos na ordem em que são adicionados
		//metodos importantes
		// put(key, value ), remove(key), contains(key), get(key)
		// clear()
		// size()
		// keyset() retorna um Set<K>
		// values() retorna um Collection<v>

			// example
			Map<Product, Double> stock = new HashMap<>();
			Product p1 = new Product("TV", 900.00);
			Product p2 = new Product("note V", 1666.00);
			Product p3 = new Product("barco", 12355.00);

			stock.put(p1, 10000.00);
			stock.put(p2, 1999.00);
			stock.put(p3, 990000.00);
			Product ps = new Product("TV", 900.00);
			System.out.println(stock.containsKey(ps));



}

	}
	// public static double totalArea(List<? extends Shape> list){
	// 	double sum = 0.0;
	// 	// mas n posso tentar adiconar por exemplo list.add(new Rectangule)
	// 	////Covarianca , ou seja , só podemos dar um get
	// 	for (Shape s : list) {
	// 		sum += s.area();
	// 	}
	// 	return sum;
	// }
	// /// podemos usar também uma função copy para transfomar
	// public static void copy(List<? extends Number> source, List<? super Number> destiny){
	// 	for (Number number : source) {
	// 		destiny.add(number);
	// 	}

	// }
	// public static void printList(List<?> list){
	// 	for ( Object obj : list) {
	// 		System.out.println(obj);
	// 	}
	// }


