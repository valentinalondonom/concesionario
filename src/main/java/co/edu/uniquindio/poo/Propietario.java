package co.edu.uniquindio.poo;

public class Propietario {

        private String nombre;
        private String numeroIdentificacion;
    
        public Propietario (String nombre, String numeroIdentificacion){
            this.nombre=nombre;
            this.numeroIdentificacion=numeroIdentificacion;
        }
    
        public String getNombre() {
            return nombre;
        }
    
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    
        public String getNumeroIdentificacion() {
            return numeroIdentificacion;
        }
    
        public void setNumeroIdentificacion(String numeroIdentificacion) {
            this.numeroIdentificacion = numeroIdentificacion;
        }
    
        @Override
        public String toString() {
            return "El propietario es: " + nombre + ", y su numero de identificacion: " + numeroIdentificacion ;
    
        }
     
    }

