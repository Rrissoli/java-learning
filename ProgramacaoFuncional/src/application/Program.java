package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import Util.ProductPredicate;
import entities.Product;
import services.ProductServices;

public class Program {
	public static Integer somaElementos(List<Integer> list){
		Integer sum = 0;
		for (Integer double1 : list) {
			sum += double1;
		}
		return sum;
	}

	public static void main(String[] args) {
		// suponha uma classe Product com os atributos name e price
		//Podemos umpementar a comparação de produtos por meio da implementação da interface Comparable<Product>
		//Entretanto, desta forma npssa cçasse não fica fechada para alteração: se o critério de comparação mudar , precisaremos alterar a classe Product
		//Podemos então usar o default method "sort" da interface List: default coid sort(Comparator<?super E> c)
		// List<Product> list = new ArrayList<>();
		// list.add(new Product("TV", 900.00));
		// list.add(new Product("Notebook", 2300.00));
		// list.add(new Product("tablet", 12300.00));
		// expressão funcional normal
		//  new Comparator<Product>() {

		// 	@Override
		// 	public int compare(Product arg0, Product arg1) {
				
		// 		return arg0.getName().toUpperCase().compareTo(arg1.getName().toUpperCase());
		// 	}
			
		// };
		
		//expressao lambda ele presume que é um Product , como se fosse uma inferencia de tipo
	
	
		// mais simples ainda seria
		// list.sort((p1,p2) ->  p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		// for (Product product : list) {
		// 	System.out.println(product);
		// }
		// Paradigmas de programação
		//imperativo (c,pascal,Fortran, Cobol)
		// Orientado a objetos (C++, Object Pascal, Java(<8) , C#(3<))
		// Funcial (Haskell, Closure , Clean , Erlang)
		//Lógico (Prolog)
		// Multiparadigma (Javascript, Java(8>), C#,Ruby, Python, GO)
		// na programação funcional eu posso passar uma função como argumento de outra função 
		// // exemplo
		// Integer[] lista = {1,3,4,5,765,45,24,23,264,3,24,123};
		
		// //Interface Funcional
		// // É uma interface que possui um único método abstrato. Suas implementações serão tratadas como expressões lambda
		// // algumas interfaces funcionais mais comuns 
		// // Predicate
		// // Function
		// // Consumer

		// //Predicate
		// // interface generics
		// // apenas o metodo "test" que retorna um booleano
		// // exemplo 
		// List<Product> list = new ArrayList<>();
		// list.add(new Product("TV", 900.00));
		// list.add(new Product("Notebook", 2300.00));
		// list.add(new Product("tablet", 1200.00));
		// //com interface
		// list.removeIf(new ProductPredicate());
		// //ou
		// //um method reference 
		// list.removeIf(Product::staticProductPredicate);
		// // ou
		// // method reference sem staticidade
		// list.removeIf(Product::nonStaticProductPredicate);
		// //ou
		// // expressão lambda declaradas
		// Predicate <Product> pred = x -> x.getPrice()>= 100.00;
		// // ou
		// // expressão lambda inline

		// for (Product product : list) {
		// 	System.out.println(product);
		// }

		// // Consumer
		// //é uma interface funcional  com um unico methodo que n retorna nada o "accept"
		// // method reference
		// list.forEach(Product::staticUpdatePrice);
		// // methos reference sem staticidade
		// list.forEach(Product::nonstaticUpdatePrice);
		// // expressão lambda
		// Consumer <Product> con = x -> x.setPrice(x.getPrice() * 1.1) ;

		// Function 
		// uma interface funcional tambem que diferente das outras recebe dois parametros , um tipo T e um tipo R
		// ela tem o metodo apply qye recebe um T e retorna um R
		// A função "map"(não confunda com a estrutura de dados Map) é uma função que aplica uma função a todos elementos de uma stream
		// list para Stream : .stream()
		// stream para list : .collect(Collectors.toList())
		//list.stream().map()
		List<Product> lista2 = new ArrayList<>();
		lista2.add(new Product("TV", 900.00));
		lista2.add(new Product("Notebook", 2300.00));
		lista2.add(new Product("tablet", 1200.00));
		lista2.forEach(System.out::println);
		// reference method
		List<String> names = lista2.stream().map(Product::staticUpperCase).collect(Collectors.toList());
		names.forEach(System.out::println);
		// metodo nao estatico
		List<String> names2 = lista2.stream().map(Product::nonStaticUpperCase).collect(Collectors.toList());
		names2.forEach(System.out::println);
		// expressao lambda declarada
		Function<Product, String> func = p -> p.getName().toUpperCase();
		List<String> names3 = lista2.stream().map(func).collect(Collectors.toList());
		names3.forEach(System.out::println);
		// lamda inline
		List<String> names4 = lista2.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		names4.forEach(System.out::println);

		// agora vmaos lá, 
		// criando funções que recebem funções 
		// funções como objetos d eprimeira ordem
		List<Product> lista3 = new ArrayList<>();
		lista3.add(new Product("TV", 900.00));
		lista3.add(new Product("Notebook", 2300.00));
		lista3.add(new Product("tablet", 1200.00));
		
		ProductServices ps = new ProductServices();
		
		double sum = ps.filteredPrice(lista3, p -> p.getName().charAt(0) == 'N');
		double sum2 = ps.sumAlProducts(lista3);
		System.out.println(sum);
		System.out.println(sum2);

		// Stream
		// É uma sequencia de elementos advinda de uma fonte de dados que oferece suporte a "operações agregadas"
		// fonte de dados : coleção, array, função de iteração, recurso de E/S
		// características da stream
		// é uma solução para processar sequencas de dados de forma
		// declarativa ( iteração interna > escondida do programador)
		// Parallel-friendly(imutavel->thread safe )
		// sem efeitos colaterais
		// sob demanda
		// acesso sequencial
		// single use: só pode ser "usada" uma vez
		// Pipeline: operações em streams retornam novas streams . entãi é possível criar uma cadeia de operações (fluxo de processamento)
		// Operações intermediarias e terminais 
		// O pipeline é composto por zero ou mais operações intermediarias e uma terminal
		// Operaçãp intermediaria
		// Produz uma nova streams (encadeamento)
		// só executa quando uma operação terminal é invocada (lazy evaluation)
		// Operação terminal
		// Produz um obejto não stream ( coleção ou outro)
		// Determina o fim do processamento da stream
		// lista de operações intermediarias
		// filter, map, flatmap, peek, distinct, sorted, skip, limit
		// lista de operações terminais
		// foreach, forEachOrdered, toArray, reduce, collect, min, max, count, anyMatch, allMatch, noneMatch, findFirst, findAny

		// como criar uma stream
		// Basta chamar o metodo Stream() ou parallelStream() a partir de qualquer objeto Collection.
		// Outras formas
		// stream.of
		// stream.ofNullable
		// stream.iterate
		List<Integer> list4 = Arrays.asList(2,3,4,5,6,7,8);
		//toArray
		Stream<Integer> st1 = list4.stream();
		System.out.println(Arrays.toString(st1.toArray()));
		// map
		Stream<Integer> st2 = list4.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st2.toArray()));
		// iterate
		Stream<Integer> st3 = Stream.iterate(0, x-> x + 2);
		System.out.println(Arrays.toString(st3.limit(10).toArray()));
		// demos de pipeline
		Stream<Integer> st5 = list4.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st5.toArray()));
		int sum1 = list4.stream().reduce(0,(x,y) -> x + y);
		System.out.println(sum1);
		
	}
	

}
