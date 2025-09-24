package org.alejandrovillar.functions;

import java.util.List;
import java.nio.file.*;

public class AccidentBulider {

    private final List<Accidente> accidentes;
    private Path path;

    AccidentBulider(List<Accidente> accidentes, Path path) {
        this.accidentes = accidentes;
        this.path = path;
    }

    public List<Accidente> getAccidentes() {
        return accidentes;
    }

    public void setPath(Path path) {
        this.path = path;
    }

    public void addAccidente(Accidente accidente) {

    }


}
