package org.alejandrovillar;

import org.alejandrovillar.functions.*;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        AccidenteBuilder accidente = new AccidenteBuilder();

        List<String[]> listaAccidentes = accidente.analiceCSV(Path.of("C:\\Users\\alex1\\Documents\\Programación\\Accidentes2025\\src\\main\\resources\\2025_Accidentalidad.csv"));

        accidente.buildearAccidentes(listaAccidentes);

        System.out.println(listaAccidentes);


    }

}
