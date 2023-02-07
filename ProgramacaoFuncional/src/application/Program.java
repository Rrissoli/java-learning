package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

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
		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 2300.00));
		list.add(new Product("tablet", 12300.00));
		// expressão funcional normal
		//  new Comparator<Product>() {

		// 	@Override
		// 	public int compare(Product arg0, Product arg1) {
				
		// 		return arg0.getName().toUpperCase().compareTo(arg1.getName().toUpperCase());
		// 	}
			
		// };
		
		//expressao lambda ele presume que é um Product , como se fosse uma inferencia de tipo
	
	
		// mais simples ainda seria
		list.sort((p1,p2) ->  p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		for (Product product : list) {
			System.out.println(product);
		}
		// Paradigmas de programação
		//imperativo (c,pascal,Fortran, Cobol)
		// Orientado a objetos (C++, Object Pascal, Java(<8) , C#(3<))
		// Funcial (Haskell, Closure , Clean , Erlang)
		//Lógico (Prolog)
		// Multiparadigma (Javascript, Java(8>), C#,Ruby, Python, GO)
		// na programação funcional eu posso passar uma função como argumento de outra função 
		// exemplo
		Integer[] lista = {1,3,4,5,765,45,24,23,264,3,24,123};
		

	}
	

}
