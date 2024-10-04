package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        
    Vehiculo vehiculo1 = new Vehiculo("ABC123", "toyota", "azul", "automatico", 50.000, 2022);
    Vehiculo vehiculo2 = new Vehiculo("jdh364", "mazda", "negro", "estandar", 0.0, 2024);
    Vehiculo vehiculo3 = new Vehiculo("kjh283", "ford", "blanco", "automatico", 0.0, 2023);
    Propietario propietario = new Propietario("luis jaramillo", "3984738");

    Taller taller = new Taller("autosport", propietario);
    taller.agregarVehiculo(vehiculo1);
    taller.agregarVehiculo(vehiculo2);
    taller.agregarVehiculo(vehiculo3);

    Taller.mostrarMensaje (taller.toString());
    }
}
