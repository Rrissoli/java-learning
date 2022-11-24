package src.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import src.entities.Employee;
import src.entities.Product;

public class Program {
    public static void main(String[] args) {


        // Classes sao tipos de referencias
        // variaveis cujo tipo são classes não devem ser entendidads como caixas, mas sim "tentaculos" (ponteiros) para caixas

        // variavel com valor nulo
        // Tipos referencia aceitam o valor "null", que indica que a variavel aponta para ninguem.


        // Tipos primitivos são tipos valor em java 
        // Em java, tipos primitivos são tipos valor, ou seja, são como caixas.

        // inicializaçãp
        
        // para imprimirmos ou  utilizarmos ela de alguma forma precisamos inicializar
        // simplesmente como esta ai em cima dará erro
        
        // agora podemos fazer mais , com a inicializaçãp dela em valores


        //valores padrao 
        // quando alocamos (new) qiaçqier tipo estruturado (classe ou array), são atribuidos valores padrao aos seus elementos 
        // numeros = 0 / boolean = false / char = caractere codigo 0 / objeto =  null
        //exemplo = Product p = new Product ==  name: null , price = 0

        
        //processos de desalocação


        //Garbage collector
        // é um processo que automatiza o gerenciamento de memoria de um progrma em execução
        // O garbage collector monitora os objetos alocados dinamicamente pelo programa , desalocando
        // aquele que não esta mais sendo utilizado


        // desalocação por escopo
        // fora do escopo que a variavel é declarada ela nao existe 
        // in x = 12 
        //if(x> 0){ int y = 2}
        // console.log(x,y) ==> 12 


        //RESUMO
        /// objetos alocados dinamicamente , quando não possuem mais referencia para eles , serão desalocados pelo garbage collector
        // Variaveis locais são desalocadas imediatamente assim que seu escopo local sai de execução

        
        // VETORES

        // Em programação , "vetor" é o nome dado a arranjos unidimensionais 
        // arranjo (array) é uma estrutura de dados:
        // Homogenea (dados do mesmo tipo), Ordenada (elementos acessados por meio de posições), alocada de uma vez só, em um bloco contíguo de memória
            
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // //criando um array
        // double[] vetor = new double[n];
        // for (int i = 0; i < n; i++) {
        //     vetor[i] = sc.nextDouble();
        // }
        // double sum = 0.0;
        // for (int i = 0; i < n; i++) {
        //     sum += vetor[i];
            
        // }
        // double avg = sum/n;
        // System.out.println(avg);
        
        // sc.close();


        // 2 exemplo
        // Scanner cs = new Scanner(System.in);
        // System.out.println("quantos produtos sao?");
        // int num = cs.nextInt();
        // Product[] vect = new Product[num];
        // for (int i = 0; i < vect.length; i++) {
        //     cs.nextLine();
        //     String name = cs.nextLine();
        //     double price = cs.nextDouble();
        //     vect[i] =  new Product(name, price);
        // }
        // double suma = 0.0;
        // for (int i = 0; i < vect.length; i++) {
        //     suma += vect[i].getPrice();
        // }
        // System.out.println(suma);
        // cs.close();






        // boxing , unboxing e wrapper classes

        //Boxing 
        // é o processo  de conversão de um objeto tipo valor para um objeto tipo referencia compatível
        // Unboxing 
        // é p processo contrario ele converte um objetp tipo referencia ára um objeto tipo compativel

        // exemplo
        // Encaixotamento
        int x = 2;
        Object obj = x;
        System.out.println(obj);
        //sáida é 20
        // desencaixotamento
        int y = (int) obj;
        System.out.println(y);
        //saída é 20
        
        //Wrapper classes
        //são classes equivalente aos tipos primitivos
        // boxing e unboxing sao naturais da linguagem
        // Uso comum : campos de entidades em sistemas de informação(IMPORTANTE)
        // pois tipos referencia (classes) aceitam valor null e usufruem dos recursos da POO

        //Object => Number, Boolean , Character
        //Number => Byte, Short, Integer, Long, Float, Double
        // Boolean => boolean
        // Character => char

        // é indicado colocar nas declarações dos parametros das classes o tipo wrapper class do seu parametro como
        // public String name;
        //public Double idade;
        // public Interger reais;




        // FOR EACH
        //exemplo, lembrar que ele parece forof
        // String[] vect = new String[] {"maria", "bob", "alex"};
        // for (String obj2 : vect) {
        //     System.out.println(obj2);
        // }


        // LISTAS
        // lista é uma estrutura de dados:
        // homogenea (dados do mesmo tipo)
        // Ordenada(elementos acessados por meio de posições )
        // Inicia vazia, e seus elementos são alocados sob demanda
        // cada elemento ocupa um "nó" (ou nodo) da lista

        // Tipo (interface): List
        //Classes que implementam: Arraylist, LinkedList, etc

        //Vantagens 
        // Tamanho variável
        // Facilidade para se realizar inserções e deleções 
        // Desvantagens :
         // Acesso sequencial aos elementos *
         // tamanho da lista : size()
         // inserir elemento na lista : add(obj), add(int, obj)
         // Remover elementos da lista: remove(obj), remove(int), removeIf(Predicate)
         // Encontrar posição de elemento: indexOf(obj), LastIndexOf(obj)
         // Filtrar lista com base em predicado: 
         // List<Integer> result = list.stream().filter(x -> x > 4).collect(Collectors.toList())
         //Encontrar primeira ocorrencia com base em predicado:
        // Integer result = list.stream().filter(x -> x > 5).findFirst().orElse(null);



        // exemplos 
        // CRIANDO LISTA DE INTEIROS
        // colocasse o tipo wrapper class
        // colocamos Arraylist para otimizar e criar essa lista, instanciar essa lista 
        // List<Integer> list = new ArrayList<>();
        // List<String> list2 = new ArrayList<>();
        
        // //inserindo itens sem index
        // list2.add("Maria");
        // list2.add("Alex");
        // list2.add("Bob");
        // list2.add("Anna");
        // //inserindo itens  com index
        // list2.add(2, "Macus");
        // list2.add(1, "locas");
        // // como vemos o tamanho da lista
        // list2.size();
        // System.out.println(list2.size());
        // //removendo item da lista
        // list2.remove("Anna");
        // // ou pelo index
        // list2.remove(1);
        // //ou remover a partir de um predicado, no caso remove todos q começam com a letra M
        // list2.removeIf(s-> s.charAt(0) == 'M');
        // // pegando o index do obj
        // System.out.println("Index of Bob:  " + list2.indexOf("Bob"));
        // //filtrar a lista , no caso somente os que tem o nome começado com "M"
        // List<String> result = list2.stream().filter(f -> f.charAt(0) == 'M').collect(Collectors.toList());
        // System.out.println(result);
        // // encontrar um elemento da lista que atenda a um predicado
        // String name = list2.stream().filter( f -> f.charAt(0) == 'A').findFirst().orElse(null);
        // System.out.println(name);




        // for (String string : list2) {
        //     System.out.println(string);
        // }
        
        // // Exercicio de fixação
    //     Locale.setDefault(Locale.US);
	// 	Scanner sc = new Scanner(System.in);
		
	// 	List<Employee> list = new ArrayList<>();
		
	// 	System.out.print("How many employees will be registered? ");
	// 	int N = sc.nextInt();
		
	// 	for (int i=0; i<N; i++) {
			
	// 		System.out.println();
	// 		System.out.println("Emplyoee #" + (i + 1) + ":");
	// 		System.out.print("Id: ");
	// 		Integer id = sc.nextInt();
	// 		while (hasId(list, id)) {
	// 			System.out.println("Id already taken! Try again: ");
	// 			id = sc.nextInt();
	// 		}
			
	// 		System.out.print("Name: ");
	// 		sc.nextLine();
	// 		String name = sc.nextLine();
	// 		System.out.print("Salary: ");
	// 		Double salary = sc.nextDouble();
			
	// 		Employee emp = new Employee(id, name, salary);
			
	// 		list.add(emp);
	// 	}
		
	// 	System.out.println();
	// 	System.out.print("Enter the employee id that will have salary increase : ");
	// 	int idsalary = sc.nextInt();

	// 	// Integer pos = position(list, idsalary);
		
	// 	Employee emp = list.stream().filter(d -> d.getId() == idsalary).findFirst().orElse(null);
		
	// 	// if (pos == null) {
	// 	if (emp == null) {
	// 		System.out.println("This id does not exist!");
	// 	}
	// 	else {
	// 		System.out.print("Enter the percentage: ");
	// 		double percent = sc.nextDouble();
	// 		//list.get(pos).increaseSalary(percent);
	// 		emp.increaseSalary(percent);
	// 	}
		
	// 	System.out.println();
	// 	System.out.println("List of employees:");
	// 	for (Employee e : list) {
	// 		System.out.println(e);
	// 	}		
		

	// }

	// public static Integer position(List<Employee> list, int id) {
	// 	for (int i = 0; i < list.size(); i++) {
	// 		if (list.get(i).getId() == id) {
	// 			return i;
	// 		}
	// 	}
	// 	return null;
	// }
	
	// public static boolean hasId(List<Employee> list, int id) {
	// 	Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
	// 	return emp != null;
	// }

    // // Matrizes 
    // // Em programação , " Matriz" é o nome dado a arranjos bidimensionais 
    // // atenção "vetores de vetores"
    // // Arranjo é uma estrutura de dados :
    //     // Homogenea ( dados do mesmo tipo)
    //     // Ordenada (elementos acessados por meio de posições)
        // alocada de uma vez só, em um bloco contíguo de memória
    
    //Vantagens:
        // acesso imediato aos elementos pela sua posição
    // Desvantagens 
        // tamanho fixo 
        // dificuldade para se realizar inserções e deleções
        // exemplos
        Scanner cs = new Scanner(System.in);
        // int n = cs.nextInt();
        // // vamo fazer um arranjo bidimensional assim int[][]
        // int [][] mat = new int[n][n];

        // for( int i = 0; i <n; i++){
        //     for (int j = 0; j < mat[i].length; j++) {
        //         mat[i][j] = cs.nextInt();
        //     }
        // }
        // int result = 0;
        // System.out.println("Main Diagonal");
        // for (int i = 0; i < mat.length; i++) {
        //     for (int j = 0; j < mat.length; j++) {
        //         System.out.println(mat[i][j]);
        //         result += mat[i][j];
        //         i++;
        //     }
        // }
        // System.out.println("Soma das diagonais");
        // System.out.println(result);
        int M = cs.nextInt();
        int N = cs.nextInt();

        int [][] mat = new int[M][N];
        for( int i = 0; i <M; i++){
               for (int j = 0; j < mat[i].length; j++) {
                    mat[i][j] = cs.nextInt();
                 }
             }

      
        int C = cs.nextInt();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                    if(C == mat[i][j]){
                        System.out.print("Position: " + i + ',' + j );
                        System.out.println("Left: " + mat[i - 1][j]);
                        System.out.println("Down: " + mat[i][j + 1]);
                        System.out.println("Rigth: " + mat[i + 1][j]);
                    }
            }
        }
        cs.close();
































    }

    }

