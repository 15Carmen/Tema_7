package Fecha.Main;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class fecha {

    public static void main(String[] args) {

        //fecha del dia
        Date fecha1 = new Date();
        System.out.println(fecha1);

        //crear fecha con parámetros para el 01/01/2000. Como Java fue creada en 1900, para obtener el año debemos
        //sumarle a 1900 los años que necesitemos hasta tener el que queremos.
        Date fecha2 = new Date(100, 1, 1);
        System.out.println(fecha2);

        //crear fecha con parámetros para el 28/12/2021 a las 10h, 6 min y 56 s
        Date fecha3 = new Date(121, 11, 29, 24, 06, 56);
        System.out.println(fecha3);

        //para poner un año anterior al 1900 restamos los años que queramos
        Date fecha4 = new Date(-121, 11, 29, 10, 06, 56);
        System.out.println(fecha4);

        //extraer cada parte de la fecha anterior
        System.out.println("Extraemos cada parte de la fecha 3");
        System.out.println("Año: " + fecha3.getYear());
        System.out.println("Mes: " + fecha3.getMonth());
        System.out.println("Dia: " + fecha3.getDate());
        System.out.println("Dia: " + fecha3.getDay());
        System.out.println("Horas: " + fecha3.getHours());
        System.out.println("Minutos: " + fecha3.getMinutes());
        System.out.println("Segundos: " + fecha3.getSeconds());

        //uso de after, before y compareTo
        //vamos a comparar fecha2 con fecha3

        System.out.println("Vamos a comparar fecha2 y fecha3 con before y after");
        System.out.println( "fecha2 "+fecha2);
        System.out.println( "fecha3 "+fecha3);
        System.out.println("la fecha2 es menor que la fecha3? " + fecha2.before(fecha3));
        System.out.println("la fecha2 es mayor que la fecha3? " + fecha2.after(fecha3));
        switch (fecha2.compareTo(fecha3)){
            case 1:
                System.out.println("fecha2 es mayor que la fecha3");
                break;
            case -1:
                System.out.println("fecha2 es mayor que la fecha3");
                break;
            case 0:
                System.out.println("las fechas son iguales");
                break;
        }

        //SimpleDateFormat

        System.out.println(fecha3);
        SimpleDateFormat fechaNueva = new SimpleDateFormat(" 'Día, mes y año ' dd/MM/yyyy " +
                "'Horas, minutos y segundos' h:m:s a");
        System.out.println(fechaNueva.format(fecha3));

        //ejercicioPresentación
        SimpleDateFormat sevilla = new SimpleDateFormat(" 'En Sevilla a 'EEEE', 'dd 'de 'MMMM 'de 'yyyy");
        System.out.println(sevilla.format(fecha4));

        //clase getCalendar



        Date fecha5 = new Date(100, 10, 23);
        SimpleDateFormat formatoFecha = new SimpleDateFormat(" 'En Sevilla a 'EEEE', 'dd 'de 'MMMM 'de 'yyyy");
        System.out.println(formatoFecha.format(fecha5));

    }
}
