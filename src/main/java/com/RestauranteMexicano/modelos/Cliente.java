package main.java.com.RestauranteMexicano.modelos;

/**
    Santiago Sánchez Cárdenas
    Sergio Gabriel Nieto Meneses
    Mauricio Andres Valderrama Acosta
 */

public class Cliente {

    private String nombre;
    private long ID;
    private String Licencia;
    private String Direccion;
    public Cliente(){

    }
    public Cliente(String nombre, long ID, String Licencia, String Direccion){
        this.nombre = nombre;
        this.ID = ID;
        this.Licencia = Licencia;
        this.Direccion = Direccion;
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public long getID(){
        return this.ID;
    }
    public void setID(long ID){
        this.ID = ID;
    }
    public String getLicencia(){
        return this.Licencia;
    }
    public void setLicencia(String Lic){
        this.Licencia = Lic;
    }

    public String getDireccion() {
        return Direccion;
    }
    public void setDireccion(String direccion) {
        Direccion = direccion;
    }
}
