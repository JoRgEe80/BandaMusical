package dominio;

public class Musico extends Persona{
    protected String instrumento;

    public Musico(String nombre, String apellidos, String instrumento){
        super(nombre, apellidos);
        this.instrumento=instrumento;
    }
    public String getInstrumento(){
        return instrumento;
    }
    public void SetInstrumento(String instrumento_){
        instrumento=instrumento_;
    }
    public String toString(){
        StringBuilder sb= new StringBuilder();
        sb.append("Nombre: ").append(nombre).append("\n").append("Apellidos: ").append(apellidos).append("\n")
        .append("Instrumento: ").append(instrumento);
        return sb.toString();
    }
    
}
