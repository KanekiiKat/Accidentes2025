package org.alejandrovillar.functions;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Accidente {

    List<Accidente> accidentes = new ArrayList<>();

    private String numExpediente;
    private String fecha;
    private String hora;
    private String localizacion;
    private String numero;
    private String codDistrito;
    private String distrito;
    private String tipoAccidente;
    private String estadoMeteorologico;
    private String tipoVehiculo;
    private String tipoPersona;
    private String rangoEdad;
    private String genero;
    private String codLesividad;
    private String lesividad;
    private String coordenadaXUtm;
    private String coordenadaYUtm;
    private String alcohol;
    private Optional<Integer> positivoDroga;

    public Accidente(
            String numExpediente,
            String fecha,
            String hora,
            String localizacion,
            String numero,
            String codDistrito,
            String distrito,
            String tipoAccidente,
            String estadoMeteorologico,
            String tipoVehiculo,
            String tipoPersona,
            String rangoEdad,
            String genero,
            String codLesividad,
            String lesividad,
            String coordenadaXUtm,
            String coordenadaYUtm,
            String alcohol,
            Optional<Integer> positivoDroga
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



    public String getNumExpediente() { return numExpediente; }
    public String getFecha() { return fecha; }
    public String getHora() { return hora; }
    public String getLocalizacion() { return localizacion; }
    public String getNumero() { return numero; }
    public String getCodDistrito() { return codDistrito; }
    public String getDistrito() { return distrito; }
    public String getTipoAccidente() { return tipoAccidente; }
    public String getEstadoMeteorologico() { return estadoMeteorologico; }
    public String getTipoVehiculo() { return tipoVehiculo; }
    public String getTipoPersona() { return tipoPersona; }
    public String getRangoEdad() { return rangoEdad; }
    public String getGenero() { return genero; }
    public String getCodLesividad() { return codLesividad; }
    public String getLesividad() { return lesividad; }
    public String getCoordenadaXUtm() { return coordenadaXUtm; }
    public String getCoordenadaYUtm() { return coordenadaYUtm; }
    public String getAlcohol() { return alcohol; }
    public Optional<Integer> getPositivoDroga() { return positivoDroga; }

    @Override
    public String toString() {
        return getNumExpediente() + " | " +
                getFecha() + " | " +
                getHora() + " | " +
                getLocalizacion() + " | " +
                getNumero() + " | " +
                getCodDistrito() + " | " +
                getDistrito() + " | " +
                getTipoAccidente() + " | " +
                getEstadoMeteorologico() + " | " +
                getTipoVehiculo() + " | " +
                getTipoPersona() + " | " +
                getRangoEdad() + " | " +
                getGenero() + " | " +
                getCodLesividad() + " | " +
                getLesividad() + " | " +
                getCoordenadaXUtm() + " | " +
                getCoordenadaYUtm() + " | " +
                getAlcohol() + " | " +
                getPositivoDroga().map(String::valueOf).orElse("");
    }

    }










