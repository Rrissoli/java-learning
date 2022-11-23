package src.entities;

public class Funcionarios {
    private String nome;
    private Double salario;
    private Integer Id;

    public String getNome() {
        return nome;
    }
    public Double getSalario() {
        return salario;
    }
    public Integer getId() {
        return Id;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public Funcionarios(String nome, Double salario, Integer id) {
        this.nome = nome;
        this.salario = salario;
        Id = id;
    }
    public void incraseSalary(double percent){
        salario += salario * percent / 100;
    }
    
}
