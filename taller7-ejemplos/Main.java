public class Main {
    public static void main(String[] args) {
        System.out.println("=== Uso correcto 1: Coche (privado + métodos públicos) ===");
        Coche coche = new Coche("Toyota", 180);
        coche.mostrarInformacion();
        coche.setVelocidadMaxima(220);   // válido
        coche.setVelocidadMaxima(-50);   // se ignora por la validación
        coche.mostrarInformacion();
        System.out.println("Marca: " + coche.getMarca());
        // coche.marca = "BMW";          // ERROR de compilación: marca es private

        System.out.println("\n=== Uso correcto 2: Utilidades (método público estático) ===");
        Utilidades.imprimirMensaje("Hola desde un método público y estático");

        System.out.println("\n=== Persona (clase y atributo públicos) ===");
        Persona p = new Persona("Juan");
        p.mostrarNombre();
        p.nombre = "Pedro"; // permitido porque nombre es public
        p.mostrarNombre();

        System.out.println("\n=== Mala práctica (compila): saldo público ===");
        CuentaBancariaInsegura cuenta = new CuentaBancariaInsegura(1000);
        cuenta.saldo = -999999; // nadie lo impide: saldo inválido
        System.out.println("Saldo manipulado sin control: " + cuenta.saldo);
    }
}
