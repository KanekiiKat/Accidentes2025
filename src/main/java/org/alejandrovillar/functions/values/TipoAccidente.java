package org.alejandrovillar.functions.values;

public enum TipoAccidente {
    FRONTO_LATERAL("Colisión fronto-lateral"),
    LATERAL("Colisión lateral"),
    CONTRA_OBSTACULO_FIJO("Choque contra obstáculo fijo"),
    CAIDA("Caída"),
    ALCANCE("Alcance"),
    ATROPELLO("Atropello a persona"),
    MULTIPLE("Colisión multiple"),
    OTRO("Otro");

    final private String tipo;

    TipoAccidente(String tipo) {
        this.tipo = tipo;
    }

}
