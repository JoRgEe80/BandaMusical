package dominio;

import java.math.BigDecimal;

public class MusicoRefuerzo extends Musico{
    protected BigDecimal sueldo;
    public MusicoRefuerzo(String nombre, String apellidos, String instrumento, BigDecimal sueldo){
        super(nombre, apellidos, instrumento);
        this.sueldo=sueldo;
    }
    public BigDecimal getSueldo(){
        return sueldo;
    }
    public void setSueldo(BigDecimal sueldo){
        this.sueldo=sueldo;
    }
    public String toString(){
        StringBuilder sb= new StringBuilder();
        sb.append("Nombre: ").append(nombre).append("\n").append("Apellidos: ").append(apellidos).append("\n")
        .append("Instrumento: ").append(instrumento).append("\n").append("Sueldo: ").append(sueldo);
        return sb.toString();
    }
    
}
