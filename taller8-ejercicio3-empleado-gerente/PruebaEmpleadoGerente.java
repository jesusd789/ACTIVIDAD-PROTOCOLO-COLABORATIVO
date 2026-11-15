public class PruebaEmpleadoGerente {
    public static void main(String[] args) {
        Empleado e = new Empleado("Sofia", 3000000);
        e.mostrarDetalles();

        Gerente g = new Gerente("Andres", 7000000, "Finanzas");
        g.mostrarDetalles();
    }
}
