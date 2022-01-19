package Metodos.Enumerado;

enum DiasSemana {LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO};

public class Main {

    public static void main(String[] args) {

        //llenamos la tabla de dias con valores
        //se puede hacer asi:
        //      DiasSemana[] tablaDias = DiasSemana.values();
        //o así:
                DiasSemana tablaDias[];
                tablaDias = DiasSemana.values();
        //recorremos el enumerado indicando la posicion con for
        System.out.println("Recorremos la tabla con un for ");
        for (int i = 0; i<tablaDias.length; i++){
            System.out.println(tablaDias[i] + "es el dia del indice" + i);
        }

        System.out.println("Recorremos la tabla con un foreach");

    }
}
