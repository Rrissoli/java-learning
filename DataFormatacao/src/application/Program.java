package application;

import java.util.Scanner;



import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.text.DateFormat;
import java.time.Instant;

public class Program {
	public static void main(String[] args) {
 // conceitos iniciais
        
        // data-[hora] local :
        // ano-mes-dia-[hora] sem fuso horario
        // [hora] opcional

        // data-hora global:
        // ano-mes-dia-hora com fuso horário

        //quando utilizar data-local e data-global ?
        // // data local => qiando o momento exato não interessa a pessoas de outro fuso horario
        
        // data-hora global => quando o momento exato interessa a pessoas de outro fuso horario
        // uso: comum em regioes multiplas

        // padrao ISP 8601
        // padrao que especifíca como devemos utilizar datas e horas 
        
        //data-hora[local]
        // ano-mes-dia-T-hora-minuto-segundo-milesegundo

        // data-hora[global]
        //ano-mes-dia-T-hora-minuto-segundo-zona fuso


        //operações importantes
        // INSTANCIAÇÂO
        // Agora => data-hora
        // texto ISO 8601 => data-hora
        // Texto formato customizado => data-hora
        // dia mes  ano [horario] => data-hora local

        //FORMATAÇÃO
        // data-hora => texto ISO 8601
        // data-hora => texto formato customizado

        //operações importantes com data e hora 
        // Obter dados de uma data-hora local
        // data-hora local -> dia, mes , ano, horario

        // Converter data-hora global para local
        // data-hora global, timezone(sistema local) => Data-hora local

        //Calculos com data-hora
        // data-hora +/- tempo => data/hora
        // data-hora 1, data-hora 2 => Duração

        // Data-hora local
        /// LocalDate
        /// LocalDateTime

        // Data-hora Golbal
        //Instant

        //Duração 
        // Duration

        // exemplos de tudo

        //instanciação para agora
        LocalDate d01 = LocalDate.now();
        System.out.println(d01);
        //2022-11-25
        LocalDateTime d02 = LocalDateTime.now();
        System.out.println(d02);
        //2022-11-25T21:03:59.567667069
        Instant d03 = Instant.now();
        System.out.println(d03);
        
        // texto ISO 
        LocalDateTime d04 = LocalDateTime.parse("2023-12-01T00:00:00");
        Instant d06 = Instant.parse("2023-12-01T00:00:00-02:00");
        
        // texto em formato customizado
        // ir atras do data formatter java , pois varia na formatação
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate d08 = LocalDate.parse("29/10/2021", fmt1);
      
        
        System.out.println(d04);
        System.out.println(d06);
        System.out.println(d08);


        // formatação
        // transformar a data hora em formato customizado
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(d04.format(fmt2));
        // utilizando o .format
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println(d02.format(fmt3));
        // agora para formatarmos e imprimirmos o instant
        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        // eu considero o fuso horario do computador local
        System.out.println(fmt4.format(d06));
        // nesse caso utilizamos a chamada diferente por o metodo wirhzone esta na variavel de formatação 
        // AGORA VAMOS FAZER COM AS FORMATAÇÔES PADRÂO
        // vamos pegar por exemplo a ISO DATE TIME
        // para date time
        DateTimeFormatter fmt10 = DateTimeFormatter.ISO_DATE_TIME;
        System.out.println(fmt10.format(d02));
        //para instant usamos iso instant
        DateTimeFormatter fmt11 = DateTimeFormatter.ISO_INSTANT;
        System.out.println(fmt11.format(d03));
        




        // CONVERTENDO DE DAtAHORA GLOBAL PArA LOCAL

        LocalDate d14 = LocalDate.now();
        LocalDateTime d15 = LocalDateTime.now();
        Instant d17 = Instant.now();
        Instant d20 = Instant.parse("2022-08-20T01:30:23Z");        
        ZoneId.getAvailableZoneIds();// pega uma colecao de fusos horarios        
        
        LocalDate r1 = LocalDate.ofInstant(d20, ZoneId.systemDefault());// fuso do comp
        LocalDate r2 = LocalDate.ofInstant(d20, ZoneId.of("Portugal"));// fuso de portugal
        LocalDateTime r3 = LocalDateTime.ofInstant(d20, ZoneId.systemDefault());// fuso do comp
        LocalDateTime r4 = LocalDateTime.ofInstant(d20, ZoneId.of("Portugal"));// fuso de portugal
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);

        // temos estas opções 
        System.out.println(d14.getDayOfMonth());
        System.out.println(d14.getDayOfYear());
        System.out.println(d14.getYear());






}




}
