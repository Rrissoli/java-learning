package src.entities;

public class Pessoa {
    private String nome;
    private int idade;
    private double Altura;

    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public double getAltura(){
        return this.Altura;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        Altura = altura;
    }
    
}
