package entities;

public class ContaBancaria {
    private String nome;
    private int numeroConta;
    private double saldo;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public ContaBancaria(String nome, int numeroConta, double saldo) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        deposito(saldo);
    }
    public ContaBancaria(String nome, int numeroConta) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        
    }
    public void deposito(double valor){
        this.saldo += valor;
    }
    public void saque(double valor){
        valor = valor - 5.00;
        this.saldo -= valor;
    }
    public String toString(){
        return "nome: " + nome + " numero conta :" + numeroConta + " saldo: $" + saldo;
    }
}
