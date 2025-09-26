package org.alejandrovillar.functions;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AccidenteBuilder {

    public AccidenteBuilder() {}

    public List<String[]> analiceCSV(Path pathCSV) throws IOException {
        List<String> linesCSV = Files.readAllLines(pathCSV);

        linesCSV.removeFirst();

        return linesCSV.stream().map(linea -> linea.replace("; ", " - ").split(";", -1)).toList();

    }


    public List<Accidente> buildearAccidentes(List<String[]> columnasCSV) {
        List<Accidente> accidentes = new ArrayList<>();
        for (String[] columna : columnasCSV) {
            accidentes.add(new Accidente(
                    columna[0], columna[1], columna[2], columna[3],
                    columna[4], columna[5], columna[6], columna[7],
                    columna[8], columna[9], columna[10], columna[11],
                    columna[12], columna[13], columna[14],
                    columna[15], columna[16], columna[17], parseOptionalInt(columna[18])

            ));
        }
        return accidentes;
    }
    private static Optional<Integer> parseOptionalInt(String s) {
        if (s != null && !s.isEmpty()) {
            return Optional.of(Integer.parseInt(s));
        } else  {
            return Optional.empty();
        }
    }
}