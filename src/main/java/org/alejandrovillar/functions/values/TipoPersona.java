package org.alejandrovillar.functions.values;

public enum TipoPersona {
    CONDUCTOR("Conductor"),
    PASAJERO("Pasajero"),
    PEATON("Peatón"),
    OTRO("Otro");

    private final String tipo;

    TipoPersona(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

}
