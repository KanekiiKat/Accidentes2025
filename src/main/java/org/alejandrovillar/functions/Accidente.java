package org.alejandrovillar.functions;

public class Accidente {

    private int numExpediente;
    private String fecha;
    private String hora;
    private String localizacion;
    private Integer numero;
    private Integer codDistrito;
    private String distrito;
    private String tipoAccidente;
    private String estadoMeteorologico;
    private String tipoVehiculo;
    private String tipoPersona;
    private String rangoEdad;
    private String genero;
    private Integer codLesividad;
    private String lesividad;
    private int coordenadaXUtm;
    private int coordenadaYUtm;
    private Character alcohol;
    private int positivoDroga;

    public Accidente(
            int numExpediente,
            String fecha,
            String hora,
            String localizacion,
            Integer numero,
            Integer codDistrito,
            String distrito,
            String tipoAccidente,
            String estadoMeteorologico,
            String tipoVehiculo,
            String tipoPersona,
            String rangoEdad,
            String genero,
            Integer codLesividad,
            String lesividad,
            int coordenadaXUtm,
            int coordenadaYUtm,
            Character alcohol,
            int positivoDroga
    ) {
        this.numExpediente = numExpediente;
        this.fecha = fecha;
        this.hora = hora;
        this.localizacion = localizacion;
        this.numero = numero;
        this.codDistrito = codDistrito;
        this.distrito = distrito;
        this.tipoAccidente = tipoAccidente;
        this.estadoMeteorologico = estadoMeteorologico;
        this.tipoVehiculo = tipoVehiculo;
        this.tipoPersona = tipoPersona;
        this.rangoEdad = rangoEdad;
        this.genero = genero;
        this.codLesividad = codLesividad;
        this.lesividad = lesividad;
        this.coordenadaXUtm = coordenadaXUtm;
        this.coordenadaYUtm = coordenadaYUtm;
        this.alcohol = alcohol;
        this.positivoDroga = positivoDroga;
    }

    public int getNumExpediente() { return numExpediente; }
    public String getFecha() { return fecha; }
    public String getHora() { return hora; }
    public String getLocalizacion() { return localizacion; }
    public Integer getNumero() { return numero; }
    public Integer getCodDistrito() { return codDistrito; }
    public String getDistrito() { return distrito; }
    public String getTipoAccidente() { return tipoAccidente; }
    public String getEstadoMeteorologico() { return estadoMeteorologico; }
    public String getTipoVehiculo() { return tipoVehiculo; }
    public String getTipoPersona() { return tipoPersona; }
    public String getRangoEdad() { return rangoEdad; }
    public String getGenero() { return genero; }
    public Integer getCodLesividad() { return codLesividad; }
    public String getLesividad() { return lesividad; }
    public int getCoordenadaXUtm() { return coordenadaXUtm; }
    public int getCoordenadaYUtm() { return coordenadaYUtm; }
    public Character getAlcohol() { return alcohol; }
    public int getPositivoDroga() { return positivoDroga; }


}



