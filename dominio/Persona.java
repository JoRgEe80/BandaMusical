package dominio;

import java.io.Serializable;

public class Persona implements Serializable {
    protected String nombre;
    protected String apellidos;
    public Persona(String nombre_, String apellidos_){
        nombre_=nombre;
        apellidos_=apellidos;
    }
    public void setNombre(String nombre_){
        nombre_=nombre;
    }
    public void setApellidos(String apellidos_){
        apellidos_=apellidos;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellidos(){
        return apellidos;
    }
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("Nombre: ").append(nombre).append("\n").append("Apellidos: ").append(apellidos);
        return sb.toString();
    }
}
