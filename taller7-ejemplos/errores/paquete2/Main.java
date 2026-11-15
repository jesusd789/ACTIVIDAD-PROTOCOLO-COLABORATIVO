// Paquete: paquete2
package paquete2;

import paquete1.Persona; // ERROR de compilación: Persona no es public (acceso de paquete)

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("Juan"); // ERROR: Persona no es visible fuera de paquete1
    }
}
