import java.util.Random;

public class MatematicasLambda {
    public static double generarNumeroPiLambda(long pasos) {
        Random random = new Random();
        long aciertos = 0;

        for (long i = 0; i < pasos; i++) {
            double x = random.nextDouble();
            double y = random.nextDouble();
            if (x * x + y * y <= 1) {
                aciertos++;
            }
        }

        return 4.0 * aciertos / pasos;
    }
}
