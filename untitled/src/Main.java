import java.security.Provider;

public class Main {
    public static void main(String[] args) {
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        /*int[] lluvia = new int[12];
        lluvia[0] = 23; lluvia[1] = 26; lluvia[2] = 20; lluvia[3] = 22; lluvia[4] = 25;
        lluvia[5] = 22; lluvia[6] = 26; lluvia[7] = 25; lluvia[8] = 22; lluvia[9] = 24;
        lluvia[10] = 26; lluvia[11] = 23;
*/
        String[] ciudades = {"Quito", "Cuenca", "Guayaquil"};

        int[][] lluvia = {
                {23, 15, 34, 51, 68, 20, 10, 15, 120, 180, 90, 68},      // Quito
                {18, 20, 30, 51, 43, 22, 8, 15, 115, 175, 93, 72},       // Cuenca
                {24, 16, 25, 50, 31, 14, 9, 19, 120, 130, 73, 58}        // Guayaquil
        };

        int totalGeneral = 0;
        double promedioGeneral = 0;

        for (int ciudad = 0; ciudad < ciudades.length; ciudad++) {
            int totalCiudad = 0;
            System.out.println("\n Lluvia mensual en " + ciudades[ciudad] + ":");
            for (int mes = 0; mes < meses.length; mes++) {
                System.out.println(" - " + meses[mes] + ": " + lluvia[ciudad][mes] + " l/m²");
                totalCiudad += lluvia[ciudad][mes];
            }

            double promedioCiudad = (double) totalCiudad / 12;
            totalGeneral += totalCiudad;
            promedioGeneral += promedioCiudad;

            System.out.println("Total acumulado en " + ciudades[ciudad] + ": " + totalCiudad + " l/m²");
            System.out.println("Promedio mensual en " + ciudades[ciudad] + ": " + promedioCiudad + " l/m²");
        }

        System.out.println("\n TOTAL acumulado entre todas las ciudades: " + totalGeneral + " l/m²");

        promedioGeneral /= ciudades.length;
        System.out.println(" PROMEDIO  general mensual entre todas las ciudades: " + promedioGeneral + " l/m²");
    }
}