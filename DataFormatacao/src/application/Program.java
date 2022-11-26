package application;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;
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



	}




}
