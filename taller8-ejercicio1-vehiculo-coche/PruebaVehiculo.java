public class PruebaVehiculo {
    public static void main(String[] args) {
        Vehiculo v = new Vehiculo("Genérico", 120);
        v.mostrarInformacion();

        Coche c = new Coche("Mazda", 200, 4);
        c.mostrarInformacion();
    }
}
