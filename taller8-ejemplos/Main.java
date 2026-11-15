public class Main {
    public static void main(String[] args) {
        System.out.println("=== Correcto 1: Animal y Perro ===");
        Animal a = new Animal("Generico");
        a.emitirSonido();
        Perro p = new Perro("Canino", "Labrador");
        p.mostrarEspecie();   // heredado
        p.emitirSonido();     // sobrescrito
        p.ladrar();           // propio

        System.out.println("\n=== Correcto 2: Empleado y Gerente ===");
        Gerente g = new Gerente("Luis", 5000000, "Sistemas");
        g.mostrarDetalles();

        System.out.println("\n=== Mala practica (compila): no usar super con datos ===");
        Perro2 p2 = new Perro2("Criollo");
        System.out.println("Especie heredada: " + p2.getEspecie() + " (deberia ser Canino)");
    }
}
