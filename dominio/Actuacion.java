package dominio;

import java.time.LocalDate;

public class Actuacion{
    private LocalDate fecha;
    private Director director;
    private MusicoSocio musicoSocio;
    private MusicoRefuerzo musicoRefuerzo;

    public Actuacion(LocalDate fecha_, Director director_, MusicoSocio musicoSocio_, MusicoRefuerzo musicoRefuerzo_){
        fecha=fecha_;
        director=director_;
        musicoSocio=musicoSocio_;
        musicoRefuerzo=musicoRefuerzo_;
    }
    public void setFecha(LocalDate fecha_){
        fecha=fecha_;
    }
    public LocalDate getFecha(){
        return fecha;
    }

    
}
