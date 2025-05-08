import java.security.Provider;

public class Main {
    public static void main(String[] args) {
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        int[] lluvia = new int[12];
        lluvia[0] = 23; lluvia[1] = 26; lluvia[2] = 20; lluvia[3] = 22; lluvia[4] = 25;
        lluvia[5] = 22; lluvia[6] = 26; lluvia[7] = 25; lluvia[8] = 22; lluvia[9] = 24;
        lluvia[10] = 26; lluvia[11] = 23;

        double prom = 0;
        int total = 0;
        for(int i = 0; i < lluvia.length; i++) {
            System.out.println("La lluvia en " + meses[i] + " es: " + lluvia[i] + " l/m²");

            total +=  lluvia[i];

            prom = total/12;

            System.out.println("total lluvia acumulada = " + total);
            System.out.println(("el promedio de lluvia mansual = " + prom ));

        }

    }
}