package dominio;

public class Director extends Persona{
    
    public Director(String nombre, String apellidos){
        super(nombre, apellidos);
    }
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("Nombre: ").append(nombre).append("\n").append("Apellidos: ").append(apellidos);
        return sb.toString();
    }
}
