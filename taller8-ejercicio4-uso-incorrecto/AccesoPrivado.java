// EJERCICIO 4 - PARTE 2: Acceso a atributo private de la clase base
// Para ver el error, descomenta la linea marcada y compila.
// Error esperado: marca has private access in Vehiculo

class Vehiculo {
    private String marca;

    public Vehiculo(String marca) {
        this.marca = marca;
    }

    // Solucion correcta: un getter publico (o declarar el atributo protected)
    public String getMarca() {
        return marca;
    }
}

class Coche extends Vehiculo {
    public Coche(String marca) {
        super(marca);
    }

    public void mostrarMarca() {
        // System.out.println(marca);          // ERROR: 'marca' tiene acceso privado
        System.out.println(getMarca());        // CORRECTO: usando el getter publico
    }
}

public class AccesoPrivado {
    public static void main(String[] args) {
        new Coche("Renault").mostrarMarca();
    }
}
