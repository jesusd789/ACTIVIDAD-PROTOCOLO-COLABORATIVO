public class PruebaUtilidades {
    public static void main(String[] args) {
        System.out.println("10 + 5 = " + Utilidades.suma(10, 5));
        System.out.println("10 - 5 = " + Utilidades.resta(10, 5));
        System.out.println("10 * 5 = " + Utilidades.multiplicacion(10, 5));
        System.out.println("10 / 5 = " + Utilidades.division(10, 5));
        try {
            Utilidades.division(10, 0);
        } catch (IllegalArgumentException ex) {
            System.out.println("Error controlado: " + ex.getMessage());
        }
    }
}
