package org.alejandrovillar.functions;
import org.alejandrovillar.functions.values.*;

public class Accidente {

    private int numExpediente;
    private String fecha;                 // p.ej. "15/03/2025"
    private String hora;                  // p.ej. "08:30:00"
    private String localidad;             // vía/intersección en texto plano

    private TipoAccidente tipoAccidente;          // enum
    private EstadoMeteorologico estadoMeteorologico; // enum
    private TipoVehiculo tipoVehiculo;            // enum
    private TipoPersona tipoPersona;              // enum
    private String rangoEdad;                     // p.ej. "18-24"
    private Genero genero;                        // enum

    private Integer codLesividad;                 // puede venir vacío → null
    private int coordenadaXUtm;
    private int coordenadaYUtm;

    private char alcohol;                         // 'S' o 'N'
    private int positivoDroga;                    // 1 o 0

    // Constructor por defecto con valores seguros
    public Accidente() {
        this.numExpediente = 0;
        this.fecha = "";
        this.hora = "";
        this.localidad = "";

        this.tipoAccidente = TipoAccidente.OTRO;
        this.estadoMeteorologico = EstadoMeteorologico.DESCONOCIDO;
        this.tipoVehiculo = TipoVehiculo.OTRO;
        this.tipoPersona = TipoPersona.OTRO;
        this.rangoEdad = "";
        this.genero = Genero.DESCONOCIDO;

        this.codLesividad = null;
        this.coordenadaXUtm = 0;
        this.coordenadaYUtm = 0;

        this.alcohol = 'N';
        this.positivoDroga = 0;
    }

    // Getters (si los necesitas ahora)
    public int getNumExpediente() { return numExpediente; }
    public String getFecha() { return fecha; }
    public String getHora() { return hora; }
    public String getLocalidad() { return localidad; }
    public TipoAccidente getTipoAccidente() { return tipoAccidente; }
    public EstadoMeteorologico getEstadoMeteorologico() { return estadoMeteorologico; }
    public TipoVehiculo getTipoVehiculo() { return tipoVehiculo; }
    public TipoPersona getTipoPersona() { return tipoPersona; }
    public String getRangoEdad() { return rangoEdad; }
    public Genero getGenero() { return genero; }
    public Integer getCodLesividad() { return codLesividad; }
    public int getCoordenadaXUtm() { return coordenadaXUtm; }
    public int getCoordenadaYUtm() { return coordenadaYUtm; }
    public char getAlcohol() { return alcohol; }
    public int getPositivoDroga() { return positivoDroga; }

    // Setters (para que tu Builder/CSV los vaya rellenando)
    public void setNumExpediente(int v) { this.numExpediente = v; }
    public void setFecha(String v) { this.fecha = v; }
    public void setHora(String v) { this.hora = v; }
    public void setLocalidad(String v) { this.localidad = v; }
    public void setTipoAccidente(TipoAccidente v) { this.tipoAccidente = v; }
    public void setEstadoMeteorologico(EstadoMeteorologico v) { this.estadoMeteorologico = v; }
    public void setTipoVehiculo(TipoVehiculo v) { this.tipoVehiculo = v; }
    public void setTipoPersona(TipoPersona v) { this.tipoPersona = v; }
    public void setRangoEdad(String v) { this.rangoEdad = v; }
    public void setGenero(Genero v) { this.genero = v; }
    public void setCodLesividad(Integer v) { this.codLesividad = v; }
    public void setCoordenadaXUtm(int v) { this.coordenadaXUtm = v; }
    public void setCoordenadaYUtm(int v) { this.coordenadaYUtm = v; }
    public void setAlcohol(char v) { this.alcohol = Character.toUpperCase(v); }
    public void setPositivoDroga(int v) { this.positivoDroga = v; }
}


