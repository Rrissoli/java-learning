package util;

public class CurrencyConverter {
    public static final double IOF = 0.06;
    public static double converter(double valorDolar,  double qtdDolares){
        double valorBruto = valorDolar * qtdDolares;
        double imposto = valorBruto * IOF;
        return valorBruto + imposto;
    }
}
