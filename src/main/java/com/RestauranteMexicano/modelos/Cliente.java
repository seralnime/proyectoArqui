package main.java.com.RestauranteMexicano.modelos;

public class Cliente {

    private String nombre;
    private long ID;
    private String Licencia;

    public Cliente(){

    }
    public Cliente(String nombre, long ID, String Licencia){
        this.nombre = nombre;
        this.ID = ID;
        this.Licencia = Licencia;
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
}
