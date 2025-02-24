public class Principal {
    public static void main(String[] args) {
        long pasos = Long.parseLong(args[0]);
        double pi = MatematicasLambda.generarNumeroPiLambda(pasos);
        System.out.println("El número PI es " + pi);
    }
}
