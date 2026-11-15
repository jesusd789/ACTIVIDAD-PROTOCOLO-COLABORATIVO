public class PruebaCuentaBancaria {
    public static void main(String[] args) {
        CuentaBancaria c = new CuentaBancaria("123-456", 1000, "Ahorros");
        c.mostrarDetalles();
        c.setSaldo(1500);
        c.setSaldo(-20);   // rechazado
        c.mostrarDetalles();
        c.tipoCuenta = "Corriente"; // permitido: tipoCuenta es public
        System.out.println("Tipo cambiado: " + c.tipoCuenta);

        // Descomenta la siguiente linea para observar el ERROR de compilacion:
        // System.out.println(c.numeroCuenta);
        // error: numeroCuenta has private access in CuentaBancaria
    }
}
