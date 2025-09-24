package org.alejandrovillar.functions;
import org.alejandrovillar.functions.values.*;

public class Accidente {

    private int numExpediente;
    private String fecha;
    private String hora;
    private Localidad LOCALIZACION;
    private TipoAccidente TIPOACCIDENTE;
    private EstadoMeteorologico METEOROLOGICO;
    private TipoVehiculo TIPOVEHICULO;
    private TipoPersona TIPOPERSONA;
    private String rangoEdad;
    private Genero GENERO;
    private int cod_lesividad;
    private int coordenada_x_utm;
    private int coordenada_y_utm;
    private char alcohol;
    private int positivo_droga;

    public Accidente() {
        this.numExpediente = numExpediente;
        this.fecha = fecha;
        this.hora = hora;
        this.LOCALIZACION = LOCALIZACION;
        this.TIPOACCIDENTE = TIPOACCIDENTE;
        this.METEOROLOGICO = METEOROLOGICO;
        this.TIPOVEHICULO = TIPOVEHICULO;
        this.TIPOPERSONA = TIPOPERSONA;
        this.rangoEdad = rangoEdad;
        this.GENERO = GENERO;
        this.cod_lesividad = cod_lesividad;
        this.coordenada_x_utm = coordenada_x_utm;
        this.coordenada_y_utm = coordenada_y_utm;
        this.alcohol = alcohol;
        this.positivo_droga = positivo_droga;
    }

    public int getNumExpediente() { return numExpediente; }
    public String getFecha() { return fecha; }
    public String getHora() { return hora; }
    public Localidad getLOCALIZACION() { return LOCALIZACION; }
    public TipoAccidente getTIPOACCIDENTE() { return TIPOACCIDENTE; }
    public EstadoMeteorologico getMETEOROLOGICO() { return METEOROLOGICO; }
    public TipoVehiculo getTIPOVEHICULO() { return TIPOVEHICULO; }
    public TipoPersona getTIPOPERSONA() { return TIPOPERSONA; }
    public String getRangoEdad() { return rangoEdad; }
    public Genero getGENERO() { return GENERO; }
    public int getCod_lesividad() { return cod_lesividad; }
    public int getCoordenada_x_utm() { return coordenada_x_utm; }
    public int getCoordenada_y_utm() { return coordenada_y_utm; }
    public char getAlcohol() { return alcohol; }
    public int getPositivo_droga() { return positivo_droga; }

}


