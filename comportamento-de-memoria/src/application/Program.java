package src.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        List<Integer> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        list2.add("Maria");
        list2.add("Alex");
        list2.add("Bob");
        list2.add("Anna");
        
        for (String string : list2) {
            System.out.println(string);
        }







































    }
}
