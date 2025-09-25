package org.alejandrovillar;

import org.alejandrovillar.functions.*;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {

        AccidenteBuilder accidente = new AccidenteBuilder();

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el path del archivo CSV: ");
        String pathString = sc.nextLine();

        List<String[]> listaAccidentes = accidente.analiceCSV(Path.of(pathString));

        List<Accidente> accidentes = accidente.buildearAccidentes(listaAccidentes);


        // - Accidentes en los que están implicados alcohol o drogas.

        System.out.println("Accidentes en los que están implicados alcohol o drogas:\n\n");
        accidentes.stream().filter(a -> a.getAlcohol().equals("S") || a.getPositivoDroga().map(v -> v == 1).orElse(false)).forEach(System.out::println);

        // - Número de accidentes agrupados por sexo.

        System.out.println("Número de accidentes agrupados por sexo.\n\n");
        accidentes.stream().collect(Collectors.groupingBy(Accidente::getGenero)).forEach((genero, lista) -> {
            System.out.println("Genero: " + genero);
            lista.forEach(System.out::println);
        });

        // - Número de accidentes agrupados por meses.

        // Tengo que cambiar el código para poder hacerlo bien...

        System.out.println("Número de accidentes agrupados por meses.\n\n");
        accidentes.stream().collect(Collectors.groupingBy(Accidente::getFecha, Collectors.counting())).forEach((fecha, numAccidentes) -> {
            System.out.println("Fecha: " + fecha + " Numero de accidentes: " + numAccidentes);
        });


        // - Accidentes dónde haya habido atropellos a personas.

        System.out.println("Accidentes dónde haya habido atropellos a personas.\n\n");
        accidentes.stream().filter(a -> a.getTipoAccidente().equals("Atropello a persona")).forEach(System.out::println);



    }


}


