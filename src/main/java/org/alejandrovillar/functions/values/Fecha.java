package org.alejandrovillar.functions.values;


public class Fecha {




    public static String getDia(String fecha){
        String[] dia = fecha.split("/");
        return dia[0];
    }
    public static String getMes(String fecha){

        String[] mes = fecha.split("/");
        String[] nombres = {
                "Enero","Febrero","Marzo","Abril","Mayo","Junio",
                "Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"
        };
        return nombres[Integer.parseInt(mes[1]) - 1];
    }

    public static String getAno(String fecha){
        String[] ano = fecha.split("/");
        return ano[2];
    }


}
