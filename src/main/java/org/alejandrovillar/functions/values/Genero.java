package org.alejandrovillar.functions.values;

public enum Genero {
    MUJER("Mujer"),
    HOMBRE("Hombre"),
    DESCONOCIDO("Desconocido");

    private final String genero;

    Genero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }
}
