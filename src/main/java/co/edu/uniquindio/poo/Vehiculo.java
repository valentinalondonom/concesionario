package co.edu.uniquindio.poo;

public class Vehiculo {
    private String numeroRegistro;
    private String marca;
    private String color;
    private String trasmision;
    private double kilometraje;
    private int modelo;

    public Vehiculo(String numeroRegistro, String marca, String color, String trasmision, double kilometraje, int modelo){
       this.numeroRegistro= numeroRegistro;
       this.marca = marca;
       this.color = color;
       this.trasmision = trasmision;
       this.kilometraje = kilometraje;
       this.modelo = modelo;
       assert !numeroRegistro.isBlank();
       assert !marca.isBlank();
       assert !color.isBlank();
       assert !trasmision.isBlank();
       assert kilometraje>0;
       assert modelo >0;
    }

    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public String getTrasmision() {
        return trasmision;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public int getModelo() {
        return modelo;
    }

    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTrasmision(String trasmision) {
        this.trasmision = trasmision;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Vehiculo placa: " + numeroRegistro + ", marca=" + marca + ", color=" + color + ", trasmision="
                + trasmision + ", kilometraje=" + kilometraje + ", modelo=" + modelo + "]";
    }

     public static void mostrarMensaje (String mensaje){
        System.out.println (mensaje);
     }
    
}
