package org.alejandrovillar.functions.values;

public class Localidad {

    private final String LOCALIZACION;
    private final int COD_DISTRITO;
    private final String distrito;

    Localidad(String LOCALIZACION, int COD_DISTRITO, String distrito) {
        this.LOCALIZACION = LOCALIZACION;
        this.COD_DISTRITO = COD_DISTRITO;
        this.distrito = distrito;
    }

    public String getLOCALIZACION() {
        return LOCALIZACION;
    }
    public int getCOD_DISTRITO() {
        return COD_DISTRITO;
    }
    public String getDistrito() {
        return distrito;
    }

}
