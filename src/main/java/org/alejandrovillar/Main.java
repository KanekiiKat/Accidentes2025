package org.alejandrovillar;

import org.alejandrovillar.functions.*;
import org.alejandrovillar.functions.values.Fecha;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {

        AccidenteBuilder accidente = new AccidenteBuilder();

        Scanner sc = new Scanner(System.in);

        System.out.print("""
                Comandos:
                
                1 - Accidentes en los que están implicados alcohol o drogas.
                2 - Número de accidentes agrupados por sexo.
                3 - Número de accidentes agrupados por meses.
                4 - Accidentes dónde haya habido atropellos a personas.
                
                Ingresa el comando y el path del archivo CSV:\s""");

        String[] comando = sc.nextLine().split(" ");

        List<String[]> listaAccidentes = accidente.analiceCSV(Path.of(comando[1]));

        List<Accidente> accidentes = accidente.buildearAccidentes(listaAccidentes);


        // - Accidentes en los que están implicados alcohol o drogas.

        if (comando[0].equals("1")) {
        System.out.println("Accidentes en los que están implicados alcohol o drogas:\n\n");
        accidentes.stream().filter(a -> a.getAlcohol().equals("S") || a.getPositivoDroga().map(v -> v == 1).orElse(false)).forEach(System.out::println);

        } else if(comando[0].equals("2")) {       // - Número de accidentes agrupados por sexo.


            System.out.println("Número de accidentes agrupados por sexo.\n\n");
        accidentes.stream().collect(Collectors.groupingBy(Accidente::getGenero)).forEach((genero, lista) -> {
            System.out.println("Genero: " + genero);
            lista.forEach(System.out::println);
        });

        } else if(comando[0].equals("3")) {        // - Número de accidentes agrupados por meses.



            System.out.println("Número de accidentes agrupados por meses.\n\n");
        accidentes.stream()
                .collect(Collectors.groupingBy(a -> Fecha.getMes(a.getFecha()), Collectors.counting()))
                .forEach((a, numAccidentes) -> {
            System.out.println("Mes " + a + " Numero de accidentes: " + numAccidentes);
        });

        } else if(comando[0].equals("4")) {        // - Accidentes dónde haya habido atropellos a personas.


            System.out.println("Accidentes dónde haya habido atropellos a personas.\n\n");
        accidentes.stream().filter(a -> a.getTipoAccidente().equals("Atropello a persona")).forEach(System.out::println);

        } else {
            System.out.println("Comando invalido");
        }

    }


}


