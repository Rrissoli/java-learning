package entities;

public class Funcionario {
    public String name;
    public double salarioBruto;
    public double imposto;

    public double salarioLiq(){
        return   salarioBruto - imposto;
    }
    public void aumentoDeSalario(int percent){
        salarioBruto += salarioBruto *  (percent/ 100.0);
    }
    public String toString(){
        return "employee:" + name + "," + salarioLiq();
    }

}
