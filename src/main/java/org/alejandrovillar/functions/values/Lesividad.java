package org.alejandrovillar.functions.values;

public enum Lesividad {
    SIN_ASISTENCIA("Sin asistencia sanitaria"),
    ASISTENCIA_EN_EL_LUGAR("Asistencia sanitaria en el lugar"),
    TRASLADO_NO_URGENTE("Traslado no urgente"),
    TRASLADO_URGENTE("Traslado urgente"),
    HOSPITALIZACION("Hospitalización"),
    FALLECIDO_EN_EL_ACTO("Fallecido en el acto"),
    FALLECIDO_POSTERIOR("Fallecido posteriormente"),
    DESCONOCIDA("Se desconoce");

    private final String etiqueta;

    Lesividad(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public String getEtiqueta() {
        return etiqueta;
    }
}
