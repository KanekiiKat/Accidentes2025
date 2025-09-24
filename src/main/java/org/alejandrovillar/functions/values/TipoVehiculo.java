package org.alejandrovillar.functions.values;

public enum TipoVehiculo {
    TURISMO("Turismo"),
    MOTOCICLETA("Motocicleta"),
    CICLOMOTOR("Ciclomotor"),
    BICICLETA("Bicicleta"),
    FURGONETA("Furgoneta"),
    CAMION("Camión"),
    AUTOBUS("Autobús"),
    TODO_TERRENO("Todo terreno"),
    VMP("Vehículo de movilidad personal"), // patinete eléctrico
    TAXI("Taxi"),
    VEHICULO_ESPECIAL("Vehículo especial"),
    OTRO("Otro");

    private final String tipo;

    TipoVehiculo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }



}
