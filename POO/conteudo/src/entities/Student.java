package entities;

public class Student {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;
    public double median(){
        return (nota1 + nota2 + nota3) / 3 ;
    }
    public String sePassou(){
        if(this.median() > 60){
            return "Pass";
        }else{
            double falta = this.median() - 60;
             
            return "Failed " + " mISSING " + falta+ " points";
        }
    }
 




}
