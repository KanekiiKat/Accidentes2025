package org.alejandrovillar.functions.values;

public enum EstadoMeteorologico {
    DESPEJADO("Despejado"),
    NUBLADO("Nublado"),
    LLUVIA_DEBIL("Lluvia débil"),
    LLUVIA_INTENSA("Lluvia intensa"),
    NIEBLA("Niebla"),
    GRANIZANDO("Granizando"),
    NIEVE("Nieve"),
    DESCONOCIDO("Se desconoce");

    private final String estado;

    EstadoMeteorologico(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }
}
