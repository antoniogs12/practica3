import java.util.stream.IntStream;

public class MatematicasLambda {
    public static double generarNumeroPiLambda(long pasos) {
        long aciertos = IntStream.range(0, (int) pasos)
            .parallel()
            .filter(i -> {
                double x = Math.random();
                double y = Math.random();
                return Math.pow(x, 2) + Math.pow(y, 2) <= 1;
            })
            .count();
        return 4.0 * aciertos / pasos;
    }
}

















