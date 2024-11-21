package dominio;

public class MusicoSocio extends Musico {
    protected String numeroSocio;
    public MusicoSocio(String nombre, String apellidos, String instrumento, String numeroSocio){
        super(nombre, apellidos, instrumento);
        this.numeroSocio=numeroSocio;
    }
    public void setNumeroSocio(String numeroSocio_){
        numeroSocio=numeroSocio_;
    }
    public String getNumeroSocio(){
        return numeroSocio;
    }
    public String toString(){
        StringBuilder sb= new StringBuilder();
        sb.append("Nombre: ").append(nombre).append("\n").append("Apellidos: ").append(apellidos).append("\n")
        .append("Instrumento: ").append(instrumento).append("\n").append("Numero de socio: ").append(numeroSocio);
        return sb.toString();
    }
    
}
